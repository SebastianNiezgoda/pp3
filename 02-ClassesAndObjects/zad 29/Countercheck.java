public class Countercheck{
    public static void main(String[] args){
        Counter s1 = new Counter();
        Counter s2 = new Counter();

        s1.add10();
        s1.add10();
        
        s1.add1();
        s1.add1();
        s1.add1();
        s1.displaycount();

        s2.take1();
        s2.take10();
        s2.displaycount();

    }
}