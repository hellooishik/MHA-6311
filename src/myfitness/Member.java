package myfitness;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Base class representing a Member. (Task 2 & 3a)
 */
public abstract class Member extends Person implements Payable {
    private LocalDate joinDate;
    private int durationDays;
    private boolean isNewCustomer;

    public Member(String id, String name, String phoneNumber, String email, LocalDate joinDate, int durationDays, boolean isNewCustomer) {
        super(id, name, phoneNumber, email);
        this.joinDate = joinDate;
        this.durationDays = durationDays;
        this.isNewCustomer = isNewCustomer;
    }

    public LocalDate getJoinDate() { return joinDate; }
    public void setJoinDate(LocalDate joinDate) { this.joinDate = joinDate; }

    public int getDurationDays() { return durationDays; }
    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }

    public boolean isNewCustomer() { return isNewCustomer; }
    public void setNewCustomer(boolean newCustomer) { isNewCustomer = newCustomer; }

    public long getDaysLeft() {
        LocalDate expiryDate = joinDate.plusDays(durationDays);
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expiryDate);
        return daysLeft > 0 ? daysLeft : 0;
    }

    // Implementing the interface method to calculate the bootcamp fee
    // "Set the bootcamp class fees in part (b) at £35.50 per month for new customers, 
    // with a 7% discount applied if they enrol in two or more bootcamp classes."
    @Override
    public double calculateBootcampFee(int numberOfClasses, boolean isNewCustomer) {
        double basePricePerClass = 35.50;
        double totalCost = basePricePerClass * numberOfClasses;
        
        if (isNewCustomer && numberOfClasses >= 2) {
            // Apply 7% discount for new customers enrolling in 2 or more classes
            totalCost = totalCost * 0.93;
        }
        return totalCost;
    }

    public abstract String getMembershipType();
    
    @Override
    public String toString() {
        return super.toString() + ", Type: " + getMembershipType() + ", Days Left: " + getDaysLeft();
    }
}
