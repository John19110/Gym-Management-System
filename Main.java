package Mygym;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main 

{
    static Main main=new Main();
    
    public Gym gym=new Gym("Perfecet Gym", "12 Ahmed Orabi st Shobra Elkhima", "01273036464");

    Admin admin = new Admin(gym);
    public static void main(String[] args) throws FileNotFoundException, NullPointerException
     {
         
         main.read("inputdata.txt");   
          System.out.println("Welcome in our gym !");
        System.out.println("________________________");



        //oliver and beashoy work will be here
        //oliver and beashoy work will be here
        //oliver and beashoy work will be here
         
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
                        ArrayList<Customer> customers = new ArrayList<>();
                        
                        Subscription subscription = new Subscription(CustomerId, CoachId, membership, dateofsubescribtion);
                        Equipment equipment = new Equipment(equipmentname, equipmentcode, Equipmentquantity);
                        Customer customer = new Customer(CustomerId, Customername, Customeraddress, Customergender, Customeremail,
                        Customerphonenumber, subscription,inBodyList, null, membership,Customerpassword);
                        customers.add(customer);
                        Coach coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                        Coachemail, Coachphonenumber, workinghours, customers,Coachpassword);
                        
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
