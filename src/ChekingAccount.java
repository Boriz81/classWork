public class ChekingAccount extends BankAccount {
    double fee;

    public ChekingAccount(String number, long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }


}
