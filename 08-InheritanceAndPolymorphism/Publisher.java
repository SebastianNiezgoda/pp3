public class Publisher { 
    protected String name;
    protected String city;


    public Publisher(String name,String city){
        this.name = name;
        this.city = city;
    }

    public String getName(){
        return name;

    }
    public String getCity(){
        return city;
    }
}