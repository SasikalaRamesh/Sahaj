package model;

import java.util.Date;

public class Receipt {
    private String receiptNumber;
    private Date entryTime;
    private Date exitTime;
    private int fee;

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptNumber='" + receiptNumber + '\'' +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", fee=" + fee +
                '}';
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
