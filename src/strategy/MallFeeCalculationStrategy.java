package strategy;

import enums.ParkingLotType;
import enums.ParkingSpotType;

import java.util.Date;

public class MallFeeCalculationStrategy implements FeeCalculationStrategy{
    @Override
    public int feeCalculation(ParkingLotType parkingLotType, ParkingSpotType parkingSpotType, Date entryTime, Date exitTime) {
        if(parkingSpotType.equals(ParkingSpotType.SMALL)){
            return 10;
        }
        if(parkingSpotType.equals(ParkingSpotType.MEDIUM)){
            return 20;
        }
        if(parkingSpotType.equals(ParkingSpotType.LARGE)){
            return 50;
        }
        return 0;
    }
}
