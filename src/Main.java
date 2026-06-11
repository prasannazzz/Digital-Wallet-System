import fraud.AmountLimitRule;
import fraud.FraudRule;
import model.User;
import model.Wallet;
import notification.EmailNotification;
import notification.SmsNotification;
import payment.PaymentMethod;
import payment.UPI;
import processor.NotificationService;
import processor.TransactionProcessor;
import processor.WalletTransactionProcessor;

public class Main {
    public static void main(String[] args) {

        User user = new User("U1", "Prasanna");
        Wallet wallet = new Wallet("W1");
        wallet.addMoney(10000);
        user.addWallet(wallet);
        PaymentMethod upi = new UPI("PM1", "prasanna@upi");
        FraudRule fraudRule = new AmountLimitRule();
        double amount = 5000;
        if(fraudRule.isFraud(amount)) {
            System.out.println("Fraud Detected");
            return;
        }

        TransactionProcessor processor = new WalletTransactionProcessor();
        processor.process(wallet, upi, amount);

        NotificationService service = new NotificationService();
        service.subscribe(new EmailNotification());
        service.subscribe(new SmsNotification());

        service.notifyAllObservers("₹5000 transferred successfully");
    }
}