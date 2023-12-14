package Mygym;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main 
{

    Gym gym = new Gym(null, null, null);  
    Admin admin = new Admin(gym);
    public static void main(String[] args) throws FileNotFoundException, NullPointerException
     {
         
         Main main=new Main();
         main.read("inputdata.txt");   // reeeeaaaadddddiiiiiinnnnggggg for just one timmmmmeeeeee
          System.out.println("Welcome in our gym !");
        System.out.println("________________________");

    //    main.write("outputdata.txt");

    }

    public  void read(String filepath) throws FileNotFoundException
     {

        File file = new File(filepath);
        Scanner inputfile;

        if (file.exists()) {
            inputfile = new Scanner(file);

            for (int i = 0; i < 2 && inputfile.hasNextLine(); i++) {
                try {
                    int CustomerId = Integer.parseInt(inputfile.nextLine());
                    String Customername = inputfile.nextLine();
                    String Customeraddress = inputfile.nextLine();
                    String Customergender = inputfile.nextLine();
                    String Customeremail = inputfile.nextLine();
                    String Customerphonenumber = inputfile.nextLine();

                    int CoachId = Integer.parseInt(inputfile.nextLine());
                    String Coachname = inputfile.nextLine();
                    String Coachaddress = inputfile.nextLine();
                    String Coachgender = inputfile.nextLine();
                    String Coachemail = inputfile.nextLine();
                    String Coachphonenumber = inputfile.nextLine();

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

                            Subscription subscription = new Subscription(CustomerId, CoachId, membership, dateofsubescribtion);
                            Coach coach = new Coach(CoachId, Coachname, Coachaddress, Coachgender,
                            Coachemail, Coachphonenumber, workinghours, null);
                       List<InBody>inbodies=gym.getCustomers().get(i).getInBodies();
                       inbodies.add(inbody);
                            Customer customer = new Customer(CustomerId, Customername, Customeraddress, Customergender, Customeremail,
                            Customerphonenumber, subscription,inbodies, coach, membership);
                    Equipment equipment = new Equipment(equipmentname, equipmentcode, Equipmentquantity);

                    admin.addCustomer(customer);
                    admin.addCoach(coach);
                    admin.addEquipment(equipment);

                } catch (NumberFormatException | ParseException e) {
                    // Handle the exception (e.g., log the error, provide a user-friendly message)
                    e.printStackTrace();
                }
            }

            if (!gym.getCustomers().isEmpty()) {
                System.out.println(gym.getCustomers().get(0).getID());
                System.out.println(gym.getCustomers().get(0).getName());
                System.out.println(gym.getCoaches().get(1).getEmail());
                System.out.println(gym.getCustomers().get(0).getInBodies().get(0).getTotal_Body_Water());
            }

            inputfile.close(); // Close the scanner after reading the file
        }
    }
        public  void write(String filepath)
        {

        }

}

