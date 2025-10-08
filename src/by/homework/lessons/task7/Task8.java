package by.homework.lessons.task7;

//8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву
// и вызвать на каждом студенте метод info, который вы создавали в задании 2

public class Task8 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        Student[] students = new Student[10];
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

        for (Student student : gradedStudents) {
            student.info();
        }
    }
}