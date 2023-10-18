public class StudentTest{
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Peter";
        s.age = 23;
        s.StudentId=255524;
        s.average_grade=4;
        s.semester=3;
        s.valid=true;

        s.showvalid();
        s.changevalid();
        s.showvalid();
        s.overalinfo();


        Student s1 = new Student();
        s1.name = "Mark";
        s1.age = 55;

    }
}
