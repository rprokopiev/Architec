package Presenters;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface View {

    /*
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */

    void showTables(Collection<Table> tables);

    /*
     * отобразить результат бронирования столика
     * @param reservationNo номер брони
     */
    void showReservationTableResult(int reservationNo);

    /*
     * Утановить наблюдателя для представления
     * @param observer Наблюдатль
     */
    void setObserver(ViewObserver observer);

    /*
     * Событие: клиент нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name Имя клиента
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    /*
     * Событие: клиент нажал на кнопку изменения резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name Имя клиента
     */
    void changeReservationTable(int onReservation, Date reservationDate, int tableNo, String name);

}
