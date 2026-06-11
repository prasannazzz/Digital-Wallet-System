package processor;
import model.Wallet;
import payment.PaymentMethod;

public class WalletTransactionProcessor implements TransactionProcessor {

    @Override
    public void process(Wallet wallet, PaymentMethod paymentMethod, double amount) {
        wallet.deductMoney(amount);
        paymentMethod.pay(amount);
        System.out.println("Transaction Successful");
    }
}