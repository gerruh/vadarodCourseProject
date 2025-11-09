package by.homework.lessons.task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Иван", "Иванов", 25, 1000);
        Employee e2 = new Employee(2, "Петр", "Петров", 30, 1200);
        Employee e3 = new Employee(3, "Сергей", "Сергеев", 28, 1100);
        Employee e4 = new Employee(4, "Анна", "Аннова", 27, 1300);
        Employee e5 = new Employee(5, "Мария", "Морская", 35, 1500);
        Employee e6 = new Employee(6, "Алексей", "Алексеев", 40, 2000);
        Employee e7 = new Employee(7, "Ольга", "Ольгова", 22, 900);
        Employee e8 = new Employee(8, "Дмитрий", "Дмитриев", 33, 1700);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(e1, "Плотник");
        employees.put(e2, "Сварщик");
        employees.put(e3, "Плотник");
        employees.put(e4, "Менеджер");
        employees.put(e5, "Сварщик");
        employees.put(e6, "Менеджер");
        employees.put(e7, "Плотник");
        employees.put(e8, "Дизайнер");

        raiseSalaryForProfession(employees, "Плотник", 200);

        System.out.println("После повышения зарплаты:");
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<String, Collection<Employee>> professionMap = invertMap(employees);
        System.out.println("\nМап профессия -> сотрудники:");
        for (Map.Entry<String, Collection<Employee>> entry : professionMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                entry.getKey().salary += amountOfIncrease;
            }
        }
    }

    private static Map<String, Collection<Employee>> invertMap(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> result = new HashMap<>();
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String profession = entry.getValue();
            Employee emp = entry.getKey();
            if (!result.containsKey(profession)) {
                result.put(profession, new ArrayList<>());
            }
            result.get(profession).add(emp);
        }
        return result;
    }
}
