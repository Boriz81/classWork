public class SavingAccount extends BankAccount{
    String interestRate;

    public SavingAccount(String number, long balance, String interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}
