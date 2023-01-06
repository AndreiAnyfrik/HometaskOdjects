package teachmeskills.figures;

public class Rectangle extends Figure {
    private double width;
    private double height;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getAreaRectangle() {
        double area = width * height;
        return area;
    }
    public void getPerimeterRectangle() {
        double perimeter = 2 * (width * height);
        return perimeter;
    }
}
