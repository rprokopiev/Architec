package Views;

import java.util.Collection;
import java.util.Date;

import Models.Table;
import Presenters.View;
import Presenters.ViewObserver;

public class BookingView implements View{

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    /*
     * Действие клиента (бронирование столика)
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        if (observer != null){
            observer.onReservationTable(orderDate, tableNo, name);

        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик забронирован. Номер брони: %d\n", reservationNo);
        }
        else {
            System.out.println("Ошибка, попробуйте позже");
        }   
    }

    /*
     * Действие клиента (изменение резерва)
     * @param oldReservation идентификатор брони (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void changeReservationTable(int onReservation, Date reservationDate, int tableNo, String name){
        if (onReservation > 0) {
            reservationTable(reservationDate, tableNo, name);
        }
    }
}
