package by.homework.lessons.task7;

//Создать метод, который будет изменять оценку студента и группу
// студента.

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913",8);
        System.out.println(student.toString());
        student.setAverageGradeAndGroup(7,"Testing Group");
        System.out.println(student.toString());
    }
}
