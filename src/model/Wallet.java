package model;
//    Encapsulation- Balance cannot be modified directly.
public class Wallet {

    private String walletId;
    private double balance;

    public Wallet(String walletId){
        this.walletId = walletId;
        this.balance = 0;
    }
    public double getBalance(){
        return balance;
    }
    public void addMoney(double amount) {
        balance+=amount;
    }
    public void deductMoney(double amount) {
        if(balance<amount){
            throw new RuntimeException("Insufficient Balance");
        }
        balance-=amount;
    }
}