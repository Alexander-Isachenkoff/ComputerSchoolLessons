package lesson2_classes.library;

public class Reader {
    private String name;
    private String address;
    private String phone;

    public Reader(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    String getData() {
        String data = "";
        data += "Имя " + name + "\n";
        data += "Адрес " + address + "\n";
        data += "Номер телефона" + phone + "\n";

        return data;
    }
}
