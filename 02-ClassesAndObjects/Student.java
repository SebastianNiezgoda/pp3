public class Student {
    String name;
    int age;
    int StudentId;
    boolean valid;
    int semester;
    int average_grade;

    void sayHello(){
        System.out.println("Hello from " + name);
    }
    
    void displayName(){
        System.out.println("my name is " + name);
    }

    void displayAge(){
        System.out.println("My age is " + age);
    }
    void overalinfo(){
        System.out.println("My name is "+name+" im on "+semester+"semester and my average grade is "+average_grade);
    }
    void changevalid(){
        valid =! valid;
    }
    void showvalid(){
        System.out.println(valid);
    }
    


}


