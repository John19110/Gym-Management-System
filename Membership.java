package Mygym;
import java.util.Date;

class Membership
 
{

    protected Date StartDate;
    protected Date endDate;
    protected String MonthlyPlan;
    protected int NumMonthsRegistered;
    protected int Price;

 

    public Membership(Date startDate, Date endDate, String monthlyPlan, int numMonthsRegistered, int  price) {
        StartDate = startDate;
        this.endDate = endDate;
        MonthlyPlan = monthlyPlan;
        NumMonthsRegistered = numMonthsRegistered;
        Price = price;
    } 
    



    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public String getMonthlyPlan() {
        return MonthlyPlan;
    }

    public void setMonthlyPlan(String monthlyPlan) {
        MonthlyPlan = monthlyPlan;
    }

    public int getNumMonthsRegistered() {
        return NumMonthsRegistered;
    }

    public void setNumMonthsRegistered(int numMonthsRegistered) {
        NumMonthsRegistered = numMonthsRegistered;
    }

    public double getPrice() 
    {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    public Date getEndDate() {
        return endDate;
    }


    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}