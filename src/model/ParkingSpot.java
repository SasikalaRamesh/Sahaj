package model;

import enums.ParkingSpotStatus;
import enums.ParkingSpotType;

public class ParkingSpot extends BaseModel{
    private ParkingSpotType parkingSpotType;
    private long parkingSpotNo;
    private ParkingSpotStatus parkingSpotStatus;

    public ParkingSpot(ParkingSpotType parkingSpotType, int parkingSpotNo, ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotType = parkingSpotType;
        this.parkingSpotNo = parkingSpotNo;
        this.parkingSpotStatus = parkingSpotStatus;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotType=" + parkingSpotType +
                ", parkingSpotNo=" + parkingSpotNo +
                ", parkingSpotStatus=" + parkingSpotStatus +
                '}';
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public long getParkingSpotNo() {
        return parkingSpotNo;
    }

    public void setParkingSpotNo(int parkingSpotNo) {
        this.parkingSpotNo = parkingSpotNo;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
