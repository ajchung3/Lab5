import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    private BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    private double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

    public void setOwnerName(String newName) {
        this.ownerName = newName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
