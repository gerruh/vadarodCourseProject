package by.homework.lessons.task14;

import java.util.TreeSet;

class Ward {
    private int number;
    private Gender type;
    private TreeSet<Patient> patients = new TreeSet<>();
    private static final int MAX_PATIENTS = 3;

    public Ward(int number, Gender type) {
        this.number = number;
        this.type = type;
    }

    public boolean addPatient(Patient p) {
        if (patients.size() >= MAX_PATIENTS) {
            System.out.println("Палата полна!");
            return false;
        }
        if (!patients.isEmpty() && !patients.first().getDiagnosis().equals(p.getDiagnosis())) {
            System.out.println("Диагноз не совпадает с другими пациентами палаты!");
            return false;
        }
        return patients.add(p);
    }

    public void printPatients() {
        System.out.println("Палата " + number + " (" + type + "):");
        for (Patient p : patients) {
            System.out.println("  " + p);
        }
    }

    public TreeSet<Patient> getPatients() {
        return patients;
    }
}
