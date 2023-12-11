package  gym;
import java.util.ArrayList;
import java.util.List;

public class Gym 
{

    private String name,address,phoneNumber;
    private  static List<Equipment> equipments;
    private List<Customer> customers;
    private List<Coach> coaches;
    private List<Subscription> subscriptions;
    private List<Membership> memberships;

    public Gym(String name, String address, String phoneNumber)
    {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    Gym.equipments = new ArrayList<>();
    this.customers = new ArrayList<>();
    this.coaches = new ArrayList<>();
    this.subscriptions = new ArrayList<>();
    }


    

public String getName() 
    {
        return name;
    }




    public void setName(String name)
    {
        this.name = name;
    }




    public String getAddress()
    {
        return address;
    }




    public void setAddress(String address) 
    {
        this.address = address;
    }




    public String getPhoneNumber() 
    {
        return phoneNumber;
    }




    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }




    public static List<Equipment> getEquipments() 
    {
        return equipments;
    }




    public void setEquipments(List<Equipment> equipments) 
    {
        Gym.equipments = equipments;
    }




    public List<Customer> getCustomers() 
    {
        return customers;
    }




    public void setCustomers(List<Customer> customers) 
    {
        this.customers = customers;
    }




    public List<Coach> getCoaches()
    {
        return coaches;
    }




    public void setCoaches(List<Coach> coaches)
    {
        this.coaches = coaches;
    }




    public List<Subscription> getSubscriptions() 
    {
        return subscriptions;
    }




    public void setSubscriptions(List<Subscription> subscriptions) 
    {
        this.subscriptions = subscriptions;
    }

    
    public List<Membership> getMemberships() {
        return memberships;
    }
    
    
    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }
    
}