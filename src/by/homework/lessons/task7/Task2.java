package by.homework.lessons.task7;

import by.homework.lessons.task7.util.Student;

/*
2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
 */

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913",8);
        student.info();
    }
}