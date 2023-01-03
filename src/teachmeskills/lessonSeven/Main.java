package teachmeskills.lessonSeven;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = new Figures[5];
        figures[0] = new Figures(10);
        figures[1] = new Figures(10, 5);
        figures[2] = new Figures(11);
        figures[3] = new Figures(3, 5);
        int areacube = 0;
        int arearect = 0;
        int arearound = 0;
        int areaellipse = 0;

        for(int i = 0; i < figures.length; i++){
            if(i == 0){
                areacube = figures[i].getPerimeterCircle();
                System.out.println("Периметр круга: " + areacube);
            }else if(i == 1){
                arearect = figures[i].getPerimeterRectangle();
                System.out.println("Периметр прямоугольника: " + arearect);
            }else if(i == 2){
                arearound = figures[i].getPerimeterCircle();
                System.out.println("Петриметр круга: " + arearound);
            }else if(i == 3){
                arearound = figures[i].getPerimeterCircle();
                System.out.println("Периметр круга: " + areaellipse);
            }else if(i == 4){
                int result = areacube + arearect + arearound + areaellipse;
                System.out.println("Общий периметр: " + result);
            }
        }
    }
}
