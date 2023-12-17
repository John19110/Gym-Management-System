package Mygym;
import java.sql.Date;
import java.util.List;
import java.io.*;
import java.util.ArrayList;



public class Customer extends Person
{




    private String password;
    private static List<Customer> registeredCustomers = new ArrayList<>();
    private Subscription Subscription;
    private List<InBody>InBodies;
    private Coach assignedCoach;
    private Membership membership;
    
   

   public Customer(int iD, String name, String address, String gender, String email, String phoneNumber,
                    String subscription, Coach assignedCoach, Membership membership, String password)
    {
       
        super(iD, name, address, gender, email, phoneNumber);
        Subscription = subscription;
        InBodies = inBodies;
        this.assignedCoach = assignedCoach;
        this.password = password;
        this.membership = membership;
        registeredCustomers.add(this);
    }

    public int getID()
     {
        return ID;
    }

    public void setID(int iD) 
    {
        ID = iD;
    }


    public String getPhoneNumber() 
    {
        return PhoneNumber;
    }


    public void setPhoneNumber(String PhoneNumber) 
    {
        this.PhoneNumber = PhoneNumber;
    }


    public String getName()
     {
        return Name;
    }


    public void setName(String name)
    {
        Name = name;
    }


    public String getAddress() 
    {
        return Address;
    }


    public void setAddress(String address) 
    {
        Address = address;
    }


    public String getGender() 
    {
        return Gender;
    }


    public void setGender(String gender) 
    {
        Gender = gender;
    }


    public String getEmail() 
    {
        return Email;
    }


    public void setEmail(String email)
    {
        Email = email;
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
    public void displayInbodyInformation(Date date) 
    
        {
            for (InBody inbody: getInBodies())
             {
                if (inbody.getDate_of_InBody().equals(date))
             {
                    System.out.println("The date of Inbody : " + inbody.getDate_of_InBody());
                    System.out.println("The Hight: " + inbody.getHeight());
                    System.out.println("The Minerals : " + inbody.getMinerals());
                    System.out.println("The Protein : " + inbody.getProtein());
                    System.out.println("The Total body water : " + inbody.getTotal_Body_Water());
                    System.out.println("The body fat mass : " + inbody.getBody_Fat_Mass());
                    System.out.println("The total weight : " + inbody.getTotal_Weight());      
             }

            }

        }
    public void DisplayHowManyKilosNeededToReduce()
    { 
        
        double leanBodyMass = InBodies.get(InBodies.size()).getTotal_Weight() - InBodies.get(InBodies.size()). getBody_Fat_Mass();

        // Step 3: Calculate estimated healthy weight (lean body mass + protein)
        double estimatedHealthyWeight = leanBodyMass + InBodies.get(InBodies.size()).getProtein();

        // Step 4: Calculate excess weight
        double excessWeight = InBodies.get(InBodies.size()).getTotal_Weight() - estimatedHealthyWeight;

        System.out.println( "you need to reduce  "  + excessWeight+" kilos." );
    }
    public void Myfun(){
        System.out.println("I'm a customer");

    }
    public void suii(){
        System.out.println("the only customer");
    }

    public static Customer registerCustomer(int iD, String name, String address, String gender, String email,
                                            String phoneNumber, String subscription, Coach assignedCoach,
                                            Membership membership, String password) 
    {
        for (Customer existingCustomer : registeredCustomers) {
            if (existingCustomer.getEmail().equals(email)) {
                return null; // Registration failed since a user with the same email already exists
            }
        }
        return new Customer(iD, name, address, gender, email, phoneNumber, subscription, assignedCoach, membership, password);
    }
    
    public static Customer CustomerLogin(String email, String password) {
        for (Customer customer : registeredCustomers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer; // Login successful
            }
        }
        return null; // Login failed
    }

}
