package payment;

public class PaypalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayments(double amount) {
        System.out.println("Processing PAYPAL payment of $" + amount + " via PAYPAL API" );
    }
}
