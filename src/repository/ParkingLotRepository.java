package repository;

import model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap=new HashMap<>();
    private long lastCount=0;
    public ParkingLot save(ParkingLot parkingLot){
        lastCount++;
        parkingLotMap.put(lastCount,parkingLot);
        return parkingLot;
    }
public ParkingLot updateById(Long id,ParkingLot parkingLot){
parkingLotMap.replace(id,parkingLot);
return parkingLot;
}
public ParkingLot getParkingLotById(Long id){
        return parkingLotMap.get(id);
}
}
