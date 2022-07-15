package lesson2_classes.library;

public class Books {
    private String name;
    private String author;
    private int id;
    private int year;
    private int pages;
    private Section section;

    public Books() {
        this.name = name;
        this.author = author;
        this.id = id;
        this.year = year;
        this.pages = pages;
        this.section = section;
    }

    String getInfo() {
        String info = "";
        info += "Название " + name + "\n";
        info += "Автор " + author + "\n";
        info += "Регистрационный номер" + id + "\n";
        info += "Год издания " + year + "\n";
        info += "Кол-во страниц " + pages + "\n";
        info += "Раздел " + section.sectionName + "\n";

        System.out.println("Добавьте книгу");
        System.out.println("Введите название:");
        return info;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void add(Books books) {
    }
}
