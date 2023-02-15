package controller;

import dto.ParkingRequestDTO;
import dto.ParkingResponseDTO;
import enums.ParkingLotType;
import model.ParkingLot;
import model.Ticket;
import service.ParkingLotService;
import service.TicketService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }
    public ParkingLot createParkingLot(ParkingLotType parkingLotType,int smallCapacity,int mediumCapacity,int largeCapacity){
    return parkingLotService.createParkingLot(parkingLotType,smallCapacity,mediumCapacity,largeCapacity);
    }
}
