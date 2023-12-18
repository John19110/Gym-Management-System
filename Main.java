package Mygym;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import gym.Equipment;
import gym.InBody;

public class Main 

{
    static Main main=new Main();
    
    public Gym gym=new Gym("Perfecet Gym", "12 Ahmed Orabi st Shobra Elkhima", "01273036464");

    
    public static void main(String[] args) throws FileNotFoundException, NullPointerException
     {
         
         main.read("inputdata.txt");   
          System.out.println("Welcome in our gym !");
        System.out.println("________________________");
        
        while (true) {
            System.out.println("Welcome to our Gym Management System");
            System.out.println("1. Customer Registration");
            System.out.println("2. Customer Login");
            System.out.println("3. Login as Admin");
            System.out.println("4. Book a Class");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:{
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your ID: ");
                int id = scanner.nextInt();
                 scanner.nextLine();

                 System.out.println("Enter your name: ");
                 String name = scanner.nextLine();

                 System.out.println("Enter your address: ");
                 String address = scanner.nextLine();

                 System.out.println("Enter your gender: ");
                 String gender = scanner.nextLine();

                 System.out.println("Enter your phone number: ");
                 String phoneNumber = scanner.nextLine();

                 System.out.println("Enter your subscription: ");
                 String subscription = scanner.nextLine();

                 System.out.println("Enter your email: ");
                 String email = scanner.nextLine();

                 System.out.println("Enter your password: ");
                 String customerPassword = scanner.nextLine();

                 System.out.println("Enter your coach's name: ");

                 Coach assignedCoach = getCoachDetails(scanner);

                 Customer newCustomer = Customer.registerCustomer(id, name, address, gender, email, phoneNumber, subscription, assignedCoach, null, customerPassword);
                    if (newCustomer != null) {
                        System.out.println("Registration successful!");
                    } 
                    else {
                        System.out.println("Registration failed. User with the same email already exists.");
                        continue;
                    }

                    break;
                }

                case 2:{

                    System.out.println("Enter your email: ");
                    String customerEmail = scanner.nextLine();
            
                    System.out.println("Enter your password: ");
                    String customerPassword = scanner.nextLine();
            
                    Customer gymCustomer = Customer.loginCustomer(customerEmail, customerPassword);
            
                    if (gymCustomer != null) {
                        
                        System.out.println("Customer login successful!");
                        System.out.println("#-------------------------#");

                        while(true){
                            String answer;
                        System.out.println("1. Display Coach Information.");
                        System.out.println("2. Display Equipments.");
                        System.out.println("3. Display How many kilos should you loss.");
                        System.out.println("4. Display Inbody information in a specific date.");
                        System.out.println("5. Display Membership plan.");

                        int choice2 = scanner.nextInt();
                        switch (choice2){
                            case(1):
                            {
                                gymCustomer.displayCoahInfo();

                                System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                answer = scanner.nextLine();
                                if(answer.equals("yes") || answer.equals("Yes")){
                                    continue;
                                }
                                else{
                                    break;
                                }

                            }
                            case(2):{
                                gymCustomer.displayEquipments();
                               System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                answer = scanner.nextLine();
                                if(answer.equals("yes") || answer.equals("Yes")){
                                    continue;
                                }
                                else{
                                    break;
                                }

                            }
                            case(3):{
                                gymCustomer.DisplayHowManyKilosNeededToReduce();
                                System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                answer = scanner.nextLine();
                                if(answer.equals("yes") || answer.equals("Yes")){
                                    continue;
                                }
                                else{
                                    break;
                                }

                            }
                            case(4):
                            System.out.println("Enter the date : (dd/mm/yyyy) ");
                            String sc = scanner.next();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
                            LocalDate enteredDate = LocalDate.parse(sc, formatter);

                            gymCustomer.displayInbodyInformation(enteredDate);

                            System.out.println("Do you want to continue? (Type Yes or yes to continue. Else will go back to main menu)");
                                answer = scanner.nextLine();
                                if(answer.equals("yes") || answer.equals("Yes")){
                                    continue;
                                }
                                else{
                                    break;
                                }
                                case(5): //Membership plan

                        }
                    }


                    }
                    else
                    {
                        System.out.println("Customer login failed. Incorrect email or password.");
                    }


                    break;
                }
                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:

                    break;

                case 7:
                    System.out.println("Thank you for using the Gym Management System. Goodbye!");
                case 8:
                Admin.Login();

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        }


         
    main.write(Gym.tString(),"outputdata.txt");


    }

    
public  void read(String filepath) throws FileNotFoundException
     {

        File file = new File(filepath);
        Scanner inputfile;

        if (file.exists()) {
            inputfile = new Scanner(file);

            while (inputfile.hasNextLine())
             {
                try {
                    int CustomerId = Integer.parseInt(inputfile.nextLine());
                    String Customername = inputfile.nextLine();
                    String Customeraddress = inputfile.nextLine();
                    String Customergender = inputfile.nextLine();
                    String Customeremail = inputfile.nextLine();
                    String Customerphonenumber = inputfile.nextLine();
                    String Customerpassword = inputfile.nextLine();
                    int CoachId = Integer.parseInt(inputfile.nextLine());
                    String Coachname = inputfile.nextLine();
                    String Coachaddress = inputfile.nextLine();
                    String Coachgender = inputfile.nextLine();
                    String Coachemail = inputfile.nextLine();
                    String Coachphonenumber = inputfile.nextLine();
                    String Coachpassword = inputfile.nextLine();

                    String stringstartdate = inputfile.nextLine();
                    String stringenddate = inputfile.nextLine();
                    String monthlyPlan = inputfile.nextLine();
                    int numMonthsRegistered = Integer.parseInt(inputfile.nextLine());
                    int pric = Integer.parseInt(inputfile.nextLine());
                    String stringdateofsubescription = inputfile.nextLine();
                    String stringdateofinbody = inputfile.nextLine();
                    int height = Integer.parseInt(inputfile.nextLine());
                    int totalWeight = Integer.parseInt(inputfile.nextLine());
                    int body_Fat_Mass = Integer.parseInt(inputfile.nextLine());
                    int minerals = Integer.parseInt(inputfile.nextLine());
                    int total_Body_Water = Integer.parseInt(inputfile.nextLine());
                    int protein = Integer.parseInt(inputfile.nextLine());
                    int workinghours = 0; // Default value, since it's not provided in the sample data
                    // Parse non-numeric values using try-catch
                    try {
                        workinghours = Integer.parseInt(inputfile.nextLine());
                    } catch (NumberFormatException e) {
                        // Handle the exception, e.g., log the error
                        e.printStackTrace();
                    }

                    String equipmentname = inputfile.nextLine();
                    int Equipmentquantity = 0; // Default value
                    int equipmentcode = 0; // Default value

                    // Parse non-numeric values using try-catch
                    try {
                        Equipmentquantity = Integer.parseInt(inputfile.nextLine());
                        equipmentcode = Integer.parseInt(inputfile.nextLine());
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
                        
                        Coach coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                        Coachemail, Coachphonenumber, workinghours,Coachpassword);
                        Customer customer = new Customer(CustomerId, Customername, Customeraddress, Customergender, Customeremail,
                        Customerphonenumber, subscription,inBodyList, coach, membership,Customerpassword);
                        
                    admin.addCustomer(customer);
                    admin.addCoach(coach);
                    admin.addEquipment(equipment);
                    admin.addSubscription(subscription);
                    

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
