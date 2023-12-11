package gym;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class Cooach extends Person 
{
    protected int WorkingHours;
    protected int MaxCustomers;
    protected List<Customer> customers;
    protected List<Cooach> coaches;

    public Cooach(int iD, String PhoneNumber, String name, String address, String gender, String email, int workinghours) {
        super(iD, PhoneNumber, name, address, gender, email);
        WorkingHours=workinghours;
        this. customers =new ArrayList<>();
        this. coaches =new ArrayList<>();
    }
    public int getWorkingHours() {

        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {

        WorkingHours = workingHours;
    }
    public List<Customer> getCustomers() {
        return customers;

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

    public int getMaxCustomers() {
        return MaxCustomers;
    }

    public void setMaxCustomers(int maxCustomers) {
        MaxCustomers = maxCustomers;
    }

    public void ListAllCustomers(int CoachId) {
            System.out.println("Coach " + this.getName() + "Has customers : ");
            for (Customer customer : customers) {
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
        for (Customer customer : customers) 
        {
            if(CustomerId==customer.getID())
            {
                return customer.getInBodies();
            }

        }
        return null;
    }
    public Customer getCustomerByName(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getCustomersByGender(String targetGender) 
    {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getGender().equalsIgnoreCase(targetGender)) {
                result.add(customer);
            }
        }
        return result;
    }
}
