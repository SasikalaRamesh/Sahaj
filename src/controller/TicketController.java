package controller;

import dto.ParkingRequestDTO;
import dto.ParkingResponseDTO;
import model.Ticket;
import service.TicketService;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public ParkingResponseDTO generateTicket(ParkingRequestDTO parkingRequestDTO){
        Ticket ticket=ticketService.generateTicket(parkingRequestDTO);
        if(ticket == null)
            return null;
        ParkingResponseDTO parkingResponseDTO=new ParkingResponseDTO();
        parkingResponseDTO.setTicketNUmber(ticket.getId());
        parkingResponseDTO.setSpotNumber(ticket.getParkingSpot().getParkingSpotNo());
        parkingResponseDTO.setEntryTime(ticket.getEntryTime());
        return parkingResponseDTO;
    }


}
