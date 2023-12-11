import java.util.ArrayList;

public class Bookcase{
    private int bookcasenumber;
    ArrayList<Book> zawartosc = new ArrayList<Book>();

    public Bookcase(int number){
        this.bookcasenumber=number;
    }

    public void addBook(Book nazwa){
        zawartosc.add(nazwa);
    }
    public void removeBook(Book nazwa){
        zawartosc.remove(nazwa);
    }

    public void display(){
        System.out.println("Ksiazki na tej polce: ");
        for(int i = 0 ; i<zawartosc.size();i++){
            System.out.println(zawartosc.get(i).getName());

        }
    }

}