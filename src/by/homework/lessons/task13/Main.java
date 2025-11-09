package by.homework.lessons.task13;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student s1 = new Student("Иван", "Иванов", "01.01.2000", "Москва", 4.5);
        Student s2 = new Student("Петр", "Петров", "02.02.2001", "Санкт-Петербург", 3.2);
        Student s3 = new Student("Анна", "Смирнова", "03.03.2000", "Казань", 4.8);
        Student s4 = new Student("Олег", "Кузнецов", "04.04.2002", "Новосибирск", 2.9);
        Student s5 = new Student("Екатерина", "Васильева", "05.05.2001", "Екатеринбург", 5.0);

        Group g1 = new Group("101");
        g1.addStudent(s1);
        g1.addStudent(s2);

        Group g2 = new Group("102");
        g2.addStudent(s3);
        g2.addStudent(s4);
        g2.addStudent(s5);

        Faculty faculty = new Faculty("Факультет IT");
        faculty.addGroup(g1);
        faculty.addGroup(g2);

        System.out.println("Средний бал группы 101: " + g1.calculateAverageMark());

        g2.removeStudentsByMark(4);
        System.out.println("Студенты группы 102 после удаления:");
        for (Student s : g2.getStudents()) System.out.println(s);

        g1.transferToGroup(g2);

        faculty.checkAndUpdateStatus();
        System.out.println("Статус факультета: " + faculty.getStatus());

        System.out.println("Студенты по возрастанию среднего бала:");
        faculty.printStudentsAscending();

        System.out.println("Студенты по убыванию среднего бала:");
        faculty.printStudentsDescending();
    }
}