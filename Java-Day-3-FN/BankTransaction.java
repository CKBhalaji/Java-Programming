public class BankTransactionExample {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("Account A", 5000);
        BankAccount accountB = new BankAccount("Account B", 2500);

        accountA.transferTo(accountB, 1500);

        accountB.transferTo(accountA, 3000);
    }
}
