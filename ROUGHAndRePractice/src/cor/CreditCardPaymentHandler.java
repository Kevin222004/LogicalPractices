package cor;

public class CreditCardPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Credit");
        }
        else {
            next.handlePayment(amount);
        }
    }
}
