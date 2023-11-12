public class Person{
    String name;
    double weight;
    double height;
    double BMI;


    public Person(String name,double weight, double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
     }

    public Person(String name){
        this.name=name;
    } 
    public void setWeightAndHeight(double weight,double height){
        this.weight=weight;
        this.height=height;
    }

    public void CalculateBMI(){
        double bbb =weight/Math.pow(height,2);
        bbb*=100;
        bbb=Math.round(bbb);
        bbb/=100;
        this.BMI=bbb;
        System.out.println("Your bmi is: "+ BMI);

    }

    public void displayRecord(){
        System.out.println("Your name: "+name+"\n"+"Your weight: "+weight+"\n"+"Your height: "+height+"\n"+"your bmi: "+BMI);
    }
}