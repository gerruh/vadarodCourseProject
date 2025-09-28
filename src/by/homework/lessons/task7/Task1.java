package by.homework.lessons.task7;
import by.homework.lessons.task7.util.Student;

/*
Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
faculty (факультет, тип String ), course(тип int) ,
Группа(тип String), средняя оценка (тип int).
Инициализацию студента в классе main выполнять через конструктор с параметрами.
Также определите конструктор без параметров.
 */

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student(1,"Volzhsky","Herman","International economic relations and management",5,"1913",8);
        System.out.println(student.toString());
    }
}
