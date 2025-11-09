package by.homework.lessons.task15;

import java.util.Objects;

class Employee {
    int id;
    String firstName;
    String lastName;
    int age;
    int salary;

    public Employee(int id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Зарплата: " + salary + ")";
    }
}
