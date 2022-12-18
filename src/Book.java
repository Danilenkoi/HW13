import java.util.Objects;
public class Book {

    private int year;
    private String title;
    private Author author;

    public Book(int year, String title, Author author){
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public int getYear(){
        return this.year;
    }

    public String getTitle(){
        return  this.title;
    }

    public Author author(){
        return  this.author;
    }

    public void setYear(int year){
        this.year = year;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(year, title, author);
    }

    @Override
    public String toString() {
        return "Автор - " + author + ", произведение - " + title + ", год публикации - " + year;
    }
}
