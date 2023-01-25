package teachmeskills.figures;
/*Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
        Создать массив из 5 фигур.
        Вывести на экран сумму периметра всех фигур в массиве.*/

public class Demo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3);
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2, 3);

        triangle.getArea();
        triangle.getPerimeter();
        circle.getArea();
        circle.getPerimeter();
        rectangle.getArea();
        rectangle.getPerimeter();

        Figure[] array = new Figure[5];
        array[0] = new Triangle(1, 3, 3);
        array[1] = new Circle(2);
        array[2] = new Rectangle(3, 2);
        array[3] = new Circle(3);
        array[4] = new Triangle(2, 3, 4);
        System.out.println(array[0].getPerimeter() + array[1].getPerimeter() + array[2].getPerimeter()
                + array[3].getPerimeter() + array[4].getPerimeter());
    }
}
