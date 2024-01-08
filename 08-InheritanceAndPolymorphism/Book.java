public class Book extends Publisher{
    protected String title;
    protected String author;
    


    public Book(String name, String city , String title,String author){
        super(name,city);
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void display(){
        System.out.println(title + "\n" + author + name +city );
    }
}



