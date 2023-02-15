package strategy;

import enums.ParkingLotType;
import enums.ParkingSpotType;

import java.util.Date;

public interface FeeCalculationStrategy {

     int feeCalculation(ParkingLotType parkingLotType, ParkingSpotType parkingSpotType, Date entryTime, Date exitTime);
}
