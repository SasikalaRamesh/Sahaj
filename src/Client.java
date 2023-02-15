import controller.ParkingLotController;
import controller.TicketController;
import dto.ParkingRequestDTO;
import dto.UnparkingRequestDTO;
import dto.UnparkingResponseDTO;
import enums.ParkingLotType;
import enums.ParkingSpotType;
import model.ParkingLot;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import service.ParkingLotService;
import service.TicketService;
import service.UnparkingService;
import strategy.RandomSpotAssignmentStrategy;

public class Client {
    public static void main(String[] args) {
        //Create Parking Spots
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        ParkingLotService parkingLotService=new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController=new ParkingLotController(parkingLotService);
        ParkingLot mallParkingLot=parkingLotController.createParkingLot(ParkingLotType.MALL,1,10,10);
        printIfNotNull(mallParkingLot);
        //Parking
        TicketRepository ticketRepository=new TicketRepository();
        TicketService ticketService=new TicketService(ticketRepository,new RandomSpotAssignmentStrategy(mallParkingLot,ticketRepository),parkingLotRepository);
        TicketController ticketController=new TicketController(ticketService);
        ParkingRequestDTO parkingRequestDTO=new ParkingRequestDTO();
        parkingRequestDTO.setParkingSpotType(ParkingSpotType.SMALL);
        printIfNotNull(ticketController.generateTicket(parkingRequestDTO));
        parkingRequestDTO.setParkingSpotType(ParkingSpotType.SMALL);
        printIfNotNull(ticketController.generateTicket(parkingRequestDTO));
        //Unparking
        UnparkingService unparkingService=new UnparkingService(ticketRepository);
        UnparkingRequestDTO unparkingRequestDTO=new UnparkingRequestDTO();
        unparkingRequestDTO.setTicketNumber(1);
        UnparkingResponseDTO unparkingResponseDTO=new UnparkingResponseDTO();
        printIfNotNull(unparkingService.unParking(unparkingRequestDTO,mallParkingLot.getParkingLotType()));
        unparkingRequestDTO.setTicketNumber(2);
        printIfNotNull(unparkingService.unParking(unparkingRequestDTO,mallParkingLot.getParkingLotType()));

    }
    public static <T> void printIfNotNull(T object) {
        if (object != null) {
            System.out.println(object.toString());
        }
    }
}
