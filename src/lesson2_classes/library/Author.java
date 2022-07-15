package lesson2_classes.library;

public class Author {
    private String name;
    private Country country;

    public Author(String name, Country country){
        this.name = name;
        this.country = country;
    }

    String getAuthorInfo(){
        String author = "";
        author += "Имя    " + name + "\n";
        author += "Страна " + country.getName();
        return author;
    }
}
