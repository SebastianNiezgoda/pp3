public class Cinemacon{
     static String cinema_name = "Helios" ;
     String film_name;
     int row;
     int seat;
     int cena;


     public Cinemacon(int row,int seat, String film_name){
        this.film_name=film_name;
        this.row = row;
        this.seat = seat;
        
        if(row<=2){
            cena=10;
        }
        else{
            cena=25;
        }

     }
     public String toString(){
        return "cinema name: "+ cinema_name + "\n" + "film name: "+film_name+"\n"+"row: "+row+"\n"+"Seat: "+seat+"\n"+"Cena: "+cena;
     }
}

