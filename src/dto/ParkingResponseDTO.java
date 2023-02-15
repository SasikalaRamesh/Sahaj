package dto;

import java.util.Date;

public class ParkingResponseDTO {
    private Long ticketNUmber;
    private Long spotNumber;
    private Date entryTime;

    public Long getTicketNUmber() {
        return ticketNUmber;
    }

    public void setTicketNUmber(Long ticketNUmber) {
        this.ticketNUmber = ticketNUmber;
    }

    public Long getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Long spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "ParkingResponseDTO{" +
                "ticketNUmber=" + ticketNUmber +
                ", spotNumber=" + spotNumber +
                ", entryTime=" + entryTime +
                '}';
    }
}
