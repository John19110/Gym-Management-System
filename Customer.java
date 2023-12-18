package Mygym;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import gym.Equipment;
import gym.InBody;
import gym.Person;

import java.io.*;



public class Customer extends Person 
{





    private Subscription Subscription;
    private List<InBody>InBodies;
    private Coach assignedCoach;
    private Membership membership;
    private String password;
    
   

 

  
    public Customer(int iD, String name, String address, String gender, String email, String phoneNumber,
            Mygym.Subscription subscription, List<InBody> inBodies, Coach assignedCoach, Membership membership,
            String password) {
        super(iD, name, address, gender, email, phoneNumber);
        Subscription = subscription;
        InBodies = inBodies;
        this.assignedCoach = assignedCoach;
        this.membership = membership;
        this.password = password;
    }
    @Override
    public int getID() 
    {
            return ID;
    }
    
    @Override
    public void setID(int iD) {
      
        ID=iD;
    }
    
    @Override
    public String getPhoneNumber() {

            return PhoneNumber;
    }
    
    @Override
    public void SetPhoneNumber(String phoneNumber)
     {

        PhoneNumber=phoneNumber;
    }
    
    @Override
    public String getName() 
    {
        
        return Name;
    }
    
    @Override
    public void setName(String name) 
    {
    Name=name;  

    }
    
    @Override
    public String getAddress() 
    {
        return Address;    
    }
    
    @Override
    public void setAddress(String address) {
        
        Address=address;
    }
    
    @Override
    public String getGender() {
       
        return Gender;
    }
    
    @Override
    public void setGender(String gender) 
    {
        Gender=gender;
    }
    
    @Override
    public String getEmail() {
        return Email;
    }
    
    @Override
    public void setEmail(String email) {
      Email=email;
    }
    
    public Subscription getSubscription() 
    {
        return Subscription;
    }
    
    public Membership getMembership() 
    {
        return membership;
    }

    public void setMembership(Membership membership) 
    
    {
        this.membership = membership;
    }
    
    
    public List<InBody> getInBodies() 
    {
        return InBodies;
    }

    public void setInBodies(List<InBody> inBodies) 
    {
        InBodies = inBodies;
    }

    public Coach getAssignedCoach() 
    {
        return assignedCoach;
    }

    public void setAssignedCoach(Coach assignedCoach) 
    {
        this.assignedCoach = assignedCoach;
    }

    public void setSubscription(Subscription subscription) 
    {
        Subscription = subscription;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }


    
    public void displayCoahInfo()
       {
           System.out.println("The coach name is "+assignedCoach.getName());
           System.out.println("The phone number is "+assignedCoach.getPhoneNumber());
           System.out.println("The coach working hours is "+assignedCoach.getWorkingHours());
       
       }
    

       public  void displayEquipments()

       {
            try
{
    FileWriter CustomerFile=new FileWriter("test.txt");
    for (Equipment equipment:Gym.getEquipments())
    {
        CustomerFile.write("Equipment Name: " + equipment.getName());
        CustomerFile.write("Equipment Code: " + equipment.getCode());
        CustomerFile.write("Equipment Quantity: " + equipment.getQuantity());
        
        CustomerFile.close();
    }
    }

    catch( Exception e)
    {
        
    }

}


    public void displayMembershiPDetails()
    {

            System.out.println("The start date is : "+membership.getStartDate());
            System.out.println("The number of registered monthes is  : "+membership.getNumMonthsRegistered());
            System.out.println("The price is : "+membership.getPrice());
            System.out.println("The monthly plan is : "+membership.getMonthlyPlan());
    }
    public void displayInbodyInformation(LocalDateDate date) 
    
        {
            for (InBody inbody: getInBodies())
             {
                if (inbody.getDateOfInBody().equals(date))
             {
                    System.out.println("The date of Inbody : " + inbody.getDateOfInBody());
                    System.out.println("The Hight: " + inbody.getHeight());
                    System.out.println("The Minerals : " + inbody.getMinerals());
                    System.out.println("The Protein : " + inbody.getProtein());
                    System.out.println("The Total body water : " + inbody.getTotalBodyWater());
                    System.out.println("The body fat mass : " + inbody.getBodyFatMass());
                    System.out.println("The total weight : " + inbody.getTotalWeight());      
             }

            }

        }
    public void DisplayHowManyKilosNeededToReduce()
    { 
        
        double leanBodyMass = InBodies.get(InBodies.size()).getTotalWeight() - InBodies.get(InBodies.size()). getBodyFatMass();

    
        double estimatedHealthyWeight = leanBodyMass + InBodies.get(InBodies.size()).getProtein();

        
        double excessWeight = InBodies.get(InBodies.size()).getTotalWeight() - estimatedHealthyWeight;

        System.out.println( "you need to reduce  "  + excessWeight+" kilos." );
    }
    public void Myfun(){
        System.out.println("I'm customer ");

    }
    public void suii(){
        System.out.println("the only customer ");
    }
    public static Customer register(int iD, String name, String address, String gender, String email,
                                            String phoneNumber,Subscription subscription,Coach assignedCoach,
                                            Membership membership, String password )
    {
        for (Customer customer : Gym.getCustomers())
         {
            if (customer.getEmail().equals(email))
             {
                return null; // Registration failed since a user with the same email already exists
            }
        }
        return new Customer(iD, name, address, gender, email, phoneNumber,
         subscription, null, assignedCoach, membership, password);
    }
    
    
    public  static Customer  LoginCustomer(String email, String password)
     {
        for (Customer customer :Gym.getCustomers()) 
        {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer; // Login successful
            }
        }
        return null; // Login failed
    }

  
    @Override
    public String toString()
     {
        StringBuilder sb = new StringBuilder();
    
        sb.append(super.toString()); // Include Person details
        sb.append("Password: ").append(password).append("\n");
    
        if (Subscription != null) {
            sb.append("Subscription: ").append(Subscription.toString()).append("\n");
        } else {
            sb.append("Subscription: null\n");
        }
    
        if (InBodies != null) {
            sb.append("InBodies:\n");
            for (InBody inBody : InBodies) {
                sb.append(inBody.toString()).append("\n");
            }
        } else {
            sb.append("InBodies: null\n");
        }
    
        if (assignedCoach != null) {
            sb.append("Assigned Coach: ").append(assignedCoach.getName()).append("\n");
        } else {
            sb.append("Assigned Coach: null\n");
        }
    
        if (membership != null) {
            sb.append("Membership: ").append(membership.toString()).append("\n");
        } else {
            sb.append("Membership: null\n");
        }
    
        return sb.toString();
    }

    

}
