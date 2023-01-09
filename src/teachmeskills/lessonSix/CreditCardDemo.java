package teachmeskills.lessonSix;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard firstcreditCard = new CreditCard("1514PB7");
        CreditCard secondcreditCard = new CreditCard("2124PB7");
        CreditCard thirdcreditCard = new CreditCard("3114PB7");

        firstcreditCard.addSum(2);
        secondcreditCard.addSum(3);
        thirdcreditCard.takeSum(13);

        System.out.println(firstcreditCard.getInfo());
        System.out.println(secondcreditCard.getInfo());
        System.out.println(thirdcreditCard.getInfo());
    }
}
