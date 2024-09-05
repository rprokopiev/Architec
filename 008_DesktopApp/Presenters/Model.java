package Presenters;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

}
