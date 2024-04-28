public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount pawanAccount = new BankAccount();
        pawanAccount.setBalance(500);
        BankAccount pandeyAccount = new BankAccount();
        pandeyAccount.setBalance(300);

        System.out.println("********Before Transfer********");
        System.out.println("Pawan's Account Balance: $" +pawanAccount.getBalance());
        System.out.println("Pandey's Account Balance: $" +pandeyAccount.getBalance());

        BankAccount dummyAccount = new BankAccount();
        dummyAccount.transfer(pawanAccount,pandeyAccount,200);


    }




}
