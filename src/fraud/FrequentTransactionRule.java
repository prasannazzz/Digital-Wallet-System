package fraud;

public class FrequentTransactionRule implements FraudRule {

    @Override
    public boolean isFraud(double amount) {
        return false;
    }
}
