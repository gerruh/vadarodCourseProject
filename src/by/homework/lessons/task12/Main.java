package by.homework.lessons.task12;

/*
Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.
1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
 */

// Главный класс программы
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", 120, 4);
        Car car2 = new Car("Tesla Model 3", 0, 4);
        Car car3 = new Car("Ford Focus", 95, 5);

        Motorcycle motorcycle1 = new Motorcycle("Harley Davidson", 80, false);
        Motorcycle motorcycle2 = new Motorcycle("Yamaha R1", 110, false);
        Motorcycle motorcycle3 = new Motorcycle("Ural", 90, true);


        Garage<Car> garage1 = new Garage<>(car1);

        Garage<Motorcycle> garage2 = new Garage<>(motorcycle1);

        Garage<Car> garage3 = new Garage<>(car2);
        Garage<Car> garage4 = new Garage<>(car3);
        Garage<Motorcycle> garage5 = new Garage<>(motorcycle2);
        Garage<Motorcycle> garage6 = new Garage<>(motorcycle3);


        System.out.println("Гараж 1 (Автомобиль):");
        garage1.displayInfo();

        System.out.println("Гараж 2 (Мотоцикл):");
        garage2.displayInfo();

        System.out.println("Гараж 3 (Электромобиль):");
        garage3.displayInfo();

        System.out.println("Гараж 4 (Экологичный автомобиль):");
        garage4.displayInfo();

        System.out.println("Гараж 5 (Мотоцикл с высокими выбросами):");
        garage5.displayInfo();

        System.out.println("Гараж 6 (Мотоцикл с коляской):");
        garage6.displayInfo();
    }
}
