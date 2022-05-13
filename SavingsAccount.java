package accounts;

public class SavingsAccount extends Account{
    private final double savingsInterest = 0.3;
    public SavingsAccount(String fullName, long accountNumber, long bvn, double accountBalance) {
        super(fullName, accountNumber, bvn, accountBalance);
    }
}
