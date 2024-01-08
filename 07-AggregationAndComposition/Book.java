import java.util.ArrayList;

public class Book{
    private String name;
    private int nofpages;
    Writer author;
    ArrayList<Chapter> chapters = new ArrayList<>();


    public Book(Writer author,String name){
        this.author=author;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Nazwa :" + name +"\n" + "autor:"+ author.getName());
    }

    public String getName(){
        return name;
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
      }

    public void deleteChapter(Chapter chapter){
        chapters.remove(chapter);
    }

    public void displayChapters(){
        System.out.println("Rozdzialy w tej ksiazce: ");
        for (int i =0;i<chapters.size();i++){
            System.out.println(chapters.get(i).getName());
        }
    }
}