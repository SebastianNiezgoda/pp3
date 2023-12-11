import java.util.ArrayList;

public class Folder{
    private String name;
    private int size;
    ArrayList<File> files = new ArrayList<File>();


    public Folder(String name){
        this.name = name;
    }

    public void addFile(File nazwa){ 
        files.add(nazwa);     
    }

    public void deleteFile(File nazwa){
        files.remove(nazwa);
    }

    public void getFiles(){
        System.out.println("Zawartosc folderu :");
        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).getName());
    }}
        
 }

