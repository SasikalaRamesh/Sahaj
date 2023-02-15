package model;

import java.util.Date;

public class Bill extends BaseModel{
    private Ticket ticket;
    private int amount;
    private Date exitTime;
    private String invoiceNumber;

}
