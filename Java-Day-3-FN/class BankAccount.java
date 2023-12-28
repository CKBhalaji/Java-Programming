class BankAccount {
    private static int accountIdCounter = 10000;
    private int accountId;
    private String accountHolderName;
    private double accountBalance;
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountId = ++accountIdCounter;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }
    public void transferTo(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            receiver.accountBalance += amount;
            System.out.println("Transaction details:");
            System.out.println("Account id: " + accountId);
            System.out.println("Name: " + accountHolderName);
            System.out.println("Account Balance: Rs." + accountBalance);
            System.out.println();
        } else {
            System.out.println("Invalid transaction. Insufficient funds.");
        }
    }
}
