package by.homework.lessons.task4;
import java.util.Scanner;

/*
    Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
    Написать программу, которая будет выводит разный текст, в зависимости от значения result. В случае result=3,
    вывести: "Результат деления равен 3" В случае result=5 вывести: "Результат деления равен 5"
    В других случаях вывести: "Результат деления равен дробному числу".
    При этом в последнем случае вывести точный результат деления (использовать приведение типов)
     */

public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int result = 15/x;

        switch (result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу");
        }
    }

    public static void runAlternative() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 15/x;

        switch (result) {
            case 3 -> System.out.println("Результат деления равен 3");
            case 5 -> System.out.println("Результат деления равен 5");
            default -> System.out.println("Результат деления равен дробному числу");
        }
    }
}