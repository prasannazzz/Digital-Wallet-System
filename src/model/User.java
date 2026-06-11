package model;
import java.util.*;
//User HAS-A Wallet
//User HAS-A BankAccount
public class User {

    private String userId;
    private String name;

    private List<Wallet> wallets;
    private List<BankAccount> bankAccounts;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;

        wallets = new ArrayList<>();
        bankAccounts = new ArrayList<>();
    }

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }

    public void addBankAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public String getName() {
        return name;
    }
}