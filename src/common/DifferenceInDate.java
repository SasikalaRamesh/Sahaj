package common;

import java.time.*;
import java.util.Date;

public class DifferenceInDate {
    private int days;
    private int years;

    private long hours;
    public DifferenceInDate(Date entryTime,Date exitTime){
        LocalDate startDate = LocalDate.ofInstant(entryTime.toInstant(), ZoneId.systemDefault());
        LocalDate endDate=LocalDate.ofInstant(exitTime.toInstant(), ZoneId.systemDefault());
        Period period = Period.between(startDate,endDate);
            days= period.getDays();
            years= period.getYears();

        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atStartOfDay();
        Duration duration = Duration.between(startDateTime, endDateTime);
         hours = duration.toHours();

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }
}
