package by.homework.lessons.task13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Faculty {
    private String name;
    private List<Group> groups;
    private FacultyStatus status;

    public Faculty(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
        this.status = FacultyStatus.ACTIVE;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Group> getGroups() { return groups; }
    public void setGroups(List<Group> groups) { this.groups = groups; }

    public FacultyStatus getStatus() { return status; }
    public void setStatus(FacultyStatus status) { this.status = status; }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void checkAndUpdateStatus() {
        int totalStudents = 0;
        for (Group g : groups) {
            totalStudents += g.getStudents().size();
        }
        if (totalStudents < 20) {
            status = FacultyStatus.NOT_ACTIVE;
        } else {
            status = FacultyStatus.ACTIVE;
        }
    }

    public void printStudentsAscending() {
        List<Student> allStudents = new ArrayList<>();
        for (Group g : groups) {
            allStudents.addAll(g.getStudents());
        }

        allStudents.sort(Comparator.comparingDouble(Student::getAverageMark));

        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

    public void printStudentsDescending() {
        List<Student> allStudents = new ArrayList<>();
        for (Group g : groups) {
            allStudents.addAll(g.getStudents());
        }

        allStudents.sort(Comparator.comparingDouble(Student::getAverageMark).reversed());

        for (Student s : allStudents) {
            System.out.println(s);
        }
    }
}
