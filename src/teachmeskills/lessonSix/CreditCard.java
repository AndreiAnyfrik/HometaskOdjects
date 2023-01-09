package teachmeskills.lessonSix;
/*Cоздать класс CreditCard c полями:
        номер счета
        текущая сумма на счету
        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую
        сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Написать программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма

        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.*/

public class CreditCard {
    private String accountNumber;
    private double currentSum;

    public CreditCard(String accountNumber) {
        this.accountNumber = accountNumber;
        this.currentSum = 10;
    }

    public void addSum(double sumToAdd) {
        this.currentSum = this.currentSum + sumToAdd;
    }

    public void takeSum(double sumToTake) {
        if (sumToTake < this.currentSum) {
            this.currentSum = this.currentSum - sumToTake;
        } else {
            System.out.println("Please add cash to card");
        }
    }

    public String getInfo() {
        return "Account number is" + this.accountNumber + "Sum of money is " + this.currentSum;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }
}
