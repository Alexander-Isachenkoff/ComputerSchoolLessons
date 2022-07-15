package lesson2_classes.library;

import java.util.ArrayList;

public class Reader {
    private String name;
    private String address;
    private String phone;

    private ArrayList<BookRecord> bookRecords = new ArrayList<>();

    void addBookRecord(BookRecord bookRecord)
    {
        bookRecords.add(bookRecord);
    }
    public Reader(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    String getData() {
        String data = "";
        data += "Имя            " + name + "\n";
        data += "Адрес          " + address + "\n";
        data += "Номер телефона " + phone + "\n";
        data += "\n";
        for (BookRecord bookRecord : bookRecords){
            data += bookRecord.getRecordInfo();
        }

        return data;
    }
}
