class Triangle extends Shapes{
    int a;
    int h;

    public Triangle(int a,int h){
        this.a=a;
        this.h=h;
    }

    public double area(){
        float area = (a*h)/2;
        return area;
    }
}