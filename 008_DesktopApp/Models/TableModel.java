package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Presenters.Model;

public class TableModel implements Model{

    private Collection<Table> tables;

    // получение списка всех столиков
    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /*
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Ошибка бронирования. Повторите позже.");
    }

    /*
     * Действие клиента (изменение резерва)
     * @param oldReservation идентификатор брони (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        if (oldReservation > 0) {
            return reservationTable(reservationDate, tableNo, name);
        }
        throw new RuntimeException("Ошибка изменения брони. Повторите позже.");
    }

}
