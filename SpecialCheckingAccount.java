public class SpecialCheckingAccount extends CheckingAccount {
    private double minimumBalance;
    private double interestRate;

    public SpecialCheckingAccount(int iD, double startBal, double cC, double iR, double mB) {
        super(iD, startBal, cC);
        minimumBalance = mB;
        interestRate = iR;
    }

    public void clearCheck(double n) {
        if (super.currentBalance() > minimumBalance)
            super.decreaseBalance(n);
        else
            super.clearCheck(n);
    }

    public double monthlyInterest() {
        if (super.currentBalance() > minimumBalance)
            return (super.currentBalance() * (interestRate / 12));
        else
            return super.monthlyInterest();
    }
}