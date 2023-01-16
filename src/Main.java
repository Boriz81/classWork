public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ChekingAccount chacc = new ChekingAccount("2345",
                500L, 2.3);
        System.out.println(ba.getBalance());
        System.out.println(chacc.getBalance());


    }
}