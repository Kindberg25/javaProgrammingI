
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double costAffordably = 2.50;
    private static final double costHeartily = 4.30;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= costAffordably) {
            affordableMeals++;
            return card.takeMoney(costAffordably);
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= costHeartily) {
            heartyMeals++;
            return card.takeMoney(costHeartily);
        }

        return false;
    }

    public double eatAffordably(double payment) {
        if (costAffordably > payment) {
            System.out.println("No sale");
            return payment;
        }

        this.money += costAffordably;
        affordableMeals += 1;

        return payment - costAffordably;

    }

    public double eatHeartily(double payment) {
        if (costHeartily > payment) {
            System.out.println("No sale");
            return payment;
        }

        this.money += costHeartily;
        heartyMeals += 1;

        return payment - costHeartily;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
