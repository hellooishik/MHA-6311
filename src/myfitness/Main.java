package myfitness;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MyFitness Gym Management System ===\n");

        GymManager manager = new GymManager();

        // 1. Add Staff Dummy Data (Task 3b)
        System.out.println(">>> Initializing Staff Database...");
        FullTimeStaff ft1 = new FullTimeStaff("S01", "Alice Smith", "111-222", "alice@myfitness.com", "Manager", false);
        FullTimeStaff ft2 = new FullTimeStaff("S02", "Bob Johnson", "111-333", "bob@myfitness.com", "Receptionist", false);
        PartTimeStaff pt1 = new PartTimeStaff("S03", "Charlie Davis", "111-444", "charlie@myfitness.com", "Cleaner", false);
        
        Instructor inst1 = new Instructor("I01", "David Fit", "555-111", "david@myfitness.com", true, "Fat Burn");
        Instructor inst2 = new Instructor("I02", "Emma Strong", "555-222", "emma@myfitness.com", true, "Full Body");
        
        manager.addStaff(ft1);
        manager.addStaff(ft2);
        manager.addStaff(pt1);
        manager.addStaff(inst1);
        manager.addStaff(inst2);

        System.out.println("Staff initialized. Total staff: " + manager.getStaffList().size() + "\n");

        // 2. Setup Bootcamp Classes
        BootcampClass fatBurnClass = new BootcampClass("Fat Burn", inst1);
        BootcampClass fullBodyClass = new BootcampClass("Full Body", inst2);
        manager.addBootcampClass(fatBurnClass);
        manager.addBootcampClass(fullBodyClass);

        // 3. Add Members Dummy Data (Task 2 & Task 3b)
        System.out.println(">>> Initializing Members Database...");
        LocalDate today = LocalDate.now();
        
        StudentMember m1 = new StudentMember("M01", "John Student", "000-111", "john@uni.ac.uk", today.minusDays(10), true, "STU999");
        StandardMember m2 = new StandardMember("M02", "Jane Standard", "000-222", "jane@email.com", today.minusDays(50), 365, false);
        PayAsYouGoMember m3 = new PayAsYouGoMember("M03", "Tom PayGo", "000-333", "tom@email.com", today.minusDays(5), true);
        
        // i. Updating gym records by adding or removing memberships.
        manager.addMember(m1);
        manager.addMember(m2);
        manager.addMember(m3);
        System.out.println();

        // ii. Display the membership details of a member including how many days/months left.
        System.out.println(">>> Displaying Member Details...");
        manager.displayMemberDetails(m1);
        manager.displayMemberDetails(m2);

        // iii. Managing bootcamp class memberships by adding or removing participants
        System.out.println("\n>>> Managing Bootcamp Class Participants...");
        fatBurnClass.addParticipant(m1);
        fatBurnClass.addParticipant(m2);
        fullBodyClass.addParticipant(m1); // m1 is in two classes
        
        // Validate and print details
        System.out.println("\n--- Bootcamp Validation ---");
        for (BootcampClass bc : manager.getBootcampClasses()) {
            System.out.println("Class: " + bc.getClassName());
            System.out.println("Instructor: " + bc.getInstructor().getName());
            System.out.print("Participants: ");
            for (Member p : bc.getParticipants()) {
                System.out.print(p.getName() + " (" + p.getPhoneNumber() + "), ");
            }
            System.out.println("\n");
        }

        // Task 3c. Calculate Bootcamp Fees
        System.out.println(">>> Calculating Bootcamp Fees (Task 3c)...");
        // John Student (M01) is a new customer and enrolled in 2 classes (Fat Burn, Full Body)
        int m1Classes = 2;
        double m1Fee = m1.calculateBootcampFee(m1Classes, m1.isNewCustomer());
        System.out.println("Member: " + m1.getName() + " (New Customer: " + m1.isNewCustomer() + ")");
        System.out.println("Classes Enrolled: " + m1Classes);
        System.out.println("Calculated Fee: £" + String.format("%.2f", m1Fee));

        // Jane Standard (M02) is not a new customer and enrolled in 1 class
        int m2Classes = 1;
        double m2Fee = m2.calculateBootcampFee(m2Classes, m2.isNewCustomer());
        System.out.println("\nMember: " + m2.getName() + " (New Customer: " + m2.isNewCustomer() + ")");
        System.out.println("Classes Enrolled: " + m2Classes);
        System.out.println("Calculated Fee: £" + String.format("%.2f", m2Fee));
        
        // Removing a participant to demonstrate functionality
        System.out.println("\n>>> Removing a Participant...");
        fatBurnClass.removeParticipant(m2);
        System.out.println("After removal, Fat Burn participants count: " + fatBurnClass.getParticipants().size());
    }
}
