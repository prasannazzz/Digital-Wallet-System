package payment;

public class UPI extends PaymentMethod {

    private String upiId;

    public UPI(String methodId, String upiId) {
        super(methodId);
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using UPI : " + upiId
        );
    }
}