package Mygym;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Admin 
{
	
 protected   Gym gym;
    
	 
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
public void removeCustomer(Customer customer)
{
    Gym.getCustomers().remove(customer);
}

public void addCoach(Coach coach) 
{
    Gym.getCoaches().add(coach);
}
public void removeCoach(Coach coach)
{
    Gym.getCoaches().remove(coach);
}

public void addEquipment(Equipment equipment)
{
    Gym.getEquipments().add(equipment);
}

public void removeEquipment(Equipment equipment) 
{
    Gym.getEquipments().remove(equipment);
}


    
    public void editCustomer(Customer customer, String newName, String newPhoneNumber) 
    {
        customer.setName(newName);
        customer.SetPhoneNumber(newPhoneNumber);
       
    }
    public void editEquipment(Gym gym, Equipment equipment, String newEquipmentName, int newQuantity) 
    {
        equipment.setEquepmentName(newEquipmentName);
        equipment.setQuantity(newQuantity);
        
    }
    public void editCoach(Gym gym, Coach coach, String newName, String newPhoneNumber) 
    {
        coach.setName(newName);
        coach.SetPhoneNumber(newPhoneNumber);
        System.out.println("Coach details edited successfully.");
        
        
    }
        
    public void displaySubscriptionHistory(int customerId) 
    {
		System.out.println("Subscriptions:");
		
		for (Subscription subscription : Gym.getSubscriptions())
         {
			if(subscription.getCustomerId() == customerId) 
            
            {
			System.out.println("Customer : " + subscription.getCustomerId());
			System.out.println("Coach : " + subscription.getCoachId());
			System.out.println("The date of subescription : " + subscription.getDateOfSubscription());
			
		    }
		}

	}
    public void displayCustomersByCoach(int coachId)

    {
        for(Coach coach: Gym.getCoaches())
        {
                if (coach.getID()==coachId)
                System.out.println("custoomers with Coach : " + coach.getName());
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

        for (Subscription subscription : Gym.getSubscriptions())
         {

           
             try 
             {
                 if (isSameMonth(subscription.getDateOfSubscription(),month)&&isSameYear(subscription.getDateOfSubscription(),year))
                   {
                     
                     System.out.println(subscription.getCustomerId());
                     
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
                 
                 System.out.println(subscription.getCustomerId());
                     
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
}


//         public  static void displayIncome(int month, int year,Gym gym) 

// {
//     System.out.println("gym income  " + month + ", " + year + ":");
//     double totalIncome = 0;
    
//     for (int i = 0; i < customers.size(); i++)
//     {
//         Customer customer = customers.get(i);
        
//         if ( == month && customer.getAssignedYear() == year) 
//         {
//             totalIncome += customer.getMonthlyFee();
//         }
//     }
//     System.out.println( totalIncome);
// }

