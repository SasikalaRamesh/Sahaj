package strategy;

import common.DifferenceInDate;
import enums.ParkingLotType;
import enums.ParkingSpotType;

import java.util.Date;

public class AirportFeeCalculationStrategy implements FeeCalculationStrategy{
    @Override
    public int feeCalculation(ParkingLotType parkingLotType, ParkingSpotType parkingSpotType, Date entryTime, Date exitTime) {
        DifferenceInDate differenceInDate=new DifferenceInDate(entryTime,exitTime);
        if(parkingSpotType.equals(ParkingSpotType.SMALL)) {
            if (differenceInDate.getYears() > 0 || differenceInDate.getDays() > 0) {
                return 80;
            }
            else if(differenceInDate.getHours() >0 && differenceInDate.getYears()<= 1){
                return 0;
            }
            else if(differenceInDate.getHours() >1 && differenceInDate.getHours()<= 8){
                return 40;
            }
            else if(differenceInDate.getHours() >8 && differenceInDate.getHours()<= 24){
                return 60;
            }
        }
        if(parkingSpotType.equals(ParkingSpotType.MEDIUM)) {
            if (differenceInDate.getYears() > 0 || differenceInDate.getDays() > 0) {
                return 100;
            }
            else if(differenceInDate.getHours() >0 && differenceInDate.getHours()<= 12){
                return 60;
            }
            else if(differenceInDate.getHours() >12 && differenceInDate.getHours()<= 24){
                return 80;
            }
        }
        return 0;
    }
}
