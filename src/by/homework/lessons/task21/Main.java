package by.homework.lessons.task21;
/*
1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1
        String localDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.forLanguageTag("ru")));
        System.out.println(localDate);

        //2
        String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy : HH:mm:ss a" , Locale.forLanguageTag("ru")));
        System.out.println(localDateTime);

        //3
        String inputLocalDateTime = "2023-03-19 : 10:12:24 AM";
        LocalDateTime defaultLocalDateTime = LocalDateTime.parse(inputLocalDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", Locale.ENGLISH));
        System.out.println(defaultLocalDateTime);

        //4
        String inputLocalDateTime2 = "пн 20.03.23 г. время: 15:07:28";
        inputLocalDateTime2 = replaceShortDay(inputLocalDateTime2);
        LocalDateTime defaultLocalDateTime2 = LocalDateTime.parse(inputLocalDateTime2,DateTimeFormatter.ofPattern("EEEE dd.MM.yy 'г.' 'время:' HH:mm:ss", Locale.forLanguageTag("ru")));
        System.out.println(defaultLocalDateTime2);

        //5
        String currentLocalDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy 'время:' HH:mm:ss a", Locale.forLanguageTag("ru")));
        System.out.println(currentLocalDateTime);
    }

    private static String replaceShortDay(String input) {
        Map<String, String> dayMap = Map.of(
                "пн", "понедельник",
                "вт", "вторник",
                "ср", "среда",
                "чт", "четверг",
                "пт", "пятница",
                "сб", "суббота",
                "вс", "воскресенье"
        );
        String shortDay = input.substring(0, 2).toLowerCase();
        String longDay = dayMap.get(shortDay);
        if (longDay != null) {
            return longDay + input.substring(2);
        }

        return input;
    }
}
