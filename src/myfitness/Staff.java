package myfitness;

/**
 * Base class representing a Staff member. (Task 2 & 3a)
 */
public abstract class Staff extends Person {
    private String role;
    private boolean isFullTime;
    private boolean isAvailableForBootcamp;

    public Staff(String id, String name, String phoneNumber, String email, String role, boolean isFullTime, boolean isAvailableForBootcamp) {
        super(id, name, phoneNumber, email);
        this.role = role;
        this.isFullTime = isFullTime;
        this.isAvailableForBootcamp = isAvailableForBootcamp;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isFullTime() { return isFullTime; }
    public void setFullTime(boolean fullTime) { isFullTime = fullTime; }

    public boolean isAvailableForBootcamp() { return isAvailableForBootcamp; }
    public void setAvailableForBootcamp(boolean availableForBootcamp) { this.isAvailableForBootcamp = availableForBootcamp; }

    @Override
    public String toString() {
        return super.toString() + ", Role: " + role + ", Full-Time: " + isFullTime + ", Available for Bootcamp: " + isAvailableForBootcamp;
    }
}
