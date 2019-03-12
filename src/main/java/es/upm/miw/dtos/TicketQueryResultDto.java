package es.upm.miw.dtos;

import es.upm.miw.documents.Ticket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TicketQueryResultDto {

    private String id;

    private LocalDateTime creationDate;

    private BigDecimal total;

    public TicketQueryResultDto() {}

    public TicketQueryResultDto(Ticket ticket) {
        this.id = ticket.getId();
        this.creationDate = ticket.getCreationDate();
        this.total = ticket.getTotal();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TicketQueryResultDto{" +
                "id='" + id +
                ", creationDate=" + creationDate +
                ", total=" + total +
                '}';
    }
}
