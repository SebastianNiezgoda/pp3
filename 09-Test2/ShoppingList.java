import java.util.ArrayList;

public class ShoppingList{
    
    private ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product){
        list.add(product);
    }

    public String toString(){
        String lista = "";

        for(int i =0 ; i<list.size();i++){
            if(i!=list.size()-1){
             lista+=list.get(i).getName();
             lista+=",";
            }
        else{
            lista+=list.get(i).getName();

        }
        }
        return lista;

    }

    public int total(){
        int total = 0;
        for(int i=0 ; i<list.size();i++){
            total+=list.get(i).getQuantity();
        }
        return total;
    }



}