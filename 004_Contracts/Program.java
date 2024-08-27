import java.sql.Date;
import java.util.Collection;

public class Program {
    /*
     * Разработать контракты и компоненты системы 
     * "Покупка онлайн билетов на автобус в час пик"
     * 1. предусловия
     * 2. постусловия.
     * 3. инвариант
     * 4. определить абстрактные и кокретные классы.
     * 5. определить интерфейсы.
     * 6. реализовать наследование.
     * 7. выявить компоненты.
     * 8. разрабоать диаграмму компонент используя нотацию UML 2.0. общая без деталей.
     */

    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (mobileApp.buyTicket("123487")){
            mobileApp.searchTicket(new Date(0));
            Collection<Ticket> tickets = mobileApp.getTickets();
            busStation.checkTicket(tickets.stream().findFirst().get().getQrcode());
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())){
                System.out.println("Клиент успешно прошёл в автобус.");
            }
        }


        
    }

}
