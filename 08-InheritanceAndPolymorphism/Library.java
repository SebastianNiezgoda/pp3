import java.util.*;


public class Library{
    protected ArrayList<Book> biblioteka = new ArrayList<Book>();

    void addBook(Book ks){
        biblioteka.add(ks);
    }

    void displaybiblioteka(){
        for(int i =0; i< biblioteka.size();i++){
            Book s;
            s=biblioteka.get(i);
            s.display();
        }
    }
}

