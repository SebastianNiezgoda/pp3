public class Time{
    int hours;
    int minutes;

    void checktime(){

        int hoursinmin=hours*60;
        
        int minfrom=hoursinmin + minutes;
        int secondsfrom=hoursinmin*60 + minutes*60;
        System.out.println("Time: "+hours+":"+minutes);
        System.out.println("Minutes from mindnight: "+ minfrom +"\n"+ "seconds from midnight: " + secondsfrom);

    }
}

