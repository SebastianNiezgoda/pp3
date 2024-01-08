class Rectangle extends Shapes{
    float a;
    float b;

    public Rectangle(float a, float b){
        this.a=a;
        this.b=b;
    }
    public double area(){
        double area = a*b;
        return area;
        
    }
}