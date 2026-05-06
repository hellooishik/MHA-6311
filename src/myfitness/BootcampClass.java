package myfitness;

import java.util.ArrayList;
import java.util.List;

public class BootcampClass {
    private String className;
    private Instructor instructor;
    private List<Member> participants;
    private int durationDays;

    public BootcampClass(String className, Instructor instructor) {
        this.className = className;
        this.instructor = instructor;
        this.participants = new ArrayList<>();
        this.durationDays = 30; // 30 days per class as per case study
    }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public List<Member> getParticipants() { return participants; }

    public void addParticipant(Member member) {
        if (!participants.contains(member)) {
            participants.add(member);
            System.out.println("Member " + member.getName() + " added to " + className);
        } else {
            System.out.println("Member already in the class.");
        }
    }

    public void removeParticipant(Member member) {
        if (participants.remove(member)) {
            System.out.println("Member " + member.getName() + " removed from " + className);
        } else {
            System.out.println("Member not found in the class.");
        }
    }

    @Override
    public String toString() {
        return "Bootcamp: " + className + " (Instructor: " + instructor.getName() + ") - Participants: " + participants.size();
    }
}
