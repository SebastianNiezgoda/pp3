

public class Main{
    public static void main(String[] args) {
        Book dziady = new Book("Adam","Warszawa","dziady", "Adam");
       // dziady.display();

        Ebook tadek = new Ebook("adam","warszawa","Tadek", "adam", "adam_tadek");
       // tadek.display();

        Audiobook janko = new Audiobook("Jan","szczawa","janko", "jan", 6, 45);
        //janko.display();


        Library jd = new Library();
        jd.addBook(janko);
        jd.addBook(tadek);
        jd.addBook(dziady);

        jd.displaybiblioteka();
    }
}