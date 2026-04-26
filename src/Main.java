import org.w3c.dom.css.Rect;
import payment.PAYMENT_ENUM;
import payment.PaymentProcessor;
import payment.factory.PaymentProcessorFactory;
import shape.*;
import shape.factory.ShapeFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IllegalAccessException {
    Circle circle = new Circle(2);
    Square square = new Square(3);
    Rectangle rectangle = new Rectangle(2,3);

    Shape shape1 = ShapeFactory.getShape(SHAPE_ENUM.CIRCLE);
    Shape shape2 = ShapeFactory.getShape(SHAPE_ENUM.SQUARE);
    Shape shape3 = ShapeFactory.getShape(SHAPE_ENUM.RECTANGLE);

    System.out.println(shape1.toString());
    System.out.println(shape2.toString());

    System.out.println(shape3.toString());


    PaymentProcessor processor1 = PaymentProcessorFactory.getPaymentProcessor(PAYMENT_ENUM.CREDIT_CARD);
    PaymentProcessor processor2 = PaymentProcessorFactory.getPaymentProcessor(PAYMENT_ENUM.PAYPAL);
    PaymentProcessor processor3 = PaymentProcessorFactory.getPaymentProcessor(PAYMENT_ENUM.CRYPTO);
    processor3.processPayments(5000);
    processor2.processPayments(89.99);
    processor1.processPayments(250);



}
