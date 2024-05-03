public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public BankAccount(String accountNumber, String accountName, double balance) {
        this(accountNumber, accountName);

        this.balance = balance;
    }

    public void transfer(BankAccount from, BankAccount to, double transferAmount){
        double fromFinal = this.getBalance() - transferAmount;
        double toFinal = to.getBalance() + transferAmount;
        this.setBalance(fromFinal);
        to.setBalance(toFinal);

        System.out.println("********After Transfer********");
        System.out.println("Pawan's Account Balance: $" +fromFinal);
        System.out.println("Pandey's Account Balance: $" +toFinal);
    }
}
