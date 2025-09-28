package by.homework.lessons.task7;

/*
Создать метод в классе Student, который будет принимать массив студентов
и возвращать из этих студентов, массив студентов у которых оценка выше переданной оценке в методе.
(Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
 */

import by.homework.lessons.task7.util.Student;

public class Task7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student [] students = new Student[10];
        int grade = 1;

        for (int i = 0; i < students.length; i++) {
            Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913", grade);

            students[i] = student;

            grade += 1;
        }

        Student[] gradedStudents = Student.getGradedStudents(students,5);
        for (int i = 0; i < gradedStudents.length; i++) {
            System.out.println(gradedStudents[i].toString());
        }
    }
}
