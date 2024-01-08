class Circle extends Shapes{
    int r;
    public Circle(int r){
        this.r = r;

    }

    public double area(){
        
        double area = Math.PI * Math.pow(r,2);
        double zaokraglana= area*100;
        zaokraglana = Math.round(zaokraglana);
        zaokraglana /=100;
        return zaokraglana;
    }
}