package by.homework.lessons.task7;

//3. Создать метод, который будет изменять текущую группу студента
// (сам метод в качестве параметра будет принимать новую группу)

import by.homework.lessons.task7.util.Student;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913",8);
        System.out.println(student.toString());
        student.setGroup("2428");
        System.out.println(student.toString());
    }
}
