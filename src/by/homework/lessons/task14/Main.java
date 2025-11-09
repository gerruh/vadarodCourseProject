package by.homework.lessons.task14;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Ivan", "Ivanov", "Flu", 30, Gender.MALE);
        Patient p2 = new Patient(2, "Anna", "Petrova", "Flu", 25, Gender.FEMALE);
        Patient p3 = new Patient(3, "Petr", "Sidorov", "Flu", 40, Gender.MALE);
        Patient p4 = new Patient(4, "Maria", "Kuznetsova", "Flu", 35, Gender.FEMALE);
        Patient p5 = new Patient(3, "Petr", "Sidorov", "Flu", 40, Gender.MALE);

        Ward ward1 = new Ward(101, Gender.MALE);
        Ward ward2 = new Ward(102, Gender.FEMALE);

        ward1.addPatient(p1);
        ward1.addPatient(p3);
        ward1.addPatient(p5);
        ward2.addPatient(p2);
        ward2.addPatient(p4);

        Department dep = new Department("Терапевтическое");
        dep.addWard(ward1);
        dep.addWard(ward2);

        dep.printDepartment();
        dep.countGender();
    }
}