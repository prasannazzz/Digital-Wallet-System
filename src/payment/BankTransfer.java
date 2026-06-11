package payment;
public class BankTransfer extends PaymentMethod{

    private String accountNumber;

    public BankTransfer(String methodId, String accountNumber){
        super(methodId);
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Bank Transfer");
    }
}