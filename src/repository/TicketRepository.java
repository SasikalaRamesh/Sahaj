package repository;

import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Long, Ticket> ticketMap=new HashMap<>();
    private long lastCount=0;
    public Ticket save(Ticket ticket){
        lastCount++;
        ticketMap.put(lastCount,ticket);
        ticket.setId(lastCount);
        return ticket;
    }
    public Ticket get(Long id){
        return ticketMap.get(id);
    }
    public Ticket updateById(Long id,Ticket ticket){
    ticketMap.replace(id,ticket);
    return ticket;
    }
    public void deleteById(Long id){
        ticketMap.remove(id);
    }
    public Map<Long, Ticket> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(Map<Long, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }
}
