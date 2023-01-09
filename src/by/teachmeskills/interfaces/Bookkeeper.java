package by.teachmeskills.interfaces;

public class Bookkeeper implements Printable {
    String name;

    public Bookkeeper() {
        this.name = "bookkeper";
    }

    @Override
    public void print() {
        System.out.printf("Position is %s  ",name);
    }
}
