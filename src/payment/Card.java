package payment;

public class Card extends PaymentMethod {

    private String cardNumber;

    public Card(String methodId,
                String cardNumber) {

        super(methodId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount +
                        " using Card"
        );
    }
}