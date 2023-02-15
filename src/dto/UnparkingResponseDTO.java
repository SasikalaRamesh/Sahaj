package dto;

import java.util.Date;

public class UnparkingResponseDTO {
private String receiptNUmber;
private Date entryTime;
private Date exitTime;
private Double fees;

    public String getReceiptNUmber() {
        return receiptNUmber;
    }

    public void setReceiptNUmber(String receiptNUmber) {
        this.receiptNUmber = receiptNUmber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

}
