package myfitness;

public class FullTimeStaff extends Staff {
    public FullTimeStaff(String id, String name, String phoneNumber, String email, String role, boolean isAvailableForBootcamp) {
        super(id, name, phoneNumber, email, role, true, isAvailableForBootcamp);
    }
}
