package by.homework.lessons.task9;

/*
1.Создать классы: Животное, Собака, Птица. Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).Определить методы в классе животное: (издание звуков, животное играет)В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт). Использовать наследование, где суперкласс-Животное. Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
1.1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц. (вызвать соответствующие методы в классах собака и птица)
1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет массив из животных (private Animal[]animals).
1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая: public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное. Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы. (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.) 1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет). У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)
1.8 * Добавить класс Лев. Лев наследуется от животного. Переопределите в нем методы, которые есть в классе Животное (издание звуков, животное играет), с указанием, что это все делает лев (пример Лев играет). Создайте пару львов и выведите их поведение в консоль. Добавить трех львов в зоопарк. У вас должно быть девять животных в зоопарке. Ещё раз пройдитесь по всем животным и вызовите методы (издание звуков, животное играет).. У вас должны вывестись соответствующие реализации для 3 собак, для трёх птиц и 3 львов (Выполнять это в методе Main)
1.9* Добавить поле в класс животное называемое номер (id). Присвоить уникальный номер каждому животному в зоопарке, увеличивая значение на единицу. Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.  Реализовать метод по удалению животного из зоопарка по номеру (id). Вывести информацию о все у животных в зоопарке.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                //Вызов методов птиц
                birdCreationAndActions();
                break;
            case 2:
                //Вызов методов собак
                dogCreationAndActions();
                break;
            case 3:
                //Добавление в зоопарк, вызов методов циклом, львы
                getTheInfoAboutAnimals();
                break;
        }
    }

    private static void birdCreationAndActions() {
        Bird birdObject = new Bird(
                "worms",
                10,
                "green",
                1,
                "sparrow",
                15.5
        );

        birdObject.play();
        birdObject.makeSound();
        birdObject.hatch();
        birdObject.play();
        birdObject.peck();
        birdObject.sing();
    }

    private static void dogCreationAndActions() {
        Dog dogObject = new Dog(
                "meat",
                15,
                "black",
                1,
                "Gordon",
                "Scottish terier",
                6.5
        );

        dogObject.play();
        dogObject.makeSound();
        dogObject.play();
        dogObject.bite();
        dogObject.jump();
        dogObject.run();
        dogObject.bark();
    }

    private static void zooAndAddAnimals() {
        Zoo zoo = new Zoo();

        Bird birdObject1 = new Bird(
                "worms",
                10,
                "green",
                1,
                "sparrow",
                15.5
        );

        Bird birdObject2 = new Bird(
                "worms",
                10,
                "blue",
                2,
                "peacock",
                15.5
        );

        Bird birdObject3 = new Bird(
                "worms",
                10,
                "red",
                3,
                "yellow",
                15.5
        );

        zoo.addAnimalToZoo(birdObject1);
        zoo.addAnimalToZoo(birdObject2);
        zoo.addAnimalToZoo(birdObject3);

        Dog dogObject1 = new Dog(
                "meat",
                15,
                "black",
                4,
                "Gordon",
                "Scottish terier",
                6.5
        );

        Dog dogObject2 = new Dog(
                "meat",
                15,
                "White",
                5,
                "Rex",
                "Golden retriever",
                9.5
        );

        Dog dogObject3 = new Dog(
                "meat",
                15,
                "white",
                6,
                "Manya",
                "Spitz",
                3.5
        );

        zoo.addAnimalToZoo(dogObject1);
        zoo.addAnimalToZoo(dogObject2);
        zoo.addAnimalToZoo(dogObject3);
    }

    private static void getTheInfoAboutAnimals() {
        Zoo zoo = new Zoo();

        Bird birdObject1 = new Bird(
                "worms",
                10,
                "green",
                1,
                "sparrow",
                15.5
        );

        Bird birdObject2 = new Bird(
                "worms",
                10,
                "blue",
                2,
                "peacock",
                15.5
        );

        Bird birdObject3 = new Bird(
                "worms",
                10,
                "red",
                3,
                "yellow",
                15.5
        );

        zoo.addAnimalToZoo(birdObject1);
        zoo.addAnimalToZoo(birdObject2);
        zoo.addAnimalToZoo(birdObject3);

        Dog dogObject1 = new Dog(
                "meat",
                15,
                "black",
                4,
                "Gordon",
                "Scottish terier",
                6.5
        );

        Dog dogObject2 = new Dog(
                "meat",
                15,
                "White",
                5,
                "Rex",
                "Golden retriever",
                9.5
        );

        Dog dogObject3 = new Dog(
                "meat",
                15,
                "white",
                6,
                "Manya",
                "Spitz",
                3.5
        );

        zoo.addAnimalToZoo(dogObject1);
        zoo.addAnimalToZoo(dogObject2);
        zoo.addAnimalToZoo(dogObject3);

        Lion lionObject1 = new Lion("people",30,"yellow",7);
        Lion lionObject2 = new Lion("people",30,"yellow",8);
        Lion lionObject3 = new Lion("people",30,"yellow",9);

        zoo.addAnimalToZoo(lionObject1);
        zoo.addAnimalToZoo(lionObject2);
        zoo.addAnimalToZoo(lionObject3);

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal.toString());
        }

        for (Animal animal : zoo.getAnimals()) {
            animal.play();
            animal.makeSound();
        }

        zoo.deleteAnimalById(1);
    }
}
