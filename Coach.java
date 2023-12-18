package Mygym;
import java.util.ArrayList;
import java.util.List;

class Coach extends Person 
{
    protected int WorkingHours;
    protected List<Customer> Coachcustomers;
    protected String password;



    public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours,
            List<Customer> coachcustomers, String password) {
        super(iD, name, address, gender, email, phoneNumber);
        WorkingHours = workingHours;
        Coachcustomers = coachcustomers;
        this.password = password;
    }

    public int getWorkingHours() {

        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {

        WorkingHours = workingHours;
    }
    public List<Customer> getCustomers() {
        return Coachcustomers;

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


    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
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

 

    public void ListAllCustomers(int CoachId) {
            System.out.println("Coach " + this.getName() + "Has customers : ");
            for (Customer customer : Coachcustomers) {
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
        for (Customer customer : Coachcustomers) 
        {
            if(CustomerId==customer.getID())
            {
                return customer.getInBodies();
            }

        }
        return null;
    }
    public Customer getCustomerByName(String customerName) {
        for (Customer customer : Coachcustomers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getCustomersByGender(String targetGender) 
    {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : Coachcustomers) {
            if (customer.getGender().equalsIgnoreCase(targetGender)) {
                result.add(customer);
            }
        }
        return result;
    }
    public static Coach register(int iD, String name, String address, String gender, String email,
    String phoneNumber ,int workingHours,List<Customer>customers , String password )
{

for (Coach coach : Gym.getCoaches())

{
if (coach.getEmail().equals(email))
{
return null; // Registration failed since a user with the same email already exists
}

}
return new Coach(iD, name, address, gender, email, phoneNumber, iD, null,password);


}

public static Customer Login(String email, String password) {
for (Customer customer :Gym.getCustomers()) 
{
if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
return customer; // Login successful
}
}
return null; // Login failed
}
public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append(super.toString()); // Include Person details
    sb.append("Working Hours: ").append(WorkingHours).append("\n");

    if (Coachcustomers != null) {
        sb.append("Coach's Customers:\n");
        for (Customer customer : Coachcustomers) {
            sb.append(customer.getName().toString()).append("\n");
        }
    } else {
        sb.append("Coach's Customers: null\n");
    }

    sb.append("Password: ").append(password).append("\n");

    return sb.toString();
}

}
