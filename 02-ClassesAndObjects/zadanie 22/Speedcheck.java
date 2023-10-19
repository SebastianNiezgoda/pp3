public class Speedcheck{
    int speed;
    

    void speedcheck(){
        if(speed>40 && speed<140){
            boolean dozwolone = true;
            System.out.println("Vehicle speed: " + speed);
            System.out.println("Speed is valid: " + dozwolone);
        }else{
            boolean dozwolone = false;
            System.out.println("Vehicle speed: " + speed);
            System.out.println("Speed is valid: " + dozwolone);
        }
        
    }
}