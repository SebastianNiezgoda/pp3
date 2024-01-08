public class Car extends Vehicle{
    int maxSpeed;

    public Car(int seats,int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] special = {seats , maxSpeed};
        return special;

        
    }
}