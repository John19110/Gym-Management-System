package gym;

public abstract  class Person {
    protected int ID;
    protected String Name, Address, Gender, Email,PhoneNumber;
    
    public Person(int iD, String PhoneNumber, String name, String address, String gender, String email) {
        ID = iD;
        this.PhoneNumber = PhoneNumber;
        Name = name;
        Address = address;
        Gender = gender;
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void SetPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    
    
}
