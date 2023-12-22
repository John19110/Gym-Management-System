package Mygym;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;





public class Main 

{//  general Main Bracket

    static public Gym gym=new Gym("Perfecet Gym", "12 Ahmed Orabi st Shobra Elkhima", "01145446874");
    static Main main=new Main();
    static String continueAnswer1 = "Yes";
    static String continueAnswer2 = "yes";


  public static Admin gymAdmin = new Admin(gym);
    public static void main(String[] args) throws NullPointerException, ParseException, IOException
     { //main Bracket
        try {
         main.read("inputdata.txt");   //read function

 
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
          Scanner scanner=new Scanner(System.in);


    
    String Choicefinal;
    do
    { //do while Bracket 
        
        System.out.println("*****************************************");
        System.out.println("Welcome to our Gym Management System ");
        System.out.println("*****************************************");
        System.out.println("1. Customer Registration ");
        System.out.println("2. Customer Login ");
        System.out.println("3. Coach Registration ");
        System.out.println("4. Coach Login "); 
        System.out.println("5. Login as Admin ");
        System.out.println("6. Exit ");
        System.out.println("________________________");

                System.out.println("Enter your choice: ");
                Scanner CHOICE = new Scanner(System.in);
                int choice = CHOICE.nextInt();
                switch (choice) 
                {
                case 1:
                    {

                              
                                Customer newCustomer=new Customer(0, null, null, null, null,
                                null, null, null, null, null, null);
                                newCustomer.Register();
                               
                      
                        break;
                         }
                        

                case 2: 
                {
                    Scanner chLogCus2= new Scanner(System.in);
                    String chLogCus= new String();
                    String chLogCus3=null;
                  

                    do 
                    {
                        System.out.println("Enter your email: ");
                        scanner = new Scanner(System.in);
                        String customerEmail = scanner.nextLine();
                        System.out.println("Enter your password: ");
                        String customerPassword = scanner.nextLine();
                
                             Customer gymCustomer=new Customer(0, null, null, null
                             , null, null, null, null, null, null, null);
                         gymCustomer = gymCustomer.Login(customerEmail, customerPassword);
                
                        if (gymCustomer != null) 
                        {
                            System.out.println("Customer login successful!");
                            System.out.println("#-------------------------#");
                
                            do 
                            {
                                System.out.println("1. Display your  Coach Information.");
                                System.out.println("2. Display Gym Equipments.");
                                System.out.println("3. Display Your Currnet  Membership plan.");
                                System.out.println("4. Display Inbody information in a specific date.");
                                System.out.println("5. Display How many kilos should you lose.");
                
                                int choice2 = scanner.nextInt();
                                
                                 switch (choice2)
                                  {
                                    case 1: {
                                        gymCustomer.displayCoahInfo();
                                        break;
                                    }
                                    case 2: 
                                    {
                                        gymCustomer.displayEquipments();
                                        break;
                                    }
                                    case 3: 
                                    {
                                        gymCustomer.displayMembershiPDetails();
                                        break;
                                    }
                                    case 4: 
                                    {//check
                                        
                                        gymCustomer.displayInbodyInformation();
                                           break;
                                        }
                                    
                                    case 5: 
                                    {
                                        gymCustomer.DisplayHowManyKilosNeededToReduce();
                                        break;
                                    }
                                    default:
                                    System.out.println("Invalid choice");
                                    break;
                                }
                                
                                System.out.println("Do you want another service as a customer?");

                                     scanner.nextLine();
                                    chLogCus=scanner.nextLine();

                            } 
                            while ("yes".equalsIgnoreCase(chLogCus));

                        }//if bracket 
                        else
                         {
                            System.out.println("User not found!");
                        }

                        System.out.println("Do you want to log in from different account ?");
          
                         chLogCus3 = chLogCus2.nextLine();
                     
           
                                                     } //do while bracket
                    while (chLogCus3.equalsIgnoreCase("yes"));
                    

                                    
                break;
                }
      
                case 3:
                    {
                    Coach newCoach=new Coach(0, null, null, null, 
                    null, null, 0, null, null);
                    newCoach.Register();
                    break;
                    }
                case 4:
                   {

                            String CoLOCh;
                            do {
                                System.out.println("Enter your email: ");
                                String coachEmail=scanner.nextLine();
                                System.out.println("Enter your password: ");
                                String coachPassword = scanner.nextLine();
                    
                                Coach gymCoach =new Coach(0, null, null, null, null, 
                                null, 0, null);
                                 gymCoach = gymCoach.Login(coachEmail, coachPassword);
                                if (gymCoach != null) 
                                {
                                    System.out.println("Coach login successful!");
                                    System.out.println("-----------------------");
                    
                                    do {
                                        System.out.println("1. Show your customers.");
                                        System.out.println("2. Get the inbody history of any of your customers.");
                                        System.out.println("3. Get all the details of a customer by his name..");
                                        System.out.println("4. Show a list of all of your female/male customers.");
                                        System.out.println("Enter your choice: ");
                                        int choice3 = Integer.parseInt(scanner.nextLine());;
                                        switch (choice3) 
                                        {
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
                                                String name = scanner.nextLine();
                                                gymCoach.getCustomerByName(name);
                                                break;
                    
                                            case 4:
                                                System.out.println("Enter target gender : ");
                                                String gender = scanner.nextLine();
                                                gymCoach.getCustomersByGender(gender);
                                                break;
                    
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                        System.out.println("Do you want to continue? (Type Yes or yes to continue in the Coach): ");
                                        CoLOCh = scanner.nextLine();
                    
                                    }//inner while bracket
                                    while("yes".equalsIgnoreCase(CoLOCh));
                    
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

                case 5:
                         { 
                             Scanner scan = new Scanner(System.in);
                                 System.out.println("Enter your email: ");
                             String AdminEmail = scan.nextLine();
     
                             System.out.println("Enter your password: ");
                             String AdminPassword = scan.nextLine();
                             if(gymAdmin.loginAdmin(AdminEmail, AdminPassword) != null)
                             {       
                                Scanner ANSWER = new Scanner(System.in);
                                String Answer34;
                              
     
                                 System.out.println("Successful Login !");
                                 System.out.println("__________________________");
                            do{
                                 System.out.println("1. Add Customer. ");
                                 System.out.println("2. Edit Customer. ");
                                 System.out.println("3. Remove Customer.");
                                 System.out.println("4. Add Coach. ");
                                 System.out.println("5. Edit Coach. ");
                                 System.out.println("6. Remove Coach.");
                                 System.out.println("7. Add Equipment. ");
                                 System.out.println("8. Edit Equipment. ");
                                 System.out.println("9. Remove Equipment.");
                                 System.out.println("10. Show the  subscription history for a customer. ");
                                 System.out.println("11. Display all the customers that subscribed to the gym in a given month. ");
                                 System.out.println("12. Display all the customers that subscribed to the gym in a given day. ");
                                 System.out.println("13. Display all the customers of a specific coach. ");
                                 System.out.println("14. Display the GYM income in a given month. ");
                                 System.out.println("15. Display the coaches sorted in terms of the most assigned number of customers to the coaches. ");
                                 System.out.println("Enter your choice: ");
                                 int choice4= scanner.nextInt();
                                 switch(choice4)
                                      {
                             case 1:  
                                       {
                             
                                         Customer newCustomer = new Customer(0, null, null, null, null, null, null, null, null, null, null);
                                        newCustomer.Register();

                                        break;
                           
                                }
                                  
                             case 2:
                             {
                                 if(gymAdmin.editCustomer())
                                 {
                                     System.out.println("Customer has been edited. ");
                                     break;
                                 }
                                 else
                                 {
                                     System.out.println("Customer not found. ");
                                     break;
                                 }
                             }
     
                             case 3:
                             {
                               System.out.println("Enter Customer Id : ");
                                     
                                         int  Id =scanner.nextInt();
                                         for(Customer customer :Gym.getCustomers())
                                         {
                                             if(Id==customer.getID())
                                             {
     
                                                 gymAdmin.removeCustomer(customer);
                                                 System.out.println("Customer removed !");

                                                 break;
                                             }
                                             else
                                             {
                                                 System.out.println("invalid ID ");
                                                 break;
                                                }
                                            }    
     
                                         
                                        break;
                             }
                             case 4 :
                              {
                                 gymAdmin.addCoach(); 
                                 break;
                              } 
                             
                             case 5:
                              {
                                 gymAdmin.editCoach();
                                 break;
                             }
     
                             case 6:
                             {
                                
                                 System.out.println("Enter Coach Id : ");
                                     
                                         int  Id =scanner.nextInt();
                                         for(Coach coach :Gym.getCoaches())
                                         {
                                             if(Id==coach.getID())
                                             {
     
                                                 gymAdmin.removeCoach(coach);
                                                 System.out.println("Coach removed !");

                                                 break;
                                             }
                                             else
                                             {
                                                 System.out.println("invalid ID ");
                                                 break;
                                                }
                                            }    
     
                                         
                                        break;
                             }
                             
     
                             case 7:
                             {
                                 System.out.println("Enter Equipment name: ");
                                 
                                 scanner.nextLine();
                                 String name = scanner.nextLine();
     
                                 System.out.println("Enter Equipment  code: ");
                                 
                                 int code = scanner.nextInt();
     
                                 System.out.println("Enter Equipment  Quantitiy: ");
                                 int quantity = scanner.nextInt();
                                 Equipment equipment =new Equipment(name, code, quantity);
                                 Gym.getEquipments().add(equipment);
                                 break;
                             }
     
     
                             case 8:
                             {
                               
                                gymAdmin.editEquipment();
                                break;
                            }//case bracket
                             
     
                             case 9:
                             {
                              System.out.println("Enter equipment code : ");
                                     
                                         int  code =scanner.nextInt();
                                         for(Equipment equipment :Gym.getEquipments())
                                         {
                                             if(code==equipment.getCode())
                                             {
     
                                                 gymAdmin.removeEquipment(equipment);
                                                 System.out.println("equipmnet removed !");

                                                 break;
                                             }
                                             else
                                             {
                                                 System.out.println("invalid code ");
                                                 break;
                                                }
                                            }    
     
                                         
                                        break;
                             }
     
                             case 10:
                             {
                                System.out.println("Enter customer ID ");
                                int id = scanner.nextInt();
                                
                                gymAdmin.displaySubscriptionHistory(id);
                                break;
                             }

                             case 11:
                             {
                                 Scanner scan21 = new Scanner(System.in);
                                 //case 11
                                 System.out.println("Enter the month and the year ex.:(dec,2004)");
                                 
                                 String month = scan21.nextLine();
                                 int year = scan21.nextInt();
                                 
                                 gymAdmin.CustomerByGivenDate(month,year);
                                 break;
                             }   
                             case 12://check
                             {
     
                                     System.out.println("Enter the date : (yyyy-MM-dd) ");
                                      
                                             String dateString = scanner.next();
                                   
                                             SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                                   
                                             
                                                 Date date = dateF.parse(dateString);
                                   
                                                
                                                gymAdmin.CustomerByGivenDate(date);
         
                                             }    
                                             break;  
                                            
     
                             
                             case 13:
                             {
                                 System.out.println("Enter the coach ID ");
                                 
                                 int Id = scanner.nextInt();
                                 
                                 gymAdmin.displayCustomersByCoach(Id);
                                 break;
                             }
                             case 14:
                             
                             {
                                 System.out.println("Enter the month and the year ex.:(dec,2004)");
                                 
                                 String month = scanner.nextLine();
                                 scanner.next();
                                 int year = scanner.nextInt();
                                 
                                 try {
                                    gymAdmin.monthlyIncome(month, year);
                                } catch (ParseException e) {
                                    System.err.println("Error parsing date: " + e.getMessage());
                                }
                
                                 break;
                             }
                                                   
                             case 15:
                             {
                                     gymAdmin.CoachesAccordingMostPopular();   
                                     break;  
                                 
                                 }
                                 default:{
                         System.out.println("Invalid choice");
                        }
                           
                    }
                        System.out.println("Do you want another service? ");
                        Answer34 = ANSWER.nextLine();
                     
           }while(continueAnswer1.equalsIgnoreCase(Answer34));
         }
        }
                case 6:
                        {
                            break;
                        }
                         default:  
                         {

                            System.out.println("Enter valid choice !");
                            break;

                         }  


                        }//general switch    

                        System.out.println("Do you want to continue? (Type  yes to continue. Else will exit the program)");
                        Scanner Answer = new Scanner(System.in);
                        Choicefinal=Answer.nextLine();
                        
                    }
                    //do while
                    while(continueAnswer1.equals(Choicefinal) || continueAnswer2.equals(Choicefinal));
                    System.out.println("#..Thanks for using our Gym management System <3..#");                   
                    main.write(gym.toString(),"outputdata.txt");//write function
                    scanner.close();       
                }//  small main bracket

     
                    

public void read(String filepath) throws FileNotFoundException
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
                        Subscription subscription = new Subscription(CustomerId, CoachId, membership, dateofsubescribtion);
                        Equipment equipment = new Equipment(equipmentname, equipmentcode, Equipmentquantity);
                        
                        // CustomerList.add();
                        ArrayList<Customer> CustomerList = new ArrayList<>();
                        Coach coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                        Coachemail, Coachphonenumber, workinghours,Coachpassword,CustomerList);//check
                        
                        Customer customer = new Customer(CustomerId, Customername, Customeraddress
                        , Customergender, Customeremail, Customerphonenumber, subscription, inBodyList, null, membership, Customerpassword);
                        customer.setAssignedCoach(coach);
                        
                        gymAdmin.addCustomer(customer);
                        gymAdmin.addCoach(coach);
                        gymAdmin.addEquipment(equipment);
                        gymAdmin.addSubscription(subscription);
                        
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

   
    
private <T> void write(String string, String filePath)
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
