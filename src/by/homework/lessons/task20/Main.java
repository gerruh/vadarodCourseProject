package by.homework.lessons.task20;
/*
Гербер Шилдт. Полное руководство. Java 12 -ое издание. Страницы: с 1103-1109 1.
1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3); // пул из 3 потоков
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new FileGeneratorTask(i + 1)));
        }

        for (Future<List<String>> future : futures) {
            List<String> files = future.get();
            System.out.println("Задача завершена. Файлы: " + files);
        }

        executor.shutdown();
    }
}
