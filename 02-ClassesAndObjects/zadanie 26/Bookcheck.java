public class Bookcheck{
    public static void main(String[] args){
        Book alwin = new Book();
        alwin.number_of_pages=250;
        alwin.author="Jasiek";
        alwin.cena=50;
        alwin.title="alwin";

        alwin.displayauthor();
        alwin.displaypages();
        alwin.displaytitle();
    }   
}