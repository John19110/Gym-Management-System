package gym;
import java.sql.Date;
import java.util.List;

public class Customer extends Person
{

    private String Subscription;
    private List<InBody>InBodies;
    private Coach assignedCoach;
    private Membership membership;
    
    public Customer(int iD, String name, String address, String gender, String email, String phoneNumber,
            String subscription, List<InBody> inBodies, Coach assignedCoach, Membership membership) {
        super(iD, name, address, gender, email, phoneNumber);
        Subscription = subscription;
        InBodies = inBodies;
        this.assignedCoach = assignedCoach;
        this.membership = membership;
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

    
    public String getSubscription() 
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

    public void setSubscription(String subscription) 
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
           for (Equipment equipment:Gym.getEquipments())
           {
               System.out.println("Equipment Name: " + equipment.getName());
               System.out.println("Equipment Code: " + equipment.getCode());
               System.out.println("Equipment Quantity: " + equipment.getQuantity());
               
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
            for (int i = 0; i < InBodies.size(); i++)
             {
                if (InBodies.get(i).getDate_of_InBody().equals(date))
             {
                    System.out.println("The date of Inbody : " + InBodies.get(i).getDate_of_InBody());
                    System.out.println("The Hight: " + InBodies.get(i).getHeight());
                    System.out.println("The Minerals : " + InBodies.get(i).getMinerals());
                    System.out.println("The Protein : " + InBodies.get(i).getProtein());
                    System.out.println("The Total body water : " + InBodies.get(i).getTotal_Body_Water());
                    System.out.println("The body fat mass : " + InBodies.get(i).getBody_Fat_Mass());
                    System.out.println("The total weight : " + InBodies.get(i).getTotal_Weight());      
             }

            }

        }
    public void DesplayHowManyKilosNeededToReduce()
    { 
        
        double leanBodyMass = InBodies.get(InBodies.size()).getTotal_Weight() - InBodies.get(InBodies.size()). getBody_Fat_Mass();

        // Step 3: Calculate estimated healthy weight (lean body mass + protein)
        double estimatedHealthyWeight = leanBodyMass + InBodies.get(InBodies.size()).getProtein();

        // Step 4: Calculate excess weight
        double excessWeight = InBodies.get(InBodies.size()).getTotal_Weight() - estimatedHealthyWeight;

        System.out.println( "you need to reduce  "  + excessWeight+" kilos ." );
    }


}