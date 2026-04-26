package payment.factory;

import payment.*;

public class PaymentProcessorFactory {
    public static PaymentProcessor getPaymentProcessor(PAYMENT_ENUM paymentEnum) throws IllegalAccessException {
        switch(paymentEnum) {
            case CREDIT_CARD : return new CreditCardPaymentProcessor();
            case PAYPAL: return new PaypalPaymentProcessor();
            case CRYPTO: return new CryptoPaymentProcessor();
            default: throw new IllegalArgumentException("Could not find the payment");
        }
    }
}
