public class Main{
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle(5, 10);
        System.out.println(s1.area());
        Triangle s2 = new Triangle(5, 10);
        System.out.println(s2.area());
        Circle s3 = new Circle(5);
        System.out.println(s3.area());
    }
}