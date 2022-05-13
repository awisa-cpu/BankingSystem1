package accounts;

public class Account {
    private String fullName;
    private long accountNumber;
    private long bvn;
    private double accountBalance;

    public Account(String fullName, long accountNumber, long bvn, double accountBalance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.bvn = bvn;
        this.accountBalance = accountBalance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBvn() {
        return bvn;
    }

    public void setBvn(long bvn) {
        this.bvn = bvn;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
