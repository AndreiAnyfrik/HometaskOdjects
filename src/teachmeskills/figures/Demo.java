package teachmeskills.figures;

public class Demo {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Triangle triangle = new Triangle(2 3)
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2 3);

        figure.getAreaFigure();
        figure.getPerimeterFigure();
        triangle.getAreaTriangle();
        triangle.getPerimeterTriangle();
        circle.getAreaCircle();
        circle.getPerimeterCircle();
        rectangle.getAreaRectangle();
        rectangle.getPerimeterRectangle();

        Figure[] array = new Figure[5];
        array[0] = new Triangle();
        array[1] = new Circle();
        array[2] = new Rectangle();
        array[3] = new Circle();
        array[4] = new Triangle();
        for(int i = 0; i < 6; i++){
            if(i == 0){
               double areatriangle = Figure[i].getPerimeterCircle();
                System.out.println("Периметр треугольника: " + areatriangle);
            }else if(i == 1){
                double  areacircle = Figure[i].getPerimeterRectangle();
                System.out.println("Периметр круга: " + areacircle);
            }else if(i == 2){
                double arearectanle = Figure[i].getPerimeterCircle();
                System.out.println("Периметр прямоугольника: " + rectangle);
            }else if(i == 3) {
                double arearound = Figure[i].getPerimeterCircle();
                System.out.println("Периметр круга: " + arearound);
            } else if (i == 4) {
                double areatriangletwo = Figure[i].getPerimeterCircle();
                System.out.println("Периметр треугольника: " + areatriangletwo);
            }
        }else if(i == 5){
                double result = areatriangle + areacircle + arearectanle + arearound + areatriangletwo ;
                System.out.println("Общий периметр: " + result);
            }
        }
    }
}
