package service;

import dto.ParkingRequestDTO;
import model.ParkingSpot;
import model.Ticket;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import strategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private final TicketRepository ticketRepository;
    private final SpotAssignmentStrategy spotAssignmentStrategy;
    private final ParkingLotRepository parkingLotRepository;

    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }
    public Ticket generateTicket(ParkingRequestDTO parkingRequestDTO){
        //get parking spot
        //find the parking spot
        ParkingSpot parkingSpot=this.spotAssignmentStrategy.assignSpot(parkingRequestDTO.getParkingSpotType());
        if(parkingSpot == null){
            return null;
        }
        Ticket ticket=new Ticket();
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(new Date());
        return this.ticketRepository.save(ticket);
    }
}
