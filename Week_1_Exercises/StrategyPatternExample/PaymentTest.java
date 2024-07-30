public class PaymentTest {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "12/2025", "123");
        PaymentStrategy paypalPayment = new PayPalPayment("mukund.990@gmail.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.pay(100.0);

        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.pay(200.0);
    }
}