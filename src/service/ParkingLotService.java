package service;

import enums.ParkingLotType;
import model.ParkingLot;
import model.ParkingSpot;
import repository.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }
    public ParkingLot createParkingLot(ParkingLotType parkingLotType,int smallCapacity, int mediumCapacity,int largeCapacity){
        ParkingLot parkingLot=new ParkingLot(parkingLotType,smallCapacity,mediumCapacity,largeCapacity);
        parkingLotRepository.save(parkingLot);
        return parkingLot;
    }
    public ParkingLot updateParkingLotById(Long id,ParkingLot parkingLotToUpdate){
    ParkingLot parkingLot=parkingLotRepository.getParkingLotById(id);
    return parkingLotRepository.updateById(id,parkingLot);
    }
}
