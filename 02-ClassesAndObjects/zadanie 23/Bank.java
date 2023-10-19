public class Bank{
    double buys;
    double sells;


    void calculate(){
        double spread= sells - buys;

        System.out.printf("Bank buys eur: %,.4f ",buys);
        System.out.print("\n");
        System.out.printf("Bank sells eur: %,.4f ", sells );
        System.out.print("\n");
        System.out.printf("Spread: %,.4f", spread);
    }
}