package processor;
import model.Wallet;
import payment.PaymentMethod;

public interface TransactionProcessor {
    void process(Wallet wallet, PaymentMethod paymentMethod, double amount
    );
}