package gym;

public abstract  class Person {
    protected int ID;
    protected int PhoneNumber;
    protected String Name, Address, Gender, Email;
    
    public Person(int iD, int phoneNumber, String name, String address, String gender, String email) {
        ID = iD;
        PhoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
