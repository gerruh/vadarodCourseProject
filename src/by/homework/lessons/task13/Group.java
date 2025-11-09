package by.homework.lessons.task13;

import java.util.ArrayList;
import java.util.List;

class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public String getGroupNumber() { return groupNumber; }
    public void setGroupNumber(String groupNumber) { this.groupNumber = groupNumber; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(int mark) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageMark() < mark) {
                students.remove(i);
                i--;
            }
        }
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student s : students) {
            sum += s.getAverageMark();
        }
        return sum / students.size();
    }
}