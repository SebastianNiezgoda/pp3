public class Audiobook extends Book{
    protected int minutes;
    protected int seconds;


    public Audiobook(String name, String city,String title,String author,int minutes,int seconds){
        super(name , city, title, author);
        this.minutes=minutes;
        this.seconds = seconds;
    }

    public void display(){
        System.out.println(title + "\n" +author + "\n" + minutes + ":" + seconds + name + city);
    }
}