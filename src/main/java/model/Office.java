package model;

public class Office {
    
    private int officeCode;
    private String officeAddress;
    private String officePhoneNumber;
    
    public Office(String officeAddress, String officePhoneNumber) {
        this(0, officeAddress, officePhoneNumber);
    }

    public Office(int officeCode, String officeAddress, String officePhoneNumber) {
        this.officeCode = officeCode;
        this.officeAddress = officeAddress;
        this.officePhoneNumber = officePhoneNumber;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }
    
}