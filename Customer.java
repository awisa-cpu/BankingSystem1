package stakeholders;
import services.Address;
import java.time.LocalDate;
import accounts.Account;

public class Customer {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private Address address;
    private long bvn;
    private long accountNumber;
    private Account accountType;

//first constructor is for new customers without a BVN yet
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String gender, Address address, long accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.accountNumber = accountNumber;
    }
//second constructor is for customers with BVN
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String gender, Address address, long bvn, long accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.bvn = bvn;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getBvn() {
        return bvn;
    }

    public void setBvn(long bvn) {
        this.bvn = bvn;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    //behaviours/methods to be performed by a customer
    public void withdrawCash() {
        System.out.println("Withdrawing...");
    }
    public void depositCash() {
        System.out.println("Depositing...");
    }
    public void transferCash() {
        System.out.println("Transfering...");
    }
    public void layComplaint() {
        System.out.println("Complaining...");
    }
    public void takeLoan() {
        System.out.println("Taking loan...");
    }
    public void checkBalance() {
        System.out.println("Balance check...");
    }
    public void changePin() {
        System.out.println("Pin change...");
    }
}
