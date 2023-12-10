public class File{
    String name;
    int size;
    String location;


    public int Showsize(){
        return size;
    }
    public String Showlocation(){
        return location;
    
    }

    public void locationchange(String newlocation){
        this.location=newlocation;
    }


}