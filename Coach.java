package gym;
import java.util.ArrayList;
import java.util.List;

class Coach extends Person {
    protected int WorkingHours;
    protected int maxCustomers =10 ;
    protected List<Customer> customers;
    // constructor
  
// getters and setters
    
    // methods
    // public List<InBody> getInBodyHistory(Customer customer) {
    //     return customer;
    // }
    

    public Customer getCustomerByName(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
    public Coach(int iD, String PhoneNumber, String name, String address, String gender, String email, int workingHours,
            int maxCustomers, List<Customer> customers) {
        super(iD, PhoneNumber, name, address, gender, email);
        WorkingHours = workingHours;
        this.maxCustomers = maxCustomers;
        this.customers = customers;
    }
    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }

    public int getMaxCustomers() {
        return maxCustomers;
    }

    public void setMaxCustomers(int maxCustomers) {
        this.maxCustomers = maxCustomers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomersByGender(String targetGender) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getGender().equalsIgnoreCase(targetGender)) {
                result.add(customer);
            }
        }
        return result;
    }
}