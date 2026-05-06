package myfitness;

import java.time.LocalDate;

public class DiscountMember extends Member {
    private double discountPercentage;

    public DiscountMember(String id, String name, String phoneNumber, String email, LocalDate joinDate, int durationDays, boolean isNewCustomer, double discountPercentage) {
        super(id, name, phoneNumber, email, joinDate, durationDays, isNewCustomer);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }

    @Override
    public String getMembershipType() {
        return "Discount Membership (" + discountPercentage + "% off)";
    }
}
