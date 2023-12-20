package Mygym;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;






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

    public int getID() 
    {
            return ID;
    }
    
    public void setID(int iD) {
      
        ID=iD;
    }
    
    public String getPhoneNumber() {

            return PhoneNumber;
    }
    
    public void SetPhoneNumber(String phoneNumber)
     {

        PhoneNumber=phoneNumber;
    }
    
    public String getName() 
    {
        
        return Name;
    }
    
    public void setName(String name) 
    {
    Name=name;  

    }
    
    public String getAddress() 
    {
        return Address;    
    }
    
    public void setAddress(String address) {
        
        Address=address;
    }
    
    public String getGender() {
       
        return Gender;
    }
    
    public void setGender(String gender) 
    {
        Gender=gender;
    }
    
    public String getEmail() {
        return Email;
    }
    
    
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
        
        double leanBodyMass = InBodies.get(InBodies.size()-1).getTotalWeight() - InBodies.get(InBodies.size()-1). getBodyFatMass();

        // Step 3: Calculate estimated healthy weight (lean body mass + protein)
        double estimatedHealthyWeight = leanBodyMass + InBodies.get(InBodies.size()-1).getProtein();

        // Step 4: Calculate excess weight
        double excessWeight = InBodies.get(InBodies.size()-1).getTotalWeight() - estimatedHealthyWeight;

        System.out.println( "you need to be  "  + excessWeight+" kilos from your weigh ." );
    }
  
//     public   Customer register(int iD, String name, String address, String gender, String email,
//     String phoneNumber,Subscription subscription,Coach assignedCoach,
//     Membership membership, String password )
// {
// for (Customer customer : Gym.getCustomers())
// {
// if (customer.getEmail().equals(email))
// {
// return null; // Registration failed since a user with the same email already exists
// }
// }
// try {

// if (assignedCoach != null) {

// int currentCustomers = 0;

// for (Customer customer : Gym.getCustomers()) {
// if (customer.getAssignedCoach().equals(assignedCoach))
//  {
// currentCustomers++;
// }
// }

// if (currentCustomers >= 10) {
// throw new IllegalStateException("The coach cannot have more than 10 customers.");
// }
// }

// return new Customer(iD, name, address, gender, email, phoneNumber,
// subscription, null, assignedCoach, membership, password);



// } catch (IllegalStateException e ) {
// System.err.println("Error during registration: " + e.getMessage());
// return null;
// }
// }
public Customer Register() throws ParseException
{

    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter your ID: ");
    int customerid = scanner.nextInt();
    scanner.nextLine();
    do 
    {

        for(Customer customer:Gym.getCustomers())
        
        {
            if ( customer.getID()==customerid)
            {
                customerid=0;
                
            }
        }
        if (customerid==0)
        {
            System.out.println("Their are another Customer with this ID , please enter another ID");

            customerid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character


        }
    }
        while (customerid==0);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your address: ");
    String address = scanner.nextLine();

    System.out.println("Enter your gender: ");
    String gender = scanner.nextLine();

    System.out.println("Enter your phone number: ");
    String phoneNumber = scanner.nextLine();
    
    System.out.println("Enter your email: ");
    String email = scanner.nextLine();
    
    System.out.println("Enter your password: ");
    String customerPassword = scanner.nextLine();
    

    System.out.println("Enter your coach id: ");
    int  coachid = scanner.nextInt();

    Coach assignedCoach=null;
    do 
    {

        for(Coach coach:Gym.getCoaches())
        
        {
            if ( coach.getID()==coachid)
            {
                assignedCoach=coach;
                
            }
        }
        if (assignedCoach==null)
        {
            System.out.println("Enter valid ID");
            coachid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character


        }
    }
        while (assignedCoach==null);

                            System.out.println("Enter your start Date: ");
                            String dateString = scanner.next();
                            SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                            Date startdate = dateF.parse(dateString);
                            
                        
                             System.out.println("Enter your end Date: ");
                             String dateString2 = scanner.next();
                             SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
                            Date endDate = Date.parse(dateString2);
                          

                                                
                                               
                            System.out.println(" ------- monthly plan --------");
                            System.out.println(" Enter 1 if you want 3 days per week(100$) or 2 if you want 6 days per week)(170$)");

                            int monthlyplanchoice=scanner.nextInt();
                            String monthlyplan=null;
                            int price =0;
                            do {

                                if (monthlyplanchoice==1)
                                {
                                    monthlyplan =" 3 days per week ";
                                    price = 100;

                                }
                            else if (monthlyplanchoice==2)
                            {
                                monthlyplan =" 6 days per week ";
                                 price = 170;
                            }
                            else
                            {
                                System.out.println("Invalid number ");
                                
                            }
                        }
                        while (monthlyplan==null&&price==0);
                            


                            System.out.println(" Enter number of monthes : ");
                            int numberofmonthes = scanner.nextInt();


                            System.out.println("Enter today's  Date: ");
                            String dateString3 = scanner.next();
                            SimpleDateFormat datee = new SimpleDateFormat("yyyy-MM-dd");
                            Date DateOfSubscription = datee.parse(dateString3);
                          
                                 
                            Membership membership =new Membership(startdate, endDate, monthlyplan, numberofmonthes, price);
                            Subscription subscription=new Subscription(customerid, assignedCoach.getID(), membership, DateOfSubscription);
                            Customer newCustomer = new Customer(customerid, name, address, gender, email, phoneNumber,
                            subscription, null,assignedCoach, membership, customerPassword);


                            
                            Gym.getCustomers().add(newCustomer);
                            Gym.getMemberships().add(membership);
                            Gym.getSubscriptions().add(subscription);
                            assignedCoach.getCoacheCustomers().add(newCustomer);
                            System.out.println("Registeration Succeeded!");
                            System.out.println("Approved !");




        scanner.close();   
        
    return newCustomer;
}

    
    
    public   static Customer  LoginCustomer(String email, String password)
     {
        for (Customer customer :Gym.getCustomers()) 
        {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer; // Login successful
            }
        }
        return null; // Login failed
    }

  
    public String toString() {

return "Customer ID: " + getID() +
                   "\nName: " + getName() +
                   "\nAddress: " + getAddress() +
                   "\nGender: " + getGender() +
                   "\nEmail: " + getEmail() +
                   "\nPhone Number: " + getPhoneNumber() +
                   "\nSubscription: " + getSubscription() +
                   "\nInBodies: " + getInBodies() +
                   "\nAssigned Coach: " + assignedCoach.getName() +
                   "\nMembership: " + membership.getMonthlyPlan() +
                   "\nPassword: " + password;    
    }

}
