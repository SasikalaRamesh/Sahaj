package strategy;

import enums.ParkingSpotStatus;
import enums.ParkingSpotType;
import model.ParkingLot;
import model.ParkingSpot;
import model.Ticket;
import repository.TicketRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    private ParkingLot parkingLot;
    private TicketRepository ticketRepository;
    private Ticket ticket;

    public RandomSpotAssignmentStrategy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public RandomSpotAssignmentStrategy(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public RandomSpotAssignmentStrategy(ParkingLot parkingLot, TicketRepository ticketRepository) {
        this.parkingLot = parkingLot;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public ParkingSpot assignSpot(ParkingSpotType parkingSpotType) {
        for (ParkingSpot parkingSpot : parkingLot.generateParkingSpots()) {
            if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.VACANT)
                    && parkingSpot.getParkingSpotType().equals(parkingSpotType)) {
                List<Ticket> values = ticketRepository.getTicketMap().entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
                boolean isVacant = true;
                for (Ticket ticket1 : values) {
                    if ((ticket1.getParkingSpot().getParkingSpotNo()) == parkingSpot.getParkingSpotNo()) {
                        isVacant = false;

                    }

                }
                if (isVacant) {
                    return parkingSpot;
                }

                System.out.println("No space available");
                return null;


            }
        }
        return null;
    }
}
