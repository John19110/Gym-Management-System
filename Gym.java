package  Mygym;
import java.util.ArrayList;
import java.util.List;

public class Gym 

{

    private static String name,address,phoneNumber;
    private  static List<Equipment> equipments;
    private static List<Customer> customers;
    private static List<Coach> coaches;
    private static List<Subscription> subscriptions;
    private static List<Membership> memberships;

    public Gym(String name, String address, String phoneNumber)
    {
    Gym.name = name;
    Gym.address = address;
    Gym.phoneNumber = phoneNumber;
    Gym.equipments = new ArrayList<>();
    Gym.customers = new ArrayList<>();
    Gym.coaches = new ArrayList<>();
    Gym.subscriptions = new ArrayList<>();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Gym.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Gym.address = address;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Gym.phoneNumber = phoneNumber;
    }

    public static List<Equipment> getEquipments() {
        return equipments;
    }

    public static void setEquipments(List<Equipment> equipments) {
        Gym.equipments = equipments;
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(List<Customer> customers) {
        Gym.customers = customers;
    }

    public static List<Coach> getCoaches() {
        return coaches;
    }

    public static void setCoaches(List<Coach> coaches) {
        Gym.coaches = coaches;
    }

    public static List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public static void setSubscriptions(List<Subscription> subscriptions) {
        Gym.subscriptions = subscriptions;
    }

    public static List<Membership> getMemberships() 
    {
        return memberships;
    }

    public static void setMemberships(List<Membership> memberships) {
        Gym.memberships = memberships;
    }
  
    public  static String tString() {
        return "Gym{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", equipments=" + equipments +
                ", customers=" + customers +
                ", coaches=" + coaches +
                ", subscriptions=" + subscriptions +
                ", memberships=" + memberships +
                '}';
    }


}

    
