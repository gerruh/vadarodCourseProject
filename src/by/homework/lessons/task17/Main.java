package by.homework.lessons.task17;

import java.io.*;

public class Main {

    static String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, " +
            "as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish " +
            "riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, " +
            "with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting " +
            "himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown " +
            "up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay " +
            "a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. " +
            "Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers " +
            "for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own " +
            "for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, " +
            "talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty " +
            "to whom Denísov had introduced him.";

    public static void main(String[] args) {

        writeRelative();
        writeAbsolute();

        readRelative();
        readAbsolute();

        serializeCar();
        deserializeCar();
    }

    public static void writeRelative() {
        try (FileWriter writer = new FileWriter("text_relative.txt")) {
            writer.write(text);
            System.out.println("Записано по относительному пути");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAbsolute() {
        String absPath = "/Users/gerruh/Desktop/text_absolute.txt";

        try (FileWriter writer = new FileWriter(absPath)) {
            writer.write(text);
            System.out.println("Записано по абсолютному пути");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readRelative() {
        try (BufferedReader reader = new BufferedReader(new FileReader("text_relative.txt"))) {
            String line;
            System.out.println("\n--- Чтение относительного файла ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAbsolute() {
        String absPath = "/Users/gerruh/Desktop/text_absolute.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(absPath))) {
            String line;
            System.out.println("\n--- Чтение абсолютного файла ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeCar() {
        Car car = new Car("BMW", 250, "Germany");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            out.writeObject(car);
            System.out.println("\nАвтомобиль сериализован");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeCar() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car car = (Car) in.readObject();
            System.out.println("\nДесериализованный автомобиль:");
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
