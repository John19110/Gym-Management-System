package Mygym;
import java.util.Date;

class Subscription {
    protected int CustomerId;
    protected int CoachId;
    protected Membership membership;
    protected  Date DateOfSubescription;

    

    public Subscription(int customerId, int coachId, Membership membership, Date dateOfSubescription) {
        CustomerId = customerId;
        CoachId = coachId;
        this.membership = membership;
        DateOfSubescription = dateOfSubescription;
    }

    public int getCustomerId()
    {
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
        this.membership = membership;
    }

    public Date getDateOfSubescription() {
        return DateOfSubescription;
    }

    public void setDateOfSubescription(Date dateOfSubescription) {
        DateOfSubescription = dateOfSubescription;
    }
}