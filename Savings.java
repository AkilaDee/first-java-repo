public class Savings extends BankAccount {

    private final double interest = 3;
    private final String accountType = "Savings";

    public Savings() {
        System.out.println("You have to provide nesseassry details , in order to create an account.");
    }

    public Savings(int accNumber, String accHoldersname, String branch) {
        super.accNumber = accNumber;
        super.accountType = this.accountType;
        super.accHoldersname = accHoldersname;
        super.branch = branch;
        super.isActiveAccount = true;
    }

    public double calInterest() {
        double interest = super.currentBalance * this.interest / 100;
        super.currentBalance += interest;
        return interest;
    }

    public String toString() {
        return "Account type : " + super.accountType + " | Interest Rate : " + String.format("%.2f", this.interest)
                + "% | Current Balance : " + String.format("%.2f", super.currentBalance);
    }

}