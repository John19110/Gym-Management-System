package Gym;
import java.util.Date;

class MembershipPlan {
    protected Date StartDate;
    //3 days per week or 6 days per week
    protected String MonthlyPlan;
    protected int NumMonthsRegistered;
    protected double Price;
    protected double discount;


    public MembershipPlan(Date startdate, String monthly_plan, int numMonthsRegistered, double price) {
        StartDate = startdate;
        MonthlyPlan = monthly_plan;
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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
    public double calculateTotalPrice() {
        double totalPrice = Price * NumMonthsRegistered;
        if (NumMonthsRegistered >= 3) {
            totalPrice =totalPrice - (totalPrice * (discount / 100.0));
        }
        return totalPrice;
    }
}
