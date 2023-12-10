public class Bankacount{
    String owner;
    float balance;


    public float showbalance() {
        return balance;
    }
    void withdraw(float ammount){
        if(ammount>this.balance){
            System.out.println("nie masz tyle na koncie ");
        }
        else{
            if (ammount>500){
                System.out.println("Nie mozesz wiecej niz 500");
            }
            else{
                this.balance-=ammount;
            }
            
        }
    }
    void deposit(float ammount){
        this.balance+=ammount;
    }
    public Bankacount(String owner,float balance){
        this.owner = owner;
        this.balance = balance;

         
    }
}