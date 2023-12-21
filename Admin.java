package Mygym;
import java.util.Date;
import java.util.Scanner;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Admin implements Serializable
{
 Scanner scanner = new Scanner(System.in);
 protected   Gym gym;
 String adminUserName = "admin";
 String adminPassword = "admin";

     

    public Admin(Gym gym) 
    {
        this.gym = gym;
    }
   
    public void addMembership(Membership membership)
    {
        Gym.getMemberships().add(membership);
    }
    public void addSubscription(Subscription subscription)
    {
        Gym.getSubscriptions().add(subscription);
    }
    public void addCustomer(Customer customer)
    {
        Gym.getCustomers().add(customer);
    }
    public void removeCustomer(String customerName) {
        Customer.removeCustomerByName(customerName);
    }

    public void addCoach(Coach coach) 
    {
        Gym.getCoaches().add(coach);
    }

    public void addEquipment(Equipment equipment)
    {
        Gym.getEquipments().add(equipment);
    }

    public void removeEquipment(Equipment equipment)
    {
        Gym.getEquipments().remove(equipment);
    }
        public void removeCoach(String coachName) {
        Coach.removeCoachByName(coachName);
    }

                //Edit Customer Functions

    public boolean editCustomer() 
    { 
        
            
        System.out.println("Enter the Customer name :");
            
        String name = scanner.nextLine();
            
            for(Customer customer1:Gym.getCustomers())
            {
            
                if (customer1.getName().equals(name))
                {
                
                    System.out.println("Select attribute to edit:");
                    System.out.println("1. ID");
                    System.out.println("2. Name");
                    System.out.println("3. Address");
                    System.out.println("4. Gender");
                    System.out.println("5. Email");
                    System.out.println("6. Phone Number");
                    System.out.println("7. Password");

                    // Get admin's choice
                    
            int choice5 = scanner.nextInt();
            switch (choice5) 
            {

                case 1:{
                    System.out.println("Enter new ID:");
                    int newID = scanner.nextInt();
                    customer1.setID(newID);
                    break;
                    }
                case 2:{
                    System.out.println("Enter new Name:");
                    String newName = scanner.next();
                    customer1.setName(newName);
                    break;
                    }
                case 3:{
                    System.out.println("Enter new Address:");
                    String newAddress = scanner.next();
                    customer1.setAddress(newAddress);
                    break;
                    }
                case 4:{
                    System.out.println("Enter new Gender:");
                    String newGender = scanner.next();
                    customer1.setGender(newGender);
                    break;
                    }
                case 5:{
                    System.out.println("Enter new Email:");
                    String newEmail = scanner.next();
                    customer1.setEmail(newEmail);
                    break;
                }
                case 6:{
                    System.out.println("Enter new Phone Number:");
                    String newPhoneNumber = scanner.next();
                    customer1.SetPhoneNumber(newPhoneNumber);
                    break;
                }
                case 7:{
                System.out.println("Enter new Password:");
                String newPassword = scanner.next();
                customer1.setPassword(newPassword);
                break;
                }
                default:{
                    System.out.println("Invalid choice");
                break;
                }
              }
              return true;
            }           
          }
          return false;

  }
    public void editEquipment()
    {
        String  choice10;
        int choice5;
       
             System.out.println("Enter the code of the equipment you wnat to edit ");
             
             int equipmentcode =scanner.nextInt();
            

             Equipment equipment=new Equipment(null, null, null);
           
             for(Equipment equipment1:Gym.getEquipments())
             
                 {
                     if (equipmentcode==equipment.getCode())
                     
                     {
                     equipment=equipment1;
                    }
                //if bracket

                
            }//for bracke
                     System.out.println("Select attribute to edit:");
                     System.out.println("1. Name");
                     System.out.println("2. Code");
                     System.out.println("3. Quantity");
                     choice5 = scanner.nextInt();
                     switch (choice5)
                 {
                
                 case 1:
                    {

                     System.out.println("Enter new Name:");
                     String newName = scanner.next();
                     equipment. setEquepmentName(newName);
                     System.out.println(" update done !");
                     break;
                    }
                    case 2:
                    {
                        System.out.println("Enter new Code:");
                        int newCode = scanner.nextInt();
                        equipment.setCode(newCode);
                        System.out.println(" update done !");
                     break;
                 }
                 case 3:
               {
                 System.out.println("Enter new Quantity:");
                 int newQuantity = scanner.nextInt();
                 equipment.setQuantity(newQuantity);
                 System.out.println(" update done !");
                 break;
                }
                
                default:
                System.out.println("Invalid choice");
               
            }//switch brakcet5
  
  
    
    




        

    }
    public void addCoach() 
    {
        System.out.println("Enter Coach ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter coach name: ");
        String name = scanner.nextLine();

        System.out.println("Enter coach  address: ");
        String address = scanner.nextLine();

        System.out.println("Enter coach gender: ");
        String gender = scanner.nextLine();

        System.out.println("Enter coach phone number: ");
        String phoneNumber = scanner.nextLine();

    
        System.out.println("Enter coach email: ");
        String email = scanner.nextLine();
        
        System.out.println("Enter coach password: ");
        String Coachpassword = scanner.nextLine();
        
        
    
        Coach newCoach = new Coach(id, name, address, gender, email, phoneNumber, id, Coachpassword, null);
       
            Gym.getCoaches().add(newCoach);
            System.out.println("New Coach has been added!");
        
    }
    public void editCoach()
    {
        System.out.println("Enter the Coach name :");
        String name = scanner.nextLine();
   for(Coach coach:Gym.getCoaches())

   {
       if (coach.getName().equals(name))
       {
           

           
               System.out.println("Select attribute to edit:");
               System.out.println("1. ID");
               System.out.println("2. Name");
               System.out.println("3. Address");
               System.out.println("4. Gender");
               System.out.println("5. Email");
               System.out.println("6. Phone Number");
               System.out.println("8. Password");

               // Get admin's choice
               
               int choice5 = scanner.nextInt();
           switch (choice5) 
               {

               
           case 1:{
               System.out.println("Enter new ID:");

               int newID = scanner.nextInt();
           
               coach.setID(newID);
               break;
           }
           case 2:{

               System.out.println("Enter new Name:");
               String newName = scanner.next();
               coach.setName(newName);
               break;
           }
           case 3:{
               
               System.out.println("Enter new Address:");
               String newAddress = scanner.next();
               coach.setAddress(newAddress);
               break;
           }
           case 4:{
           
               System.out.println("Enter new Gender:");
               String newGender = scanner.next();                   
               coach.setGender(newGender);
               break;

           }
           case 5:{
           
           System.out.println("Enter new Email:");
           
           String newEmail = scanner.next();
           
           coach.setEmail(newEmail);
           break;
           }
           case 6:{
           
           System.out.println("Enter new Phone Number:");
           
           String newPhoneNumber = scanner.next();
           
           coach.SetPhoneNumber(newPhoneNumber);
           break;
           }


           case 8:{
           System.out.println("Enter new Password:");
           String newPassword = scanner.next();
           coach.setPassword(newPassword);
           break;
           }
default:
System.out.println("Invalid choice");
        }
    }
  }
}

    public void displaySubscriptionHistory(int customerId) 
    {
		System.out.println("Subscription History for Customer :  "+customerId );
		
		for (Subscription subscription : Gym.getSubscriptions())
         {
			if(subscription.getCustomerId() == customerId) 
            
            {
			System.out.println("Customer : " + subscription.getCustomerId());
			System.out.println("Coach : " + subscription.getCoachId());
			System.out.println("The date of subescription : " + subscription.getDateOfSubscription());
            System.out.println("The Membership : " + subscription.getMembership());
			
		    }
		}

	}

    public void displayCustomersByCoach(int coachId)
    {
        for(Coach coach: Gym.getCoaches())
        {
                if (coach.getID()==coachId)
                System.out.println("Customers with Coach : \n" + coach.getName());
        }

         for (Customer customer : Gym.getCustomers()) 

         {
            if  (customer.getAssignedCoach().getID() == coachId)

            {
                System.out.println(customer.getName());
            }

        }

    }

    public void CustomerByGivenDate(String month,int year ) 

    {   
        
        System.out.println("Customers subscribed in  " + month + year) ;
        for (Subscription subscription : Gym.getSubscriptions())
         {

           
             try 
             {
                 if (isSameMonth(subscription.getDateOfSubscription(),month)&&isSameYear(subscription.getDateOfSubscription(),year))
                   {
                     System.out.println("  customer ID : "+subscription.getCustomerId());
                     
                    }
                    
                }
                 catch (ParseException e) 
                {
                    System.out.println("Error parsing the date: " + e.getMessage());
                 }
        }
        
    }


    public void CustomerByGivenDate(Date date ) 

        {

     for (Subscription subscription : Gym.getSubscriptions())
     {

             if (subscription.getDateOfSubscription()==date)
             {
                 
                 System.out.println(" Customer ID : "+subscription.getCustomerId());
                     
                    }
                    
                }
                
            }





            

    public void monthlyIncome(String month,int year) throws ParseException 
    {
        double totalIncome = 0.0;
                
        for (Subscription subscription : Gym.getSubscriptions()) 
        {
            
            if (isSameMonth (subscription.getDateOfSubscription(),month) && isSameYear(subscription.getDateOfSubscription(),year)) 
            {
                 
                for(Customer customer: Gym.getCustomers())
                {

                        if(subscription.getCustomerId()==customer.getID())
                        {
                            totalIncome+=customer.getMembership().getPrice();
                        }
                    
                }
                
            }
            
        }
        
        System.out.println("The total income in  month " + month +"for year " + year+" is "+totalIncome);
        
    }
    
    
    public void CoachesAccordingMostPopular()
    
        {
        for(int i =10;i>=0;i--)
            {     
                for(Coach coach: Gym.getCoaches())
                    {
                        
                        int NumberOfTimes=0;
                        
                        for (Customer customer:Gym.getCustomers())
                        {
                            if(customer.getAssignedCoach().getID()==coach.getID())
                            {
                                NumberOfTimes++;
                            }
                        }
                        if (NumberOfTimes==i)
                        {
                            System.out.println(coach.getName());
                        }
                    }
                }
                
            }
    public static boolean isSameMonth(Date date, String monthAbbreviation) throws ParseException
            {
                // Create a SimpleDateFormat with the pattern "MMM" for month abbreviation
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM");
            
            // Format the given date to get the month abbreviation
            String dateMonthAbbreviation = dateFormat.format(date);
            
            dateFormat.parse(monthAbbreviation + " 01, 2023");
            
            // Compare the month abbreviations
            return dateMonthAbbreviation.equals(monthAbbreviation);
            }

    public static boolean isSameYear(Date date, int year) throws ParseException 
        {
                // Create a SimpleDateFormat with the pattern "yyyy" for year
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
                
                // Format the given date to get the year
                String dateYear = dateFormat.format(date);
                
                dateFormat.parse(String.valueOf(year) + "-01-01");
                
                // Compare the years
                return dateYear.equals(String.valueOf(year));


            }
    public Admin loginAdmin(String UserName, String Password)
            {
                if(UserName.equals(adminUserName) && Password.equals(adminPassword)){
                    return new Admin(gym);
                }
                else{
                    System.out.println("Wrong User Name or Password.");
                return null;
            }
        }


}



