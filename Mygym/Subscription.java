package Mygym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Subscription {

    protected int CustomerId;
    protected int CoachId;
    protected Membership membership;
    protected Date DateOfSubscription;

    public Subscription(int customerId, int coachId, Membership membership, Date dateOfSubscription) {
        CustomerId = customerId;
        CoachId = coachId;
        this.membership = membership;
        DateOfSubscription = dateOfSubscription;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public int getCoachId() {
        return CoachId;
    }

    public void setCoachId(int coachId) {
        CoachId = coachId;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
    	   
        try 
        {
               if (this.membership != null)
               {
               throw new IllegalStateException("Customer has already an active membership plan.");
               }
               
            this.membership = membership;
            
            
            //catch.....
            
        } 
        catch (IllegalStateException e)
        {
           
            System.err.println("Error setting membership: " + e.getMessage());
            
            this.membership = null;
            
            
        }
    }


    public Date getDateOfSubscription() {
        return DateOfSubscription;
    }

    public void setDateOfSubscription(Date dateOfSubscription) {
        DateOfSubscription = dateOfSubscription;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Subscription{" +
                "CustomerId=" + CustomerId +
                ", CoachId=" + CoachId +
                ", membership=" + membership +
                ", DateOfSubscription=" + dateFormat.format(DateOfSubscription) +
                '}';
    }
}
