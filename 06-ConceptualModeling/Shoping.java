import java.util.Arrays;

public class Shoping{
    String[] list = {};
    int count = 0; 

    public void listDisplay(){
        for (int i = 0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }

    void listAdd(String product){
        String[] newlist = Arrays.copyOf(list,list.length+1);
        newlist[list.length]=product;
        list=newlist;
    }
}