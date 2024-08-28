/*
 * Покупатель
 */

import java.util.Collection;

public class Customer {

    private static int counter; // для удобства создания покупателей

    private final int id;

    private Collection<Ticket> tickets; 

    // инициализатор - для удобства созвдания покупателей
    {
        id = ++counter;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }



}
