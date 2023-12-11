package gym;

import java.sql.Date;

public class InBody extends Person 
{

   

    private Date Date_Of_InBody;
    private double Height, Total_Weight, Body_Fat_Mass, Minerals, Total_Body_Water, Protein;
    

    
    public InBody(int iD, String name, String address, String gender, String email, String phoneNumber,
            Date date_Of_InBody, double height, double total_Weight, double body_Fat_Mass, double minerals,
            double total_Body_Water, double protein) {
        super(iD, name, address, gender, email, phoneNumber);
        Date_Of_InBody = date_Of_InBody;
        Height = height;
        Total_Weight = total_Weight;
        Body_Fat_Mass = body_Fat_Mass;
        Minerals = minerals;
        Total_Body_Water = total_Body_Water;
        Protein = protein;
    }

    public void setdate_of_InBody(Date Date_Of_InBody)

    {
        this.Date_Of_InBody=Date_Of_InBody;
    }
    
    public Date getDate_of_InBody() {
        return Date_Of_InBody;
    }

    public void setTotal_Weight(double Total_Weight)
    {
        this.Total_Weight=Total_Weight;
    }
    
    public double getTotal_Weight() {
        return Total_Weight;
    }
    public void setBody_Fat_Mass(double Body_Fat_Mass)
    {
        this.Body_Fat_Mass=Body_Fat_Mass;
    }
    
    public double getBody_Fat_Mass() {
        return Body_Fat_Mass;
    }
    
    public double getMinerals() {
        return Minerals;
    }

    public double getTotal_Body_Water() {
        return Total_Body_Water;
    }

    public double getProtein() {
        return Protein;
    }
    
    public double getHeight() {
        return Height;
    }

}

    