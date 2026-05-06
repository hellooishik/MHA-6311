package myfitness;

public class Instructor extends Staff {
    private String specialization;

    public Instructor(String id, String name, String phoneNumber, String email, boolean isFullTime, String specialization) {
        super(id, name, phoneNumber, email, "Fitness Expert Instructor", isFullTime, true);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}
