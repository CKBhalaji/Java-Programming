public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(2000, 500);
        LoanAccount loanAccount = new LoanAccount(5000, 0.1);

        System.out.println("Initial Balances:");
        System.out.println("Savings Account Balance: Rs." + savingsAccount.checkBalance());
        System.out.println("Checking Account Balance: Rs." + checkingAccount.checkBalance());
        System.out.println("Loan Account Balance: Rs." + loanAccount.checkBalance());

        savingsAccount.deposit(500);
        checkingAccount.withdraw(300);
        loanAccount.deposit(1000);

        System.out.println("\nUpdated Balances:");
        System.out.println("Savings Account Balance: Rs." + savingsAccount.checkBalance());
        System.out.println("Checking Account Balance: Rs." + checkingAccount.checkBalance());
        System.out.println("Loan Account Balance: Rs." + loanAccount.checkBalance());

        if (savingsAccount instanceof SavingsAccount) {
            System.out.println("\nSavings Account Interest Rate: " + ((SavingsAccount) savingsAccount).getInterestRate());
        }

        if (checkingAccount instanceof CheckingAccount) {
            System.out.println("Checking Account Overdraft Limit: " + ((CheckingAccount) checkingAccount).getOverdraftLimit());
        }

        if (loanAccount instanceof LoanAccount) {
            System.out.println("Loan Account Interest Rate: " + ((LoanAccount) loanAccount).getInterestRate());
        }
    }
}
