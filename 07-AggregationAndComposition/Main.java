public class Main{
    public static void main(String[] args) {
        Writer Adam = new Writer("Adam");
        Book Dziady = new Book(Adam, "Dziady");
        Bookcase n1 = new Bookcase(1);
        n1.addBook(Dziady);
        Book Tadek = new Book(Adam, "Tadek");
        n1.addBook(Tadek);

        Chapter bitwa = new Chapter("Bitwa");
        Chapter koniec = new Chapter("Koniec");

        Dziady.addChapter(bitwa);
        Dziady.addChapter(koniec);
        Dziady.displayChapters();
        
        
        

    }
}