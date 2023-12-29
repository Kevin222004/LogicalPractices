package cor;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount < 500) {
            System.out.println("paid using bacnk account" + amount);
        }
        else {
            next.handlePayment(amount);
        }
    }
}
