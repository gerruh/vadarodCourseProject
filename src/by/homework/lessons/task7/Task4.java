package by.homework.lessons.task7;

//Создать метод, который будет возвращать текущую группу студента.

import by.homework.lessons.task7.util.Student;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913",8);
        System.out.println(student.returnGroup());
    }
}
