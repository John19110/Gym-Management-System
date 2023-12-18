package Mygym;


public abstract   class Person 
{
    protected int ID;
    protected String Name, Address, Gender, Email,PhoneNumber;
    
    public Person(int iD, String name, String address, String gender, String email, String phoneNumber) {
        ID = iD;
        Name = name;
        Address = address;
        Gender = gender;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public  abstract int getID();

    public  abstract void setID(int iD);

    public abstract String getPhoneNumber();

    public abstract void SetPhoneNumber(String phoneNumber);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getAddress();

    public abstract  void setAddress(String address);

    public abstract String getGender();

    public  abstract void setGender(String gender);

    public abstract String getEmail();

    public abstract void setEmail(String email);    
}
