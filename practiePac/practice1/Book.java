package practiePac.practice1;

public class Book {
    public String name, author;
    public int sizeBook;

    public Book(String n, String a, int s){
        name = n;
        author = a;
        sizeBook = s;
    }

    public Book(String n, String a){
        name = n;
        author = a;
        sizeBook = 1;
    }

    public Book(){
        name = "The call of cthulhu";
        author = "Lovecraft";
        sizeBook = 1;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSizeBook() {
        return sizeBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSizeBook(int sizeBook) {
        this.sizeBook = sizeBook;
    }

    public String toString(){
        return this.name+" - "+this.author+" - Size book: "+this.sizeBook;
    }
}
