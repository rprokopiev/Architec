package Presenters;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public class BookingPresenter implements ViewObserver{

    private final Model model;

    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return model.loadTables();
    }

    /*
     * Отобразить список столиков (на представлении)
     */
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    public void updateUIShowReservationResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    /*
     * Произошло событие, пользователь резервирует столик
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo);
        }
        catch(RuntimeException e) {
            updateUIShowReservationResult(-1);
        }
        
        
    }

}
