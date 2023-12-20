package Mygym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InBody extends Person {

    private Date dateOfInBody;
    private double height, totalWeight, bodyFatMass, minerals, totalBodyWater, protein;

    public InBody(int iD, String name, String address, String gender, String email, String phoneNumber,
                  Date dateOfInBody, double height, double totalWeight, double bodyFatMass, double minerals,
                  double totalBodyWater, double protein) 
                  {
        super(iD, name, address, gender, email, phoneNumber);
        this.dateOfInBody = dateOfInBody;
        this.height = height;
        this.totalWeight = totalWeight;
        this.bodyFatMass = bodyFatMass;
        this.minerals = minerals;
        this.totalBodyWater = totalBodyWater;
        this.protein = protein;
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

    public void setDateOfInBody(Date dateOfInBody) {
        this.dateOfInBody = dateOfInBody;
    }

    public Date getDateOfInBody() {
        return dateOfInBody;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setBodyFatMass(double bodyFatMass) {
        this.bodyFatMass = bodyFatMass;
    }

    public double getBodyFatMass() {
        return bodyFatMass;
    }

    public double getMinerals() {
        return minerals;
    }

    public double getTotalBodyWater() {
        return totalBodyWater;
    }

    public double getProtein() {
        return protein;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return super.toString() +
                "Date Of InBody=" + dateFormat.format(dateOfInBody) + "\n" +
                "Height=" + height + "\n" +
                "Total Body Water=" + totalBodyWater + "\n" +
                "Total Weight=" + totalWeight + "\n" +
                "Body Fat Mass=" + bodyFatMass + "\n" +
                "Minerals=" + minerals + "\n" +
                "Protein=" + protein + "\n";
    }
}
