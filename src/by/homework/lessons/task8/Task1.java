package by.homework.lessons.task8;

/*
1. Задание
1.1.Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.
1.2.В этом методе необходимо выполнить следующую логику. Если строка в 1-ом параметре заканчивается строкой из второго параметра, то необходимо вырезать из строки 1-ого параметра значение строки не включающей строку из второго параметра. Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
Пример. Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой что и 2-ая строка (java), то метод должен вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ».В этом методе нужно использовать методы для работы со строками: endWith(), indexOf(), substring(), toUpperCase();
1.3 В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат вконсоль.
 */

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(
                stringMethod2(
                        "Это текст который есть",
                        "который есть"
                )
        );

        System.out.println(
                stringMethod2(
                        "Это текст который есть",
                        "и он будет большим"
                )
        );
    }

    //1.1
    public String stringMethod(String param1, String param2) {
        return param1 + param2;
    }

    //1.2
    public static String stringMethod2(String param1, String param2) {
        if (param1.endsWith(param2)) {
            return param1.substring(0, param1.length() - param2.length());
        } else {
            return param1.toUpperCase();
        }
    }
}
