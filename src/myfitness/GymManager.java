package myfitness;

import java.util.ArrayList;
import java.util.List;

public class GymManager {
    private List<Member> members;
    private List<Staff> staffList;
    private List<BootcampClass> bootcampClasses;

    public GymManager() {
        members = new ArrayList<>();
        staffList = new ArrayList<>();
        bootcampClasses = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Added membership for: " + member.getName());
    }

    public void removeMember(Member member) {
        if (members.remove(member)) {
            System.out.println("Removed membership for: " + member.getName());
        }
    }

    public void displayMemberDetails(Member member) {
        System.out.println("--- Member Details ---");
        System.out.println("Name: " + member.getName());
        System.out.println("Phone: " + member.getPhoneNumber());
        System.out.println("Email: " + member.getEmail());
        System.out.println("Type: " + member.getMembershipType());
        System.out.println("Days Left: " + member.getDaysLeft());
        System.out.println("----------------------");
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void addBootcampClass(BootcampClass bootcamp) {
        bootcampClasses.add(bootcamp);
    }

    public List<Member> getMembers() { return members; }
    public List<Staff> getStaffList() { return staffList; }
    public List<BootcampClass> getBootcampClasses() { return bootcampClasses; }
}
