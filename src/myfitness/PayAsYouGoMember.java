package myfitness;

import java.time.LocalDate;

public class PayAsYouGoMember extends Member {
    private int visitsRemaining;

    public PayAsYouGoMember(String id, String name, String phoneNumber, String email, LocalDate joinDate, boolean isNewCustomer) {
        super(id, name, phoneNumber, email, joinDate, 30, isNewCustomer); // 30 days to use it
        this.visitsRemaining = 0; // Can be incremented when paying
    }

    public void addVisits(int visits) {
        this.visitsRemaining += visits;
    }

    public void useVisit() {
        if (visitsRemaining > 0) {
            visitsRemaining--;
        } else {
            System.out.println("No visits remaining. Please top up.");
        }
    }

    @Override
    public String getMembershipType() {
        return "Pay-as-You-Go Membership";
    }
}
