public class PaymentProcessorTest {
    public static void main(String[] args) {
        PayPalGateway paypalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        BankTransferGateway bankTransferGateway = new BankTransferGateway();

        PayPalAdapter paypalAdapter = new PayPalAdapter(paypalGateway);
        StripeAdapter stripeAdapter = new StripeAdapter(stripeGateway);
        BankTransferAdapter bankTransferAdapter = new BankTransferAdapter(bankTransferGateway);

        paypalAdapter.processPayment("mukund.990@example.com", 100.0);
        stripeAdapter.processPayment("1234-5678-9012-3426", 200.0);
        bankTransferAdapter.processPayment("1234567890", 300.0);
    }
}