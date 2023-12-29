package cor;

public class CORMAIN {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        bank.setNext(creditCard);

        bank.handlePayment(200);
        System.out.println(
                "=============="
        );
        bank.handlePayment(999);
    }
}
