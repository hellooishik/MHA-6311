package myfitness;

import java.time.LocalDate;

public class StudentMember extends Member {
    private String studentID;

    public StudentMember(String id, String name, String phoneNumber, String email, LocalDate joinDate, boolean isNewCustomer, String studentID) {
        // 9 months duration = ~270 days. Let's use 270 days for simplicity
        super(id, name, phoneNumber, email, joinDate, 270, isNewCustomer);
        this.studentID = studentID;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    @Override
    public String getMembershipType() {
        return "Student Saver Membership";
    }
}
