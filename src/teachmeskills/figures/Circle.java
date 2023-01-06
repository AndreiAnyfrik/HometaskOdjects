package teachmeskills.figures;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  void  getAreaCircle() {
        this.radius =this.radius * this.radius * Math.PI;
    }
    public void getPerimeterCircle(){
        this.radius = this.radius * 2 * Math.PI;
    }
}
