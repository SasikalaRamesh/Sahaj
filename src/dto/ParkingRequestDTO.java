package dto;

import enums.ParkingSpotType;

public class ParkingRequestDTO {
    private ParkingSpotType parkingSpotType;

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
