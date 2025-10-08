package by.homework.lessons.task7;
/*
Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
faculty (факультет, тип String ), course(тип int) , Группа(тип String),
средняя оценка (тип int).
Инициализацию студента в классе main выполнять через конструктор с параметрами.
Также определите конструктор без параметров.
 */

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int averageGrade;

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public Student() {
        id = 0;
        name = "";
        surname = "";
        faculty = "";
        course = 0;
        group = "";
        averageGrade = 0;
    }


    public void info() {
        System.out.println("Id: " + this.id + "\nName: " + this.name + "\nSurname: " + this.surname + "\nFaculty: " + this.faculty + "\nCourse: " + this.course + "\nGroup: " + this.group + "\nAverageGrade: " + this.averageGrade);
    }

    //Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
    public void setGroup(String group) {
        this.group = group;
    }

    public String returnGroup() {
        return group;
    }

    //Создать метод, который будет изменять оценку студента и группу студента.
    public void setAverageGradeAndGroup(int averageGrade, String group) {
        this.averageGrade = averageGrade;
        this.group = group;
    }

    /*
    Создать метод в классе Student, который будет принимать массив студентов и возвращать
    из этих студентов, массив студентов у которых оценка выше переданной оценке в методе.
    (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
     */

    public static Student[] getGradedStudents(Student[] students, int averageGrade) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.averageGrade > averageGrade) {
                result.add(student);
            }
        }
        return result.toArray(new Student[result.size()]);
    }

    @Override
    public String toString() {
        return "Student {name = " + name + ", surname = " + surname + ", faculty = " + faculty + ", course = " + course + ", group = " + group + ", averageGrade = " + averageGrade + "}";
    }
}
