package teachmeskills.lessonSix;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.cardbalance = 3;
        creditCard.addCreditCard(10);
        creditCard.withdrawCreditCard(1);
        System.out.println(creditCard);
        int creditCardCount = 3;
        for (int i = 0; i < creditCardCount; i++) {

        }
    }
}
