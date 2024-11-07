public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(){

    }
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculateCircumference() {
        // Side = (2*height) / sqrt3
        // --> perimeter = 3 * side
        double side = (2*height) / Math.sqrt(3);
        return side*3;
    }
}
