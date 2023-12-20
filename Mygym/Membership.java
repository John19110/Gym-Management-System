package Mygym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Membership {

    private Date startDate;
    private Date endDate;
    private String monthlyPlan;
    private int numMonthsRegistered;
    private int price;

    public Membership(Date startDate, Date endDate, String monthlyPlan, int numMonthsRegistered, int price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.monthlyPlan = monthlyPlan;
        this.numMonthsRegistered = numMonthsRegistered;
        this.price = price;
    }

    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMonthlyPlan() {
        return monthlyPlan;
    }

    public void setMonthlyPlan(String monthlyPlan) {
        this.monthlyPlan = monthlyPlan;
    }

    public int getNumMonthsRegistered() {
        return numMonthsRegistered;
    }

    public void setNumMonthsRegistered(int numMonthsRegistered) {
        this.numMonthsRegistered = numMonthsRegistered;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Membership{" + "\n" +
                "startDate=" + "\n" + dateFormat.format(startDate) + "\n" +
                ", endDate=" + "\n" + dateFormat.format(endDate) + "\n" +
                ", monthlyPlan='"+ "\n" + monthlyPlan + '\'' +
                ", numMonthsRegistered=" + "\n" +numMonthsRegistered + "\n" +
                ", price=" + "\n" + price +
                '}';
    }
}
