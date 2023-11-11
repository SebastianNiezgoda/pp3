public class Counter{
    int count=0;

    void resetcounter(){
        count=0;
    }
    void add1(){
        count+=1;
    }
    void add10(){
        count+=10;
    }
    void take1(){
        count-=1;
    }
    void take10(){
        count-=10;
    }
    void displaycount(){
        System.out.println("Licznik wynosi "+ count);
    }
}