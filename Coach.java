package Mygym;
import java.util.ArrayList;
import java.util.Scanner;

class Coach extends Person 
{
    protected int WorkingHours;
    protected String password;
    protected ArrayList<Customer>CoacheCustomers;



    

    public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours,
            String password, ArrayList<Customer> coacheCustomers) {
        super(iD, name, address, gender, email, phoneNumber);
        WorkingHours = workingHours;
        this.password = password;
        CoacheCustomers = coacheCustomers;
    }
      public Coach(int iD, String name, String address, String gender, String email, String phoneNumber, int workingHours,
            String password) {

                super(iD, name, address, gender, email, phoneNumber);
                this.CoacheCustomers = new ArrayList();
            }


    public int getWorkingHours() {

        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {

        WorkingHours = workingHours;
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
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Customer> getCoacheCustomers() {
        return CoacheCustomers;
    }
    
    public void setCoacheCustomers(ArrayList<Customer> coacheCustomers) {
        CoacheCustomers = coacheCustomers;
    }
    
    public void ListAllCustomers(int CoachId) {
            System.out.println("Coach " + this.getName() + " Has customers : ");
            for (Customer customer : Gym.getCustomers()) {
                        if(CoachId==customer.getAssignedCoach().getID())
                        {
                    System.out.println("Customer ID: " + customer.getID());
                    System.out.println("Customer Name: " + customer.getName());
                    System.out.println("Customer Gender: " + customer.getGender());
                    System.out.println("Customer Address: " + customer.getAddress());
                    System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
                    System.out.println("Customer Email: " + customer.getEmail());
                }
            }
        }
    public void getInBodyHistory(int CustomerId) 
    {
        for (Customer customer : Gym.getCustomers()) 
        {
            if(CustomerId==customer.getID())
            {
                for(InBody customerinbodie: customer.getInBodies())
                {
                    System.out.println("Date of InBody: " +customerinbodie.getDateOfInBody());
                    System.out.println("Height: " + customerinbodie.getHeight() + " cm");
                    System.out.println("Total Weight: " + customerinbodie.getTotalWeight() + " kg");
                    System.out.println("Body Fat Mass: " + customerinbodie.getBodyFatMass() + " kg");
                    System.out.println("Minerals: " +customerinbodie. getMinerals() + " kg");
                    System.out.println("Total Body Water: " + customerinbodie.getTotalBodyWater() + " kg");
                    System.out.println("Protein: " +customerinbodie. getProtein() + " kg");
                }

            }

        }
    }
    public void getCustomerByName(String customerName)
     {
        for (Customer customer : Gym.getCustomers())
         {
            if (customer.getName().equals(customerName)) 
            {
                
                System.out.println("Custmer ID"+customer.getID());
                System.out.println("Custmer name"+customer.getName());
                System.out.println("Custmer gender"+customer.getGender());
                System.out.println("Custmer Email"+customer.getEmail());
                System.out.println("Custmer Phone Number"+customer.getPhoneNumber());
            }
        }

    }

    public void getCustomersByGender(String targetGender) 
    {
        for (Customer customer : CoacheCustomers) {
            if(customer.getGender().equalsIgnoreCase(targetGender)){

                System.out.println("Customer name: "+customer.getName());
        }
    }

     }

     @Override
    public   Coach  Register() 
{

    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter your ID: ");
    int coachid = scanner.nextInt();
    scanner.nextLine();
    do 
    {

        for(Coach coach:Gym.getCoaches())
        
        {
            if ( coach.getID()==coachid)
            {
                coachid=0;
                
            }
        }
        if (coachid==0)
        {
            System.out.println("Their are another Customer with this ID , please enter another ID");

            coachid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character


        }
    }
        while (coachid==0);

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
    String CoachPassword = scanner.nextLine();

    System.out.println("Enter your working hour per day  (Max 10): ");
    int  workinghours = scanner.nextInt();
    if   (workinghours>10||workinghours<=0);
    {
        while(workinghours>10||workinghours<=0){

            System.out.println("enter valid number");
            workinghours = scanner.nextInt();
        }
       
      
    }



    ArrayList<Customer>coachCustomerswhenRegisterd=new ArrayList<>();

    Coach coach=new Coach(coachid, name, address, gender, email, phoneNumber,
     workinghours, CoachPassword, coachCustomerswhenRegisterd);

        Gym.getCoaches().add(coach);
        System.out.println("Registeration successful !"); 
    return coach;
}


    @Override
public   Coach Login(String email, String password) {
for (Coach coach :Gym.getCoaches()) 
{
if (coach.getEmail().equals(email) && coach.getPassword().equals(password)) {
return coach; // Login successful
}
}
return null; // Login failed
}
@Override

public String toString() {
    return "Coach ID: " + getID() +
           "\nName: " + getName() +
           "\nAddress: " + getAddress() +
           "\nGender: " + getGender() +
           "\nEmail: " + getEmail() +
           "\nPhone Number: " + getPhoneNumber() +
           "\nCoach Customers:"+NamesOfCoachCustomers()+
           "\nWorking Hours: " + getWorkingHours();
    // Add any other relevant information you want to include
}

public static Coach getCoachDetails(Scanner scanner) 
{
    String coachName = scanner.nextLine();

    Coach coach = findCoachByName(coachName);

    if (coach != null) {
        System.out.println("Coach found and has been assigned as your coach, your coach's name is : " + coach.getName());
        return coach;
    } else {
        System.out.println("Coach not found.");
        return null;
    }
}

public static Coach findCoachByName(String coachName) {
    for (Coach coach : Gym.getCoaches()) {
        if (coach.getName().equalsIgnoreCase(coachName)) {
            return coach;
        }
    }
    return null;
}
private ArrayList<String>NamesOfCoachCustomers()
{
    ArrayList<String>Customersnames=new ArrayList<>();
for(Customer customer:CoacheCustomers)

{
    Customersnames.add(customer.getName());
}    


    return Customersnames;
} 


}
