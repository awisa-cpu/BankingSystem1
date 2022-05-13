package accounts;

public class CurrentAccount extends Account{

    private double currentInterest = 0.02;

    public CurrentAccount(String fullName, long accountNumber, long bvn, double accountBalance) {
        super(fullName, accountNumber, bvn, accountBalance);
    }
}
