package by.homework.lessons.task7;

import java.util.Scanner;

/*
1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
4. Создать метод, который будет возвращать текущую группу с
тудента.
5. Создать метод, который будет изменять оценку студента и группу
 студента.
6. В классе main создать массив из пяти студентов.
7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов, массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задачи:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 5:
                Task5.run();
                break;
            case 6:
                Task6.run();
                break;
            case 7:
                Task7.run();
                break;
            case 8:
                Task8.run();
                break;
        }
    }
}
