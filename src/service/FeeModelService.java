package service;

import enums.ParkingLotType;
import enums.ParkingSpotType;
import strategy.AirportFeeCalculationStrategy;
import strategy.MallFeeCalculationStrategy;
import strategy.StadiumFeeCalculationStrategy;

import java.util.Date;

public class FeeModelService {

    public int feeModels(ParkingLotType parkingLotType, ParkingSpotType parkingSpotType, Date entryTime, Date exitTime)
    {
        if(parkingLotType.equals(ParkingLotType.MALL)){
            MallFeeCalculationStrategy mallFeeCalculationStrategy=new MallFeeCalculationStrategy();
            return mallFeeCalculationStrategy.feeCalculation(parkingLotType,parkingSpotType,entryTime,exitTime);
        }
        if(parkingLotType.equals(ParkingLotType.STADIUM)){
            StadiumFeeCalculationStrategy stadiumFeeCalculationStrategy=new StadiumFeeCalculationStrategy();
            return stadiumFeeCalculationStrategy.feeCalculation(parkingLotType,parkingSpotType,entryTime,exitTime);
        }
        if(parkingLotType.equals(ParkingLotType.AIRPORT)){
            AirportFeeCalculationStrategy airportFeeCalculationStrategy=new AirportFeeCalculationStrategy();
            return airportFeeCalculationStrategy.feeCalculation(parkingLotType, parkingSpotType, entryTime, exitTime);
        }
        return 0;
    }

}
