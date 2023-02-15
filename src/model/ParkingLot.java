package model;

import enums.ParkingLotType;
import enums.ParkingSpotStatus;
import enums.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel{
    private ParkingLotType parkingLotType;
    private List<ParkingSpot> parkingSpots;

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotType=" + parkingLotType +
                ", parkingSpots=" + parkingSpots +
                '}';
    }

    public ParkingLot(ParkingLotType parkingLotType,int smallCapacity,int mediumCapacity,int largeCapacity) {
        this.parkingLotType = parkingLotType;
        this.parkingSpots = generateParkingSpots(smallCapacity,mediumCapacity,largeCapacity);
    }

    public List<ParkingSpot> generateParkingSpots(int smallCapacity, int mediumCapacity, int largeCapacity) {
        int spot=1;
        List<ParkingSpot> tempParkingSpots=new ArrayList<>();
        for(int i=0;i<smallCapacity;i++){
            tempParkingSpots.add(new ParkingSpot(ParkingSpotType.SMALL,spot++, ParkingSpotStatus.VACANT));
        }
        for(int i=0;i<mediumCapacity;i++){
            tempParkingSpots.add(new ParkingSpot(ParkingSpotType.MEDIUM,spot++,ParkingSpotStatus.VACANT));
        }
        for(int i=0;i<largeCapacity;i++){
            tempParkingSpots.add(new ParkingSpot(ParkingSpotType.LARGE,spot++,ParkingSpotStatus.VACANT));
        }
        return tempParkingSpots;
    }

    public ParkingLotType getParkingLotType() {
        return parkingLotType;
    }

    public void setParkingLotType(ParkingLotType parkingLotType) {
        this.parkingLotType = parkingLotType;
    }

    public List<ParkingSpot> generateParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
