public class Ebook extends Book{
    protected String filename;

    public Ebook(String name, String city,String title,String author,String filename){
        super(name,city,title,author);
        
        this.filename = filename;
    }

    public void display(){
        System.err.println(title + " \n" + author + "\n" + filename + name + city);

    }

}