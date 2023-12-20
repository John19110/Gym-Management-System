package Mygym;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Coach extends Person 
{
    protected int WorkingHours;
    protected String password;
    protected ArrayList<Customer>CoacheCustomers;



    

    public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours,
            String password, ArrayList<Customer> coacheCustomers) {
        super(iD, name, address, gender, email, phoneNumber);
        WorkingHours = workingHours;
        this.password = password;
        CoacheCustomers = coacheCustomers;
    }


    public int getWorkingHours() {

        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {

        WorkingHours = workingHours;
    }

    
    public int getID() 
    {
            return ID;
    }
    
    public void setID(int iD) {
      
        ID=iD;
    }
    
    
    public String getPhoneNumber() {

            return PhoneNumber;
    }
    
    
    public void SetPhoneNumber(String phoneNumber)
     {

        PhoneNumber=phoneNumber;
    }
    
    public String getName() 
    {
        
        return Name;
    }
    
    public void setName(String name) 
    {
    Name=name;  

    }
    
    public String getAddress() 
    {
        return Address;    
    }
    
    public void setAddress(String address) {
        
        Address=address;
    }
    
    public String getGender() {
       
        return Gender;
    }
    
    public void setGender(String gender) 
    {
        Gender=gender;
    }
    
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String email) {
      Email=email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Customer> getCoacheCustomers() {
        return CoacheCustomers;
    }
    
    public void setCoacheCustomers(ArrayList<Customer> coacheCustomers) {
        CoacheCustomers = coacheCustomers;
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
    public Customer getCustomerByName(String customerName)
     {
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
    String phoneNumber ,int workingHours, String password )
{

for (Coach coach : Gym.getCoaches())

{
if (coach.getEmail().equals(email))
{
return null; // Registration failed since a user with the same email already exists
}

}
return  new Coach(iD, name, address, gender, email, phoneNumber, workingHours, password, null);


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
           "\nCoach Customers:"+NamesOfCoachCustomers()+
           "\nWorking Hours: " + getWorkingHours();
    // Add any other relevant information you want to include
}

public static Coach getCoachDetails(Scanner scanner) 
{
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
private ArrayList<String>NamesOfCoachCustomers()
{
    ArrayList<String>Customersnames=new ArrayList<>();
for(Customer customer:CoacheCustomers)

{
    Customersnames.add(customer.getName());
}    


    return Customersnames;
} 


}
