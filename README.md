# SimpleFactoryPattern

A Java project demonstrating the **Simple Factory Design Pattern**. This project includes two examples of the factory pattern: one for geometric shapes and another for payment processing systems.

## Key Concepts

- **Abstraction**: Using interfaces or abstract classes (`Shape`, `PaymentProcessor`) to define common behavior.
- **Encapsulation**: Moving the instantiation logic into a factory class (`ShapeFactory`, `PaymentProcessorFactory`).
- **Decoupling**: The client code doesn't need to know the concrete classes it's instantiating.

## Project Structure

- `src/shape/`: Contains the Shape factory example.
  - `Shape.java`, `Circle.java`, `Rectangle.java`, `Triangle.java`.
  - `factory/ShapeFactory.java`.
- `src/payment/`: Contains the Payment Processor factory example.
  - `PaymentProcessor.java`, `CreditCardPaymentProcessor.java`, `PaypalPaymentProcessor.java`, `CryptoPaymentProcessor.java`.
  - `factory/PaymentProcessorFactory.java`.
- `src/Main.java`: Entry point demonstrating both factory implementations.

## How to Run

1. Open the project in an IDE.
2. Run `Main.java` to see how the factories create different objects based on input types.
