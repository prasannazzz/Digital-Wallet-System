package payment;
//Abstraction
public abstract class PaymentMethod {

    protected String methodId;

    public PaymentMethod(String methodId) {
        this.methodId = methodId;
    }

    public abstract void pay(double amount);
}