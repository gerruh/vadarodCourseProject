package by.homework.lessons.task14;

import java.util.HashSet;
import java.util.Set;

class Department {
    private String name;
    private Set<Ward> wards = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public void addWard(Ward w) {
        wards.add(w);
    }

    public void countGender() {
        int male = 0;
        int female = 0;
        for (Ward w : wards) {
            for (Patient p : w.getPatients()) {
                if (p.getGender() == Gender.MALE) male++;
                else female++;
            }
        }
        System.out.println("Мужчины: " + male + ", Женщины: " + female);
    }

    public void printDepartment() {
        System.out.println("Отделение: " + name);
        for (Ward w : wards) {
            w.printPatients();
        }
    }
}
