package gym;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Customer extends Person
{

    private String Subscription;
    private List<InBody>InBodies;

   
   

    public Customer(int iD, int phoneNumber, String name, String address, String gender, String email,
            String subscription) {
        super(iD, phoneNumber, name, address, gender, email);
        Subscription = subscription;
      this.InBodies= new ArrayList<>();
           
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }


    public int getPhoneNumber() {
        return PhoneNumber;
    }


    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public String getGender() {
        return Gender;
    }


    public void setGender(String gender) {
        Gender = gender;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getSubscription() {
        return Subscription;
    }


    public void setSubscription(String subscription) {
        Subscription = subscription;
    }

    

    public static void displayEquipment(Equipment equipment) 
        {for (int i=0;i<equipments.size();i++)

        System.out.println("Equipment Name: " + equipment.getName());
        System.out.println("Equipment Code: " + equipment.getCode());
        System.out.println("Equipment Quantity: " + equipment.getQuantity());
    
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
        
}