import java.util.Date;

import Models.TableModel;
import Presenters.BookingPresenter;
import Presenters.Model;
import Presenters.View;
import Views.BookingView;

public class Main {

    public static void main(String[] args) {
        
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2,"Name");

        view.changeReservationTable(1001, new Date(), 3, "NewName");
    }

}
