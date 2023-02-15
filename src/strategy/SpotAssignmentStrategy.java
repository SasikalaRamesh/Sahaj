package strategy;

import enums.ParkingSpotType;
import model.ParkingSpot;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingSpotType parkingSpotType);
}
