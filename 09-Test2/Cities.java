import java.util.Arrays;

public class Cities{

    private String[] city_names;

    public Cities(String[] names){
        this.city_names = names;
    }

    public String filter(char x){
        String result = "";
        for(int i =0 ; i<city_names.length;i++){
            if(city_names[i].charAt(0) == x){
                result+=city_names[i];
            }
        }
        return result;
    }
}