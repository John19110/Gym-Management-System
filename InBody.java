package gym;

import java.sql.Date;

public class InBody extends Person {

   public InBody(int iD, int phoneNumber, String name, String address, String gender, String email) {
        super(iD, phoneNumber, name, address, gender, email);
    }

    private Date Date_Of_InBody;
    private double Height, Total_Weight, Body_Fat_Mass, Minerals, Total_Body_Water, Protein;

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
