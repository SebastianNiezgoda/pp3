public class SurfaceArea{
    static double cuboidarea(double a,double height,double b){
        return(a*b*height);
    }
    static double spherearea(double r){
        double b=(4*Math.PI*Math.pow(r, 2));
        b*=100;
        b=Math.round(b);
        b/=100;
        return(b);
    }
}