package Mygym;
import java.util.ArrayList;
import java.util.List;

class Coach extends Person 
{
    protected int WorkingHours;
    protected List<Customer> Coachcustomers;



    public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours,
            List<Customer> coachcustomers) {
        super(iD, name, address, gender, email, phoneNumber);
        WorkingHours = workingHours;
        Coachcustomers = coachcustomers;
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
}