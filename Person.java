package Mygym;

import java.io.Serializable;
import java.text.ParseException;

public abstract class Person implements Serializable
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

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
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

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

   public    Person  Login(String Email,String Password)
   {
          return null;
   }


   public  Person Register() throws ParseException
   {
        return null;

   }


}
