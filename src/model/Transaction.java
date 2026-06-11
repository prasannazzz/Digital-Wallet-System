package model;
import java.time.LocalDateTime;

public class Transaction {

    private String transactionId;
    private double amount;

    private LocalDateTime timestamp;

    public Transaction(String id,
                       double amount) {

        this.transactionId = id;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }
}