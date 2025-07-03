abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        System.out.println("Savings Interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Application for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        boolean eligible = getBalance() >= 5000;
        System.out.println("Savings Account Loan Eligibility: " + eligible);
        return eligible;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        System.out.println("Current Interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Application for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        boolean eligible = getBalance() >= 10000;
        System.out.println("Current Account Loan Eligibility: " + eligible);
        return eligible;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SA123", "Alice", 8000);
        accounts[1] = new CurrentAccount("CA456", "Bob", 15000);

        for (BankAccount account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Holder: " + account.getHolderName());
            account.deposit(1000);
            account.withdraw(500);
            account.calculateInterest();

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000);
                loanable.calculateLoanEligibility();
            }
            System.out.println();
        }
    }
}
