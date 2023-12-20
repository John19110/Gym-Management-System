package Mygym;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main 

{//  general Main Bracket

    static public Gym gym=new Gym("Perfecet Gym", "12 Ahmed Orabi st Shobra Elkhima", "01273036464");
    static Main main=new Main();

    static Admin  admin = new Admin(gym);
    public static void main(String[] args) throws FileNotFoundException, NullPointerException, ParseException
     { //main Bracket
         
         main.read("inputdata.txt");   //read function
        System.out.println("________________________");
             
            String Choicefinal="yes";
            do
             { //do while Bracket 

  
                System.out.println("Welcome to our Gym Management System ");
                System.out.println("1. Customer Registration ");
                System.out.println("2. Customer Login ");
                System.out.println("3. Coach Registration ");
                System.out.println("4. Coach Login "); 
                System.out.println("5. Login as Admin ");
                System.out.println("6. Exit ");

                System.out.println("Enter your choice: ");
                Scanner scanner=new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) 
                {
                    case 1:
                    {


                              Customer  newCustomer=new Customer(0, null, null, null, null,
                               null, null, null, null, null, null);
                              newCustomer.Register();

                      
                        break;
                         }
                        // System.out.println("Enter your ID: ");
                        // int id = scanner.nextInt();
                        // scanner.nextLine();

                        // System.out.println("Enter your name: ");
                        // String name = scanner.nextLine();

                        // System.out.println("Enter your address: ");
                        // String address = scanner.nextLine();

                        // System.out.println("Enter your gender: ");
                        // String gender = scanner.nextLine();

                        // System.out.println("Enter your phone number: ");
                        // String phoneNumber = scanner.nextLine();

                        // System.out.println("Enter your coach id: ");
                        // int  coachid = scanner.nextInt();

                        // Coach assignedCoach=null;
                        // do 
                        // {

                        //     for(Coach coach:Gym.getCoaches())
                            
                        //     {
                        //         if ( coach.getID()==coachid)
                        //         {
                        //             assignedCoach=coach;
                                    
                        //         }
                        //     }
                        //     if (assignedCoach==null)
                        //     {
                        //         System.out.println("Enter valid ID");
                        //         coachid = scanner.nextInt();
                        //         scanner.nextLine(); // Consume the newline character


                                
                        //     }
                        // }
                        //     while (assignedCoach==null);
                        
                        // System.out.println("Enter your email: ");
                        // String email = scanner.nextLine();
                        
                        // System.out.println("Enter your password: ");
                        // String customerPassword = scanner.nextLine();

                        //     System.out.println("Enter your start Date: ");
                        //     String dateString = scanner.next();
                        //     SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                        //     Date startdate = dateF.parse(dateString);
                        
                        //      System.out.println("Enter your end Date: ");
                        //      String dateString2 = scanner.next();
                        //      SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
                        //      Date endDate = Date.parse(dateString2);

                                                
                                               
                        //     System.out.println(" ------- monthly plan --------");
                        //     System.out.println(" Enter 1 if you want 3 days per week(100$) or 2 if you want 6 days per week)(170$)");

                        //     int monthlyplanchoice=scanner.nextInt();
                        //     String monthlyplan=null;
                        //     int price =0;
                        //     do {

                        //         if (monthlyplanchoice==1)
                        //         {
                        //             monthlyplan =" 3 days per week ";
                        //             price = 100;

                        //         }
                        //     else if (monthlyplanchoice==2)
                        //     {
                        //         monthlyplan =" 6 days per week ";
                        //          price = 170;
                        //     }
                        //     else
                        //     {
                        //         System.out.println("Invalid number ");
                                
                        //     }
                        // }
                        // while (monthlyplan==null&&price==0);
                            


                        //     System.out.println(" Enter number of monthes : ");
                        //     int numberofmonthes = scanner.nextInt();


                        //     System.out.println("Enter today's  Date: ");
                        //     String dateString3 = scanner.next();
                        //     SimpleDateFormat datee = new SimpleDateFormat("yyyy-MM-dd");
                        //     Date DateOfSubscription = datee.parse(dateString3);

                        
                    //   Membership membership =new Membership(startdate, endDate, monthlyplan, numberofmonthes, price);
                            
                            // Subscription subscription=new Subscription(id, assignedCoach.getID(), membership, DateOfSubscription);
                            
                        // Customer newCustomer = newCustomer.register(coachid, name, address, gender, email, phoneNumber,
                        // //  subscription, assignedCoach, membership, customerPassword);
                            
                        //  for(Customer customer:Gym.getCustomers())
                        //  {
                             
                        //      if ( id==customer.getID())
                        //      {
                        //          System.out.println("Invalid Registeration ");
                        //         }
                        //         else
                        //         {
                        //             System.out.println("Registeration Approved !");
                        //             // admin.addCustomer(newCustomer);
                        //             admin.addMembership(membership);
                        //             admin.addSubscription(subscription);

                        //       }
                        //     }


                        


                   
               


               
                case 2: 
                {
                    String chLogCus=null;
                    Scanner chLogCus2=null;
                     Scanner cans;
                    do 
                    {
                        System.out.println("Enter your email: ");
                         cans = new Scanner(System.in);
                        String customerEmail = cans.nextLine();
                        System.out.println("Enter your password: ");
                        String customerPassword = cans.nextLine();
                
                        Customer gymCustomer = Customer.LoginCustomer(customerEmail, customerPassword);
                
                        if (gymCustomer != null) {
                            System.out.println("Customer login successful!");
                            System.out.println("#-------------------------#");
                
                            String answer1;
                            do 
                            {
                                System.out.println("1. Display Coach Information.");
                                System.out.println("2. Display Equipments.");
                                System.out.println("3. Display Membership plan.");
                                System.out.println("4. Display Inbody information in a specific date.");
                                System.out.println("5. Display How many kilos should you lose.");
                
                                 chLogCus2 = new Scanner(System.in);
                                int choice2 = chLogCus2.nextInt();
                                
                                switch (choice2) {
                                    case 1: {
                                        gymCustomer.displayCoahInfo();
                                        break;
                                    }
                                    case 2: {
                                        gymCustomer.displayEquipments();
                                        break;
                                    }
                                    case 3: {
                                        gymCustomer.displayMembershiPDetails();
                                        break;
                                    }
                                    case 4: {//check
                                        System.out.println("Enter the date : (yyyy-MM-dd) ");
                                        String dateString = cans.next();
                                        SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                                        Date date = dateF.parse(dateString);
                                       gymCustomer.displayInbodyInformation(date);
                                           break;
                                        }
                                    
                                    case 5: 
                                    {
                                        gymCustomer.DisplayHowManyKilosNeededToReduce();
                                        break;
                                    }
                                    default:
                                    System.out.println("Invalid choice");
                                }
                                
                                System.out.println("Do you want another service as a customer?");
                                answer1 = cans.nextLine();
                            } 
                            while (answer1.equalsIgnoreCase("yes"));
                            
                        } 
                        else
                         {
                            System.out.println("User not found!");
                        }

                        System.out.println("Do you want to log in from different account ?");
                        chLogCus = cans.nextLine();
                    } 
                    while (chLogCus.equalsIgnoreCase("yes"));
                    
                    chLogCus2.close();
                    cans.close();
                break;
                }
                case 3:
                {
                    // do 
                    // {

                    //     System.out.println("Enter your ID: ");
                    //     Scanner cans2 = new Scanner(System.in);
                        
                    //     int id1 = cans2.nextInt();
                    //     cans2.nextLine();

                    //     System.out.println("Enter your name: ");
                    //     String name1 = cans2.nextLine();

                    //     System.out.println("Enter your address: ");
                    //     String address1 = cans2.nextLine();

                    //     System.out.println("Enter your gender: ");
                    //     String gender1 = cans2.nextLine();
                        
                    //     System.out.println("Enter your phone number: ");
                    //     String phoneNumber1 = cans2.nextLine();
                        
                    //     System.out.println("Enter your workinghours");
                    //     int workingHours1 = cans2.nextInt();
                    //     cans2.nextLine();
                        
                    //     System.out.println("Enter your email: ");
                    //     String email1 = cans2.nextLine();
                        
                    //     System.out.println("Enter your password: ");
                    //     String CoachPassword1 = cans2.nextLine();
                        
                        
                    //     Coach newCoach = Coach.registerCoach(id1, name1, address1, gender1
                    //     , email1, phoneNumber1, workingHours1, CoachPassword1);
                    //     if (newCoach != null)
                    //     {
                    //         System.out.println("Registration successful!");
                    //     }
                    //     else {
                    //         System.out.println("Registration failed. User with the same email already exists.");
                            
                    //     }
                    // }
                    // // while( );
                    
            break;
                }//case bracket
                











                // case 3:
                    // {
                    //     System.out.println("Enter your ID: ");
                    //     try (Scanner cans2 = new Scanner(System.in)) {
                    //         int id = cans2.nextInt();
                    //         scanner.nextLine();

                    //         System.out.println("Enter your name: ");
                    //         String name = cans2.nextLine();

                    //         System.out.println("Enter your address: ");
                    //         String address = cans2.nextLine();

                    //         System.out.println("Enter your gender: ");
                    //         String gender = cans2.nextLine();

                    //         System.out.println("Enter your phone number: ");
                    //         String phoneNumber = cans2.nextLine();


                    //         System.out.println("Enter your email: ");
                    //         String email = cans2.nextLine();

                    //         System.out.println("Enter your password: ");
                    //         String CoachPassword = cans2.nextLine();


                    //         Coach newCoach = Coach.registerCoach(id, name, address, gender
                    //         , email, phoneNumber, choice, CoachPassword);
                    //         if (newCoach != null)
                    //          {
                    //             System.out.println("Registration successful!");
                    //         }
                    //         else {
                    //             System.out.println("Registration failed. User with the same email already exists.");
                                
                    //         }
                    //     }
                    //     break;
                    // }









                   case 4:
                   {

                   
                            String CoLOCh;
                            do {
                                System.out.println("Enter your email: ");
                                String coachEmail = scanner.nextLine();
                                System.out.println("Enter your password: ");
                                String coachPassword = scanner.nextLine();
                    
                                Coach gymCoach = Coach.LoginCoach(coachEmail, coachPassword);
                                if (gymCoach != null) 
                                {
                                    System.out.println("Coach login successful!");
                                    System.out.println("-----------------------");
                    
                                    do {
                                        System.out.println("1. Show your customers.");
                                        System.out.println("2. Get the inbody history of any of your customers.");
                                        System.out.println("3. Get all the details of a customer by his name..");
                                        System.out.println("4. Show a list of all his female/male customers.");
                                        System.out.println("Enter your choice: ");
                                        int choice3 = scanner.nextInt();
                                        switch (choice3) {
                                            case 1:
                                                gymCoach.ListAllCustomers(gymCoach.getID());
                                                break;
                    
                                            case 2:
                                                System.out.println("Enter customer ID : ");
                                                int id = scanner.nextInt();
                                                gymCoach.getInBodyHistory(id);
                                                break;
                    
                                            case 3:
                                                System.out.println("Enter customer name : ");
                                                scanner.nextLine();
                                                String name = scanner.nextLine();
                                                gymCoach.getCustomerByName(name);
                                                break;
                    
                                            case 4:
                                                System.out.println("Enter target gender : ");
                                                scanner.nextLine();
                                                String gender = scanner.nextLine();
                                                gymCoach.getCustomersByGender(gender);
                                                break;
                    
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                        System.out.println("Do you want to continue? (y/n): ");
                                        CoLOCh = scanner.nextLine();
                    
                                    }//inner while bracket
                                    while(CoLOCh.equalsIgnoreCase("yes"));
                    
                                }//if bracket
                                else
                                {
                                    System.out.println("User not found!");
                                }
                                System.out.println("Do you want to log in as a different coach ?");
                                CoLOCh = scanner.nextLine();
                            }//outer do brcket 
                            while (CoLOCh.equalsIgnoreCase("yes"));
                    break;
                         }//case 4 bracket







                                //             case 4:
                                //             {

                                //     boolean loginSuccessful = false;
                                //     do 
                                //     {
                                //         System.out.println("Enter your email: ");
                                //         String coachEmail = scanner.nextLine();
                                //         scanner.nextLine();
                                //         System.out.println("Enter your password: ");
                                //         String coachPassword = scanner.nextLine();
                
                                //         Coach gymCoach = Coach.LoginCoach(coachEmail, coachPassword);
                                //         if (gymCoach != null)
                                //          {
                                //             System.out.println("Coach login successful!");
                                //             loginSuccessful = true;
                                //             System.out.println("1. Show your customers.");
                                //             System.out.println("2. Get the inbody history of any of your customers.");
                                //             System.out.println("3. Get all the details of a customer by his name..");
                                //             System.out.println("4. Show a list of all his female/male customers.");
                                //             System.out.println("Enter your choice: ");
                
                                //             int choice3 = scanner.nextInt();
                                //             switch (choice3) {
                                //                 case 1:
                                //                     gymCoach.ListAllCustomers(gymCoach.getID());
                                //                     break;
                
                                //                 case 2:
                                //                 System.out.println("Enter customer ID : ");
                                //                 int id = scanner.nextInt();
                                //                 gymCoach.getInBodyHistory(id);
                                //                 break;
                                                
                                //                 case 3:
                                //                 System.out.println("Enter customer name : ");
                                //                 scanner.nextLine();
                                //                 String name = scanner.nextLine();
                                //                 gymCoach.getCustomerByName(name);
                                //                 break;
                                                
                                //                 case 4:
                                //                     System.out.println("Enter target gender : ");
                                //                     scanner.nextLine();
                                //                     String gender = scanner.nextLine();
                                //                     gymCoach.getCustomersByGender(gender);
                                //                     break;
                
                                //                 default:
                                //                     System.out.println("Invalid choice");
                                //             }
                                            
                                //         } //if bracket
                                //         else 
                                //         {
                                //             System.out.println("Coach login failed! Please try again.");
                                //         }
                                //     }//do while bracket
                                //      while (!loginSuccessful);
                                //      break;
                                    
                                
                                // }//case bracket
                                   

                                //case bracket
                               
                        
                        
                    
                
                
                

                    

                    // case 4:
                    //     System.out.println("Enter your email: ");
                    //     String customerEmail = scanner.nextLine();

                    //     System.out.println("Enter your password: ");
                    //     String customerPassword = scanner.nextLine();

                    //     Coach gymCoach = Coach. LoginCoach(customerEmail, customerPassword);

                    //     if (gymCoach != null)
                    //      {

                    //         System.out.println("Coach login successful!");
                    //         System.out.println("#-------------------------#");

                    //             System.out.println("1. Show your customers.");
                    //             System.out.println("2. Get the inbody history of any of your customers.");
                    //             System.out.println("3. Get all the details of a customer by his name..");
                    //             System.out.println("4. Show a list of all his female/male customers.");

                    //             int choice3= scanner.nextInt();
                    //             switch(choice3)
                    //             {
                    //              case 1:
                    //              {
                    //                     gymCoach.ListAllCustomers(gymCoach.getID());
                    //                     break;


                    //              }
                    //             case 2:
                    //             {  
                    //                 System.out.println("Enter customer ID : ");
                    //                 try (Scanner sca = new Scanner(System.in)) {
                    //                     int id=sca.nextInt();
                    //                     gymCoach.getInBodyHistory(id);
                    //                 }
                    //                 break;
                                    
                             
                    //             }
                    //             case 3:
                    //             {

                    //                 System.out.println("Enter customer name : ");
                    //                 try (Scanner sca = new Scanner(System.in)) {
                    //                     String name=sca.nextLine();
                    //                     gymCoach.getCustomerByName(name);
                    //                 }
                       
                                       
                    //             }
                                    
                    //             case 4:
                    //             {
                    //                 System.out.println("Enter target gender : ");
                    //                 try (Scanner sca = new Scanner(System.in)){
                    //                 Scanner cans = new Scanner(System.in); {
                    //                     String gender=cans.nextLine();
                    //                     gymCoach.getCustomersByGender(gender);
                    //                     cans.close();
                    //                 }
                                    
                    //             }
                    //             }
                    //             default:
                    //             System.out.println("Invalid choice");


                                    
                    //             }


                            


                    //     }

                    //     break;

                    case 5:
                    {   
                            System.out.println("Enter your email: ");
                        String AdminEmail = scanner.nextLine();

                        System.out.println("Enter your password: ");
                        String AdminPassword = scanner.nextLine();
                        if(AdminEmail.equals("admin")&&AdminPassword.equals("admin"))
                        {       

                         

                            System.out.println("Successful Login !");
                            System.out.println("__________________________");

                                System.out.println("1. Add Customer. ");
                                System.out.println("2. Edit Customer. ");
                                System.out.println("3. Remove Customer.");
                                System.out.println("4. Add Coach. ");
                                System.out.println("5. Edit Coach. ");
                                System.out.println("6. Remove Coach.");
                                System.out.println("7. Add Equipment. ");
                                System.out.println("8. Edit Equipment. ");
                                System.out.println("9. Remove Equipment.");
                                System.out.println("10.Show the  subscription history for a customer.");
                                System.out.println("11.Display all the customers that subscribed to the gym in a given month.");
                                System.out.println("12.Display all the customers that subscribed to the gym in a given day.");
                                System.out.println("13.Display all the customers of a specific coach.");
                                System.out.println("14. Display the GYM income in a given month..");
                                System.out.println("15.Display the coaches sorted in terms of the most assigned number of customers to the coaches.");
                                

                                     int choice4= scanner.nextInt();
                                 switch(choice4)
                                 {
                    //               case 1:  
                    //               {
                    //                   System.out.println("Enter costomer ID: ");
                    //                   int id = scanner.nextInt();
                    //                   scanner.nextLine();

                    //     System.out.println("Enter costomer name: ");
                    //     String name = scanner.nextLine();

                    //     System.out.println("Enter costomre  address: ");
                    //     String address = scanner.nextLine();

                    //     System.out.println("Enter costomer gender: ");
                    //     String gender = scanner.nextLine();

                    //     System.out.println("Enter costomer phone number: ");
                    //     String phoneNumber = scanner.nextLine();

                    
                    //     System.out.println("Enter costomer email: ");
                    //     String email = scanner.nextLine();
                        
                    //     System.out.println("Enter costomer password: ");
                    //     String CustomerPass = scanner.nextLine();
                        
                        
                    
                    //     Customer newCustomer =null;
                    // //    newCustomer = newCustomer.register(id, name, address, gender, email, phoneNumber,
                    //     // Gym.getSubscriptions().get(1), Gym.getCoaches().get(1), Gym.getMemberships().get(1), CustomerPass);
                       
                    //         Gym.getCustomers().add(newCustomer);
                    //         System.out.println("Registration successful!");
                    //         System.out.println("Registration failed. User with the same email already exists.");
                      
                    //     }
                             
                        case 2:
                        {
                           System.out.println("Enter the customre name :");
                             String name = scanner.nextLine();
                        for(Customer customer:Gym.getCustomers())

                        {
                            if (customer.getName().equals(name))
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

                                    
                 case 1:
                    System.out.println("Enter new ID:");
                    int newID = scanner.nextInt();
                    customer.setID(newID);
                    break;
                case 2:
                    System.out.println("Enter new Name:");
                    String newName = scanner.next();
                    customer.setName(newName);
                    break;
                case 3:
                    System.out.println("Enter new Address:");
                    String newAddress = scanner.next();
                    customer.setAddress(newAddress);
                    break;
                case 4:
                    System.out.println("Enter new Gender:");
                    String newGender = scanner.next();
                    customer.setGender(newGender);
                    break;
                case 5:
                    System.out.println("Enter new Email:");
                    String newEmail = scanner.next();
                    customer.setEmail(newEmail);
                    break;
                case 6:
                    System.out.println("Enter new Phone Number:");
                    String newPhoneNumber = scanner.next();
                    customer.SetPhoneNumber(newPhoneNumber);
                    break;
      
   
                case 7:
                    System.out.println("Enter new Password:");
                    String newPassword = scanner.next();
                    customer.setPassword(newPassword);
                    break;
                default:
                    System.out.println("Invalid choice");

                 System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                      String answer2 = scanner.nextLine();
                                    if(answer2.equals("yes") || answer2.equals("Yes"))
                                    {
                                        continue;
                                    }
                                    else{
                                        break;
                                    }

                }

      }


                            }

                        


                        }
                        case 3:
                        {


                                System.out.println("Enter customer name :");
                                try (Scanner s = new Scanner(System.in)) {
                                    String  name =s.nextLine();
                                    for(Customer customer :Gym.getCustomers())
                                    {
                                        if(name.equals(customer.getName()))
                                        {

                                            admin.removeCustomer(customer);
                                        }
                                        else
                                        {
                                            System.out.println("invalid name ");

                                        }
                                        System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                          String answer2 = scanner.nextLine();
                                        if(answer2.equals("yes") || answer2.equals("Yes"))
                                        {
                                            continue;
                                        }
                                        else{
                                            break;
                                        }

                                    }
                                }





                        }
                         case 4 :
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
                        
                        
                    
                        Coach newCoach = Coach.registerCoach(id, name, address, gender, email, phoneNumber, id, Coachpassword);
                       
                            Gym.getCoaches().add(newCoach);
                            System.out.println("Registration successful!");

                                    


                         } 
                         //case 5 will be here
                         case 5:
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

                                    
                 case 1:
                    System.out.println("Enter new ID:");
                    int newID = scanner.nextInt();
                    coach.setID(newID);
                    break;
                case 2:
                    System.out.println("Enter new Name:");
                    String newName = scanner.next();
                    coach.setName(newName);
                    break;
                case 3:
                    System.out.println("Enter new Address:");
                    String newAddress = scanner.next();
                    coach.setAddress(newAddress);
                    break;
                case 4:
                    System.out.println("Enter new Gender:");
                    String newGender = scanner.next();
                    coach.setGender(newGender);
                    break;
                case 5:
                    System.out.println("Enter new Email:");
                    String newEmail = scanner.next();
                    coach.setEmail(newEmail);
                    break;
                case 6:
                    System.out.println("Enter new Phone Number:");
                    String newPhoneNumber = scanner.next();
                    coach.SetPhoneNumber(newPhoneNumber);
                    break;
      
   
                case 8:
                    System.out.println("Enter new Password:");
                    String newPassword = scanner.next();
                    coach.setPassword(newPassword);
                    break;
                default:
                    System.out.println("Invalid choice");

                 System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                      String answer2 = scanner.nextLine();
                                    if(answer2.equals("yes") || answer2.equals("Yes"))
                                    {
                                        continue;
                                    }
                                    else{
                                        break;
                                    }

                         }
                              

                       }



                    }
                        break;
                }

                    case 6:

                    {
                            System.out.println("Enter coach name :");
                                try (Scanner s = new Scanner(System.in)) {
                                    String  coachname =s.nextLine();
                                    for(Coach coach1 :Gym.getCoaches())
                                    {
                                        if(coachname.equals(coach1.getName()))
                                        {

                                            admin.removeCoach(coach1);
                                        }
                                        else
                                        {
                                            System.out.println("invalid name ");

                                        }
                                        System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                          String answer2 = scanner.nextLine();
                                        if(answer2.equals("yes") || answer2.equals("Yes"))
                                        {
                                            continue;
                                        }
                                        else{
                                            break;
                                        }

                     }
                                }

                    }
                        

                    case 7:
                    {
                 System.out.println("Enter Equipment name: ");
                        String name = scanner.nextLine();

                        System.out.println("Enter Equipment  code: ");
                        int code = scanner.nextInt();

                        System.out.println("Enter Equipment g: ");
                        int quantity = scanner.nextInt();
                        Equipment equipment =new Equipment(name, code, quantity);
                        Gym.getEquipments().add(equipment);
                    
                    
                    }
                    case 8:
                    {
                        System.out.println("Enter the code of the equipment you wnat to edit ");
                        try (Scanner s = new Scanner(System.in)) {
                            int equipmentcode =s.nextInt();
                            for(Equipment equipment:Gym.getEquipments())
                            {
                                if (equipmentcode==equipment.getCode())

                                {

                                System.out.println("Select attribute to edit:");
                                System.out.println("1. Name");
                                System.out.println("2. Code");
                                System.out.println("3. Quantity");
                                int choice5 = scanner.nextInt();
                                switch (choice5)
                                {

                                    case 1:
                                    {

                                        System.out.println("Enter new Name:");
                                        String newName = scanner.next();
                                        equipment.setEquepmentName(newName);
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.println("Enter new Code:");
                                        int newCode = scanner.nextInt();
                                        equipment.setCode(newCode);
                                        break;
                                    }
                                    case 3:
                                {
                                    System.out.println("Enter new Quantity:");
                                    int newQuantity = scanner.nextInt();
                                    equipment.setQuantity(newQuantity);
                                    break;
                                }

                                    default:
                                    System.out.println("Invalid choice");
                                }
                                
                                // Close the scanner
                                scanner.close();

                            }
                                }
                        }
                        
                        }
                        case 9:
                        {
                         System.out.println("Enter equipment code : ");
                                try (Scanner s = new Scanner(System.in)) 
                                {
                                    int  code =s.nextInt();
                                    for(Equipment equipment :Gym.getEquipments())
                                    {
                                        if(code==equipment.getCode())
                                        {

                                            admin.removeEquipment(equipment);
                                        }
                                        else
                                        {
                                            System.out.println("invalid code ");

                                        }
                                        System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                          String answer2 = scanner.nextLine();
                                        if(answer2.equals("yes") || answer2.equals("Yes"))
                                        {
                                            continue;
                                        }
                                        else{
                                            break;
                                        }

                                    }
                                }    

                        }
                        case 10:
                        {
                           System.out.println("Enter customer ID ");
                           int id = scanner.nextInt();
                           admin.displaySubscriptionHistory(id);
                           
                        } 
                        case 11:
                        {
                            //case 11
                            System.out.println("Enter the month and the year ex.:(dec,2004)");
                            
                            String month = scanner.nextLine();
                            int year = scanner.nextInt();
                            admin.CustomerByGivenDate(month,year);
                             
                        }   

                        case 12:
                        {

                                 System.out.println("Enter the date and the year ex.:(1,dec,2004)");
                                System.out.println("Enter the date : (yyyy-MM-dd) ");
                                
                                                try (Scanner scan = new Scanner(System.in)) {
                                                    System.out.print("Enter a date (yyyy-MM-dd): ");
                                                    String dateString = scan.next();
                              
                                                    SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                              
                                                    try {
                                                        Date date = dateF.parse(dateString);
                              
                                                        System.out.println("Parsed Date: " + date);
                              
                                                        admin.CustomerByGivenDate(date);
                              
                                                    } catch (ParseException e) {
                                                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                                                        e.printStackTrace();
                                                    } finally {
                                                        scanner.close();
                              }
                                                }
                                        
                                      
                        }
                        case 13:
                        {
                            System.out.println("Enter the coach ID ");
                              int Id = scanner.nextInt();
                             admin.displayCustomersByCoach(Id);
                            



                        }
                        case 14:
                        {
                    System.out.println("Enter the month and the year ex.:(dec,2004)");
                            
                            String month = scanner.nextLine();
                            int year = scanner.nextInt();
                            admin.monthlyIncome(month, year);
                            

                        }
                                              
                        case 15:
                        {
                                admin.CoachesAccordingMostPopular();     
                            
                            }
                            default:
                    System.out.println("Invalid choice");


                    
                    }
                   
                    System.out.println("Invalid choice. Please enter a valid option.");

                
                
      }
    }
    case 6:
    System.out.println("Good Bye! ");
    break;
    default:
    System.out.println("Invalid choice");
    break;


}//switch brackets 



System.out.println("Do you want to continue? (Type  yes to continue. Else will exit the program)");
Scanner scanner2=new Scanner(System.in);
Choicefinal  = scanner2.nextLine(); 
scanner2.close();
}//while bracket       
while(Choicefinal.equals("yes"));

main.write(Gym.tString(),"outputdata.txt");//write function
                            }////  small main bracket

     


public  void read(String filepath) throws FileNotFoundException
     {

        File file = new File(filepath);
        Scanner inputfile;

        if (file.exists()) {
            inputfile = new Scanner(file);

            while (inputfile.hasNextLine())
             {
                try {

                    //Customers peson data input

                    int CustomerId = Integer.parseInt(inputfile.nextLine());//1
                    String Customername = inputfile.nextLine();//2
                    String Customeraddress = inputfile.nextLine();//3
                    String Customergender = inputfile.nextLine();//4
                    String Customeremail = inputfile.nextLine();//5
                    String Customerphonenumber = inputfile.nextLine();//6
                    String Customerpassword = inputfile.nextLine();//7
                    String assingendCoachName=inputfile.nextLine();//8

                   
                     //Customers membership data input
                   
                    String stringstartdate = inputfile.nextLine();//9
                    String stringenddate = inputfile.nextLine();//10
                    String monthlyPlan = inputfile.nextLine();//11
                    int numMonthsRegistered = Integer.parseInt(inputfile.nextLine());//12
                    int pric = Integer.parseInt(inputfile.nextLine());//13

                        //Customers Subescribtion data input

                    String stringdateofsubescription = inputfile.nextLine();//14
                    //Customers Inbody data input
                    String stringdateofinbody = inputfile.nextLine();//15
                    int height = Integer.parseInt(inputfile.nextLine());//16
                    int totalWeight = Integer.parseInt(inputfile.nextLine());//17
                    int body_Fat_Mass = Integer.parseInt(inputfile.nextLine());//18
                    int minerals = Integer.parseInt(inputfile.nextLine());//19
                    int total_Body_Water = Integer.parseInt(inputfile.nextLine());//20
                    int protein = Integer.parseInt(inputfile.nextLine());//21


                    int CoachId = Integer.parseInt(inputfile.nextLine());//22
                    String Coachname = inputfile.nextLine();//23
                    String Coachaddress = inputfile.nextLine();//24
                    String Coachgender = inputfile.nextLine();//25
                    String Coachemail = inputfile.nextLine();//26
                    String Coachphonenumber = inputfile.nextLine();//27
                    String Coachpassword = inputfile.nextLine();//28
                    int workinghours = 0; // Default value, since it's not provided in the sample data
                    // Parse non-numeric values using try-catch
                    try {
                        workinghours = Integer.parseInt(inputfile.nextLine());//29
                    } catch (NumberFormatException e) {
                        // Handle the exception, e.g., log the error
                        e.printStackTrace();
                    }

                    String equipmentname = inputfile.nextLine();//30
                    int Equipmentquantity = 0; // Default value
                    int equipmentcode = 0; // Default value

                    // Parse non-numeric values using try-catch
                    try {
                        Equipmentquantity = Integer.parseInt(inputfile.nextLine());//31
                        equipmentcode = Integer.parseInt(inputfile.nextLine());//32
                    } catch (NumberFormatException e) {
                        // Handle the exception, e.g., log the error
                        e.printStackTrace();
                    }


                        


                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date startdate = dateFormat.parse(stringstartdate);
                    Date enddate = dateFormat.parse(stringenddate);
                    Date dateofsubescribtion = dateFormat.parse(stringdateofsubescription);
                    Date dateofinbody = dateFormat.parse(stringdateofinbody);

                    Membership membership = new Membership(startdate, enddate, monthlyPlan, numMonthsRegistered, pric);

                    InBody inbody = new InBody(CustomerId, Customername, Customeraddress, Customergender, Customeremail, Customerphonenumber,
                            dateofinbody, height, totalWeight, body_Fat_Mass, minerals, total_Body_Water, protein);
                     ArrayList<InBody> inBodyList = new ArrayList<>();
                     inBodyList.add(inbody);                        
                        Subscription subscription = new Subscription(CustomerId, 0, membership, dateofsubescribtion);
                        Equipment equipment = new Equipment(equipmentname, equipmentcode, Equipmentquantity);
                        
                        // CustomerList.add();
                        ArrayList<Customer> CustomerList = new ArrayList<>();
                        Coach coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                        Coachemail, Coachphonenumber, workinghours,Coachpassword,CustomerList);//check
                        
                        Customer customer = new Customer(CustomerId, Customername, Customeraddress
                        , Customergender, Customeremail, Customerphonenumber, subscription, inBodyList, null, membership, Customerpassword);
                        customer.setAssignedCoach(coach);
                        
                        admin.addCustomer(customer);
                        admin.addCoach(coach);
                        admin.addEquipment(equipment);
                        admin.addSubscription(subscription);
                        
                        Coach assignedCoach=null;
                        for(Coach coachforassgin:Gym.getCoaches())
                        {
                            if(assingendCoachName.equals(coachforassgin.getName()))
                            {
                                assignedCoach=coachforassgin;
                            }
                            
                        }
                        customer = new Customer(CustomerId, Customername, Customeraddress
                        , Customergender, Customeremail, Customerphonenumber, subscription, inBodyList, assignedCoach, membership, Customerpassword);


                        for(Customer customerforcoachCustomerslist:Gym.getCustomers())
                        {
                            if(assingendCoachName.equals(customerforcoachCustomerslist.getAssignedCoach().getName()))
                            CustomerList.add(customer);
                            coach.setCoacheCustomers(CustomerList);
                        }

                         coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                        Coachemail, Coachphonenumber, workinghours,Coachpassword,CustomerList);




                    if (Gym.getMemberships() == null) 
                    {
                        // If it's null, create a new list
                       ArrayList <Membership>existingMemberships = new ArrayList<>();
                        // Set the new list to the Gym object

                        Gym.setMemberships(existingMemberships);
                    }
                    

                } catch (NumberFormatException | ParseException e) {
                    // Handle the exception (e.g., log the error, provide a user-friendly message)
                    e.printStackTrace();
                }
            }

        
            inputfile.close(); // Close the scanner after reading the file
        }
    }

   
    
private  <T> void write(String string, String filePath)
     {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) 
        {
            oos.writeObject(string);

        } catch (IOException e) 
        {
            e.printStackTrace();

        }
       
    }
    
}
