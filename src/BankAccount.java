public class BankAccount {
    String number;
    long balance;
    public BankAccount() {
        this.number = "0234";
        this.balance = 100L;

    }

    public BankAccount(String number, long balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }
}
