package Gym;

class Subscription {
    protected int CustomerId;
    protected int CoachId;
    protected MembershipPlan membershipPlan;

    public Subscription(int customerid, int coachid, MembershipPlan membershipPlan) {
        CustomerId = customerid;
        CoachId = coachid;
        membershipPlan = membershipPlan;
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

    public MembershipPlan getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(MembershipPlan membershipPlan) {
        this.membershipPlan = membershipPlan;
    }
}
