class LoanAccount extends AbstractAccount {
    private double interestRate;

    LoanAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
