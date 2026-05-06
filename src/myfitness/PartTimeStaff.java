package myfitness;

public class PartTimeStaff extends Staff {
    public PartTimeStaff(String id, String name, String phoneNumber, String email, String role, boolean isAvailableForBootcamp) {
        super(id, name, phoneNumber, email, role, false, isAvailableForBootcamp);
    }
}
