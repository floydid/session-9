public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount pawanAccount = new BankAccount("183749", "Pawan");
        pawanAccount.setBalance(700);
        BankAccount pandeyAccount = new BankAccount("232334","Pandey", 500);
        pandeyAccount.setBalance(300);

        System.out.println("********Before Transfer********");
        System.out.println("Pawan's Account Balance: $" +pawanAccount.getBalance());
        System.out.println("Pandey's Account Balance: $" +pandeyAccount.getBalance());


        pawanAccount.transfer(pawanAccount,pandeyAccount,200);


    }




}
