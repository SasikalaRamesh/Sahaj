package model;

import enums.ParkingLotType;
import enums.VehicleType;

import java.util.Date;

public class Ticket extends BaseModel{
private Vehicle vehicle;
private ParkingSpot parkingSpot;
private Date entryTime;

    public ParkingLotType getParkingLotType() {
        return parkingLotType;
    }

    public void setParkingLotType(ParkingLotType parkingLotType) {
        this.parkingLotType = parkingLotType;
    }

    private ParkingLotType parkingLotType;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                ", entryTime=" + entryTime +
                ", parkingLotType=" + parkingLotType +
                '}';
    }
}
