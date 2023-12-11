public class File{
    private String name;
    private int size;
    private String type;

    public File(String name){
        this.name=name;

    }

    public String getName(){
        return name;

    }

    public void deleteFile(){
        this.name = null;
    }

    public void setName(String name){
        this.name = name;
    }
}