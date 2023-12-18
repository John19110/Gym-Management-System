package Mygym;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gym.InBody;
import gym.Person;

class Coach extends Person 
{
    protected int WorkingHours;
    protected String password;



    public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours, String password) {
        super(iD, name, address, gender, email, phoneNumber);
        WorkingHours = workingHours;
        this.password = password;
    }

    public int getWorkingHours() {

        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {

        WorkingHours = workingHours;
    }

    @Override
    public int getID() 
    {
            return ID;
    }
    
    @Override
    public void setID(int iD) {
      
        ID=iD;
    }
    
    @Override
    public String getPhoneNumber() {

            return PhoneNumber;
    }
    
    @Override
    public void SetPhoneNumber(String phoneNumber)
     {

        PhoneNumber=phoneNumber;
    }
    
    @Override
    public String getName() 
    {
        
        return Name;
    }
    
    @Override
    public void setName(String name) 
    {
    Name=name;  

    }
    
    @Override
    public String getAddress() 
    {
        return Address;    
    }
    
    @Override
    public void setAddress(String address) {
        
        Address=address;
    }
    
    @Override
    public String getGender() {
       
        return Gender;
    }
    
    @Override
    public void setGender(String gender) 
    {
        Gender=gender;
    }
    
    @Override
    public String getEmail() {
        return Email;
    }
    
    @Override
    public void setEmail(String email) {
      Email=email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void ListAllCustomers(int CoachId) {
            System.out.println("Coach " + this.getName() + "Has customers : ");
            for (Customer customer : Gym.getCustomers()) {
                        if(CoachId==customer.getAssignedCoach().getID())
                        {
                    System.out.println("Customer ID: " + customer.getID());
                    System.out.println("Customer Name: " + customer.getName());
                    System.out.println("Customer Gender: " + customer.getGender());
                    System.out.println("Customer Address: " + customer.getAddress());
                    System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
                    System.out.println("Customer Email: " + customer.getEmail());
                }
            }
        }
    public List<InBody> getInBodyHistory(int CustomerId) 
    {
        for (Customer customer : Gym.getCustomers()) 
        {
            if(CustomerId==customer.getID())
            {
                return customer.getInBodies();
            }

        }
        return null;
    }
    public Customer getCustomerByName(String customerName) {
        for (Customer customer : Gym.getCustomers()) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getCustomersByGender(String targetGender) 
    {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : Gym.getCustomers()) {
            if (customer.getGender().equalsIgnoreCase(targetGender)) {
                result.add(customer);
            }
        }
        return result;
    }
    public static Coach registerCoach(int iD, String name, String address, String gender, String email,
    String phoneNumber ,int workingHours,List<Customer>customers , String password )
{

for (Coach coach : Gym.getCoaches())

{
if (coach.getEmail().equals(email))
{
return null; // Registration failed since a user with the same email already exists
}

}
return new Coach(iD, name, address, gender, email, phoneNumber, workingHours, password);


}

public static  Coach LoginCoach(String email, String password) {
for (Coach coach :Gym.getCoaches()) 
{
if (coach.getEmail().equals(email) && coach.getPassword().equals(password)) {
return coach; // Login successful
}
}
return null; // Login failed
}
@Override

public String toString() {
    return "Coach ID: " + getID() +
           "\nName: " + getName() +
           "\nAddress: " + getAddress() +
           "\nGender: " + getGender() +
           "\nEmail: " + getEmail() +
           "\nPhone Number: " + getPhoneNumber() +
           "\nWorking Hours: " + getWorkingHours();
}
public static Coach getCoachDetails(Scanner scanner) {
    System.out.println("Enter coach name: ");
    String coachName = scanner.nextLine();

    Coach coach = findCoachByName(coachName);

    if (coach != null) {
        System.out.println("Coach found and has been assigned as your coach, your coach's name is : " + coach.getName());
        return coach;
    } else {
        System.out.println("Coach not found.");
        return null;
    }
}

public static Coach findCoachByName(String coachName) {
    for (Coach coach : Gym.getCoaches()) {
        if (coach.getName().equalsIgnoreCase(coachName)) {
            return coach;
        }
    }
    return null;
}

}
