package service;

import dto.UnparkingRequestDTO;
import enums.ParkingLotType;
import model.Receipt;
import model.Ticket;
import repository.TicketRepository;

import java.util.Date;

public class UnparkingService {
private int receiptNumber=0;
Date exitTime;
private TicketRepository ticketRepository;

    public UnparkingService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Receipt unParking(UnparkingRequestDTO unparkingRequestDTO, ParkingLotType parkingLotType){

        Long ticketNumber = (long) unparkingRequestDTO.getTicketNumber();
        Ticket ticket=ticketRepository.getTicketMap().get(ticketNumber);
        if(ticket==null){
            return null;
        }
        System.out.println();

        exitTime=new Date();
        receiptNumber++;
        Receipt receipt=new Receipt();
        receipt.setReceiptNumber("R-"+receiptNumber);
        receipt.setFee(new FeeModelService().feeModels(parkingLotType,ticket.getParkingSpot().getParkingSpotType(),ticket.getEntryTime(),exitTime));
        receipt.setEntryTime(ticket.getEntryTime());
        receipt.setExitTime(exitTime);
        return receipt;
    }
}
