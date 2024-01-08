import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        Person s1 = new Person("as", 19);
        Person s2 = new Person("as", 19);
        Person s3= new Person("as", 19);
        Person s5 = new Person("as", 18);
        Person s6 = new Person("as", 2);
        Person s4 = new Person("fs", 7b   );

        Person[] sss = {s1,s2,s3,s5,s6,s4};

        Family xd = new Family(sss);
        System.out.println(xd.adults());

      
    }
}