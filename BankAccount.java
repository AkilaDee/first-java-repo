public abstract class BankAccount {

    protected int accNumber;
    protected String accountType;
    protected String accHoldersname;
    protected String branch;
    protected boolean isActiveAccount = false;
    protected double currentBalance = 0;

    public double getBalance() {
        return this.currentBalance;
    }

    public double cashDeposit(double deposit) {
        this.currentBalance += deposit;
        return getBalance();
    }

    public abstract double calInterest();

    public abstract String toString();

}