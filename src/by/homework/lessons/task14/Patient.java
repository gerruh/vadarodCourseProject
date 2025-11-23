package by.homework.lessons.task14;

import java.util.Objects;

class Patient implements Comparable<Patient> {
    private int id;
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName + ", " + diagnosis + ", " + age + ", " + gender;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return id == patient.id &&
                Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(diagnosis, patient.diagnosis) &&
                age == patient.age &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, diagnosis, age, gender);
    }
}
