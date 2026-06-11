package model;

public class BankAccount {

    private String accountNumber;
    private String bankName;

    public BankAccount(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
