package myfitness;

import java.time.LocalDate;

public class StandardMember extends Member {
    private boolean hasFrozenAccount;

    public StandardMember(String id, String name, String phoneNumber, String email, LocalDate joinDate, int durationDays, boolean isNewCustomer) {
        super(id, name, phoneNumber, email, joinDate, durationDays, isNewCustomer);
        this.hasFrozenAccount = false;
    }

    public boolean hasFrozenAccount() { return hasFrozenAccount; }
    
    public void freezeAccount() { 
        this.hasFrozenAccount = true; 
        System.out.println("Account successfully frozen once.");
    }

    @Override
    public String getMembershipType() {
        return "Standard Membership";
    }
}
