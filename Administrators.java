package stakeholders;

import services.Address;

import java.time.LocalDate;

public class Administrators {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private Address address;
    private int adminIdNumber;
    private long accountNumber;


//an admin with account number
    public Administrators(String firstName, String lastName, LocalDate dateOfBirth, String gender, Address address, int adminIdNumber, long accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.adminIdNumber = adminIdNumber;
        this.accountNumber = accountNumber;
    }

//an admin without account number
    public Administrators(String firstName, String lastName, LocalDate dateOfBirth, String gender, Address address, int adminIdNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.adminIdNumber = adminIdNumber;
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

    public int getAdminIdNumber() {
        return adminIdNumber;
    }

    public void setAdminIdNumber(int adminIdNumber) {
        this.adminIdNumber = adminIdNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
