interface PaymentStrategy {
    void pay(double amount);
}
class UPIPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double amount) {
        strategy.pay(amount);
    }
}
public class Main {
    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        payment.setPaymentStrategy(new UPIPayment());
        payment.makePayment(1000);

        payment.setPaymentStrategy(new CreditCardPayment());
        payment.makePayment(2000);

        payment.setPaymentStrategy(new NetBankingPayment());
        payment.makePayment(3000);
    }
}