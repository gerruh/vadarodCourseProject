package by.homework.lessons.task7;

// В классе main создать массив из пяти студентов.

public class Task6 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student[] students = new Student[5];

        for (Student student : students) {
            student = new Student();
            System.out.println(student.toString());
        }
    }
}
