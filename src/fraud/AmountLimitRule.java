package fraud;

public class AmountLimitRule implements FraudRule {

    @Override
    public boolean isFraud(double amount) {
        return amount > 50000;
    }
}