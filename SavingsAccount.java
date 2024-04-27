public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int id, double startBal, double iR) {
        super(id, startBal);
        interestRate = iR;
    }

    public void withdraw(double n) {
        if (n <= super.currentBalance())
            super.decreaseBalance(n);
    }

    public double monthlyInterest() {
        return (super.currentBalance() * (interestRate / 12));
    }
}