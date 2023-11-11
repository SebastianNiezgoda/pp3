public class Rectangle{
    int alength;
    int blength;

    void display_dimension(){
        System.out.println("rozmiar prostokątu to "+alength+"x"+blength);
    }
    void display_perimeter(){
        System.out.println("Obwód prostokątu to "+((alength*2)+(blength*2)));
    }
    void display_surface(){
        System.out.println("Pole prostokąta to "+(alength*blength));
    }
}