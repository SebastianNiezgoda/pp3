public class Lamps{
    boolean lampstatus;

    void turnon(){
        lampstatus = true;
    }
    void turnoff(){
        lampstatus = false;
    }
    void displayinfo(){
        System.out.println("Lamp is " + (lampstatus?"on":"off"));
        }

}