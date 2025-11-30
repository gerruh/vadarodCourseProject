package by.homework.lessons.task20;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

class FileGeneratorTask implements Callable<List<String>> {

    private final int taskId;
    private final Random random = new Random();

    public FileGeneratorTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public List<String> call() throws Exception {

        String threadName = Thread.currentThread().getName();
        System.out.println("Запуск задачи " + taskId + " в потоке: " + threadName);

        List<String> fileNames = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String fileName = "task" + taskId + "_file" + i + ".txt";
            fileNames.add(fileName);

            System.out.println("[" + threadName + "] создаёт файл: " + fileName);

            try (FileWriter writer = new FileWriter(fileName)) {
                for (int j = 0; j < 10; j++) {
                    writer.write("Строка " + random.nextInt(1000) + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int sleepTime = 1 + random.nextInt(3);
            System.out.println("[" + threadName + "] спит " + sleepTime + " сек.");
            Thread.sleep(sleepTime * 1000);
        }

        System.out.println("Задача " + taskId + " завершена в потоке: " + threadName);

        return fileNames;
    }
}
