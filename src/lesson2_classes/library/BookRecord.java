package lesson2_classes.library;

import java.util.ArrayList;

public class BookRecord {
    private Book book;
    private String dataTaken;
    private String dataReturn;

    public BookRecord (Book book, String dataTaken, String dataReturn){
        this.book = book;
        this.dataTaken = dataTaken;
        this.dataReturn = dataReturn;
    }

    String getRecordInfo() {
        String record = "";
        record += "Книга         " + book.getName() + "\n";
        record += "Дата взятия   " + dataTaken + "\n";
        record += "Дата возврата " + dataReturn + "\n";
        return record;
    }
}
