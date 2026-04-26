package payment;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayments(double amount) {
        System.out.println("Processing CREDIT CARD payment of $" + amount + " via VISA gateway" );
    }
}
