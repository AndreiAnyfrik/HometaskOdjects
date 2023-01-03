package teachmeskills.lessonSix;

public class CreditCard {
     String cardnumber;
     int cardbalance;

    public void addCreditCard(int plus) {
        cardbalance += plus;
    }
    public void withdrawCreditCard (int minus){
        if (cardbalance == 0) {
            System.out.println("You don't have enought money");
        } else {
            cardbalance -= minus;
        }
    }
    public void getInfo () {
        System.out.println(cardbalance);
    }
}