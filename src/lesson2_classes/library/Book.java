package lesson2_classes.library;

public class Book {
    private String name;
    private Author author;
    private int id;
    private int year;
    private int pages;
    private Section section;

    public Book(String name, Author author, int id, int year, int pages, Section section) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.year = year;
        this.pages = pages;
        this.section = section;
    }

    String getInfo() {
        String info = "";
        info += "Название              " + name + "\n";
        info += "---Автор---           \n" + author.getAuthorInfo() + "\n";
        info += "-----------\n";
        info += "Регистрационный номер " + id + "\n";
        info += "Год издания           " + year + "\n";
        info += "Кол-во страниц        " + pages + "\n";
        info += "Раздел                " + section.sectionName;

        return info;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
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
    public String getName(){
        return name;
    }
}
