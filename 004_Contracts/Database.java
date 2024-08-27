import java.util.ArrayList;
import java.util.Collection;
/*
 * Data Base
 */
public class Database {

    private static int counter;

    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database(){
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }
    
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /*
     * Получить актуальную стоимость билета
     * @return
     */
    public double getTicketAmount(){
        return 45;
    }

     /*
     * Получить идентификатор заявки на покупку билета
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }
}
