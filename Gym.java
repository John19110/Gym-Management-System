package gym;
import java.util.ArrayList;
import java.util.List;

public class Gym 
{
private String name,address,phoneNumber;
;
private List<String> sportsEquipments;
public static List<Equipment> equipments;
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


public String getName() {
return this.name;
}
public String getAddress() {
return this.address;
}
public String getPhoneNumber() {
return this.phoneNumber;
}
public void setName(String name) {
this.name = name;
}
public void setAddress(String address) {
this.address = address;
}
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}


public void addEquipment(Equipment equipment) {
    this.equipments.add(equipment);
}
public void addCustomer(Customer customer) {
    this.customers.add(customer);
}
public void addCoach(Coach coach) {
this.coaches.add(coach);
}
public void removeCoach(Coach coach) {
this.coaches.remove(coach);
}
public void removeEquipment(Equipment equipment) {
this.equipments.remove(equipment);
}
public void removeCustomer(Customer customer) {
this.customers.remove(customer);
}


public void displaySubscriptions()
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
public double calculateGymIncome() {
double totalIncome = 0.0;
for (Subscription subscription : subscriptions) {
Membership membership = subscription.getMembership();
totalIncome += membership.getPrice();
}
return totalIncome;
}
}