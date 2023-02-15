package strategy;

import common.DifferenceInDate;
import enums.ParkingLotType;
import enums.ParkingSpotType;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class StadiumFeeCalculationStrategy implements FeeCalculationStrategy{
    @Override
    public int feeCalculation(ParkingLotType parkingLotType, ParkingSpotType parkingSpotType, Date entryTime, Date exitTime) {
        DifferenceInDate differenceInDate=new DifferenceInDate(entryTime,exitTime);
if(parkingSpotType.equals(ParkingSpotType.SMALL)) {
    if (differenceInDate.getYears() > 0 || differenceInDate.getDays() > 0 || differenceInDate.getHours() >12) {
        return 100;
    }
    else if(differenceInDate.getHours() >0 && differenceInDate.getHours()<= 4){
        return 30;
    }
    else if(differenceInDate.getHours() >4 && differenceInDate.getHours()<= 12){
        return 60;
    }
}
if(parkingSpotType.equals(ParkingSpotType.MEDIUM)) {
            if (differenceInDate.getYears() > 0 || differenceInDate.getDays() > 0 || differenceInDate.getHours() >12) {
                return 200;
            }
            else if(differenceInDate.getHours() >0 && differenceInDate.getHours()<= 4){
                return 60;
            }
            else if(differenceInDate.getHours() >4 && differenceInDate.getHours()<= 12){
                return 120;
            }
        }
        return 0;
    }
}
