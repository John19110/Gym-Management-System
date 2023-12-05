package Gym;
import java.util.ArrayList;
import java.util.List;

class Coach extends Person {
    protected int WorkingHours;
    protected int maxCustomers =10 ;
    protected List<Customer> customers;
    // constructor
    public Coach(int iD, int phoneNumber, String name, String address, String gender, String email, int workinghours) {
        super(iD, phoneNumber, name, address, gender, email);
        WorkingHours=workinghours;
        this. customers =new ArrayList<>();
    }
// getters and setters
    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }

    public int getMaxCustomer() {
        return maxCustomers;
    }

    public void setMaxCustomer(int maxCustomer) {
        this.maxCustomers = maxCustomer;
    }
    public List<Customer> getCustomers() {
        return customers;

    }
    // methods
    public List<InBody> getInBodyHistory(Customer customer) {
        return customer.;
    }

    public Customer getCustomerByName(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
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
