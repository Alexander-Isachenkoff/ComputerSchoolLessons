package lesson2_classes.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public String getBooksInfo(){
        String booksInfo = "";
        for (Book b : books)
        {
            booksInfo = booksInfo + "\n\n" +  b.getInfo();
        }
        return booksInfo;
    }

    public void addReader(Reader reader)
    {
        readers.add(reader);
    }
    public String getReadersInfo()
    {
        String readerInfo = "";
        for (Reader r : readers)
        {
            readerInfo = readerInfo + "\n" + r.getData();
        }
        return readerInfo;
    }
}
