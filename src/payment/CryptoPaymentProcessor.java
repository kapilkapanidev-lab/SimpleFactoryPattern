package payment;

public class CryptoPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayments(double amount) {
        System.out.println("Processing CRYPTO payment of $" + amount + " via Blockchain network" );
    }
}
