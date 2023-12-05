package Gym;
class MembershipPlan {
    protected String StartDate;
    protected String MonthlyPlan;
    protected int NumMonthsRegistered;
    protected double Price;

    public MembershipPlan(String startdate, String monthlyplan, int numMonthsRegistered, double price) {
        StartDate = startdate;
        MonthlyPlan = monthlyplan;
        NumMonthsRegistered = numMonthsRegistered;
        Price = price;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
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
}
