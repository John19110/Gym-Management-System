package  gym;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscription;

public class Gym 
{
private String name,address,phoneNumber;
;
private List<String> sportsEquipments;
public  List<Equipment> equipments;
private List<Customer> customers;
private List<Coach> coaches;
private List<Subscription> subscriptions;

public Gym(String name, String address, String phoneNumber)
 {
this.name = name;
this.address = address;
this.phoneNumber = phoneNumber;
this.sportsEquipments = new ArrayList<>();
this.equipments = new ArrayList<>();
this.customers = new ArrayList<>();
this.coaches = new ArrayList<>();
this.subscriptions = new ArrayList<>();
}


public List<String> getSportsEquipments() {
    return sportsEquipments;
}


public void setSportsEquipments(List<String> sportsEquipments) {
    this.sportsEquipments = sportsEquipments;
}


public List<Equipment> getEquipments() {
    return equipments;
}


public void setEquipments(List<Equipment> equipments) {
    this.equipments = equipments;
}


public   List<Customer>  getCustomers() {
    return customers;
}


public void setCustomers(List<Customer> customers) {
    this.customers = customers;
}


public List<Coach> getCoaches() {
    return coaches;
}


public void setCoaches(List<Coach> coaches) {
    this.coaches = coaches;
}


public List<Subscription> getSubscriptions() {
    return subscriptions;
}


public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
}


public String getName() 
{
return this.name;
}
public String getAddress() 

{
return this.address;
}

public String getPhoneNumber() 

{
return this.phoneNumber;
}

public void setName(String name)
{
this.name = name;
}

public void setAddress(String address)
{
this.address = address;
}

public void setPhoneNumber(String phoneNumber) 
{
this.phoneNumber = phoneNumber;
}


public void addEquipment(Equipment equipment)
{
    this.equipments.add(equipment);
}

public void addCustomer(Customer customer)
{
    this.customers.add(customer);
}

public void addCoach(Coach coach) 
{
this.coaches.add(coach);
}
public void removeCoach(Coach coach)
{
this.coaches.remove(coach);
}
public void removeEquipment(Equipment equipment) 
{
this.equipments.remove(equipment);
}

public void removeCustomer(Customer customer)
{
this.customers.remove(customer);
}


public  void displaySubscriptions(Gym gym,gym.Subscription subscription)
 {
System.out.println("Subscriptions:");
for (Subscription subscription : subscriptions) {
System.out.println("Customer: " + subscription.getCustomer().getName());
System.out.println("Coach: " + subscription.getCoach().getName());
System.out.println("Start Date: " + subscription.getStartDate());
System.out.println("End Date: " + subscription.getEndDate());
System.out.println("---------");
}

}
 public  void displayEquipment(Equipment equipment) 
        {
            for (int i=0;i<equipments.size();i++)
        {
        System.out.println("Equipment Name: " + equipments.get(i).getName());
        System.out.println("Equipment Code: " + equipments.get(i).getCode());
        System.out.println("Equipment Quantity: " + equipments.get(i).getQuantity());
    
        }

public double calculateGymIncome() {
double totalIncome = 0.0;
for (Subscription subscription : subscriptions) {
Membership membership = subscription.getMembership();
totalIncome += membership.getPrice();
}
return totalIncome;
}

}
}