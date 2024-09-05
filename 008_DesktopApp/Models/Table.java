package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    public int getNo() {
        return no;
    }

    private static int counter = 0;

    private final int no;

    public Collection<Reservation> getReservations() {
        return reservations;
    }
    
    private final Collection<Reservation> reservations = new ArrayList<>();

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик №%d", no);
    }

}
