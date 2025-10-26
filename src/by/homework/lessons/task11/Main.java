package by.homework.lessons.task11;

/*
1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
1.1 Создать классы роботов.
РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.
В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)
1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
1.5 Добавить интерфейс, который будет называться РоботИнженер. Он должен расширить интерфейс Робот. От этого интерфейса должны наследоваться РоботСапёр и РоботСтроитель. В этом интерфейсе определите абстрактный метод createItem (Робот строитель создаёт бетон, РоботСапёр создаёт приспособление для разминирования).
1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.
 */

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        System.out.println("=== СОЗДАНИЕ РОБОТОВ ===");

        RobotCook robotCook = new RobotCook("MasterChef 3000", 1500, "Япония", "мультиварка");
        RobotSapper robotSapper = new RobotSapper("BombHunter", 2000, "роботизированная рука", "титан");
        RobotBuilder robotBuilder = new RobotBuilder("BuildMaster", 2500, "Германия", "3D-принтер", "цемент и песок");

        System.out.println("Робот-повар:");
        robotCook.repairRobot();

        System.out.println("\nРобот-сапёр:");
        robotSapper.repairRobot();

        System.out.println("\nРобот-строитель:");
        robotBuilder.repairRobot();

        robotCook.turnOn();
        robotSapper.turnOn();
        robotBuilder.turnOn();

        robotCook.uniquePossibility();
        robotSapper.uniquePossibility();
        robotBuilder.uniquePossibility();

        Robot[] allRobotsExhibition = {robotCook, robotSapper, robotBuilder};

        for (Robot robot : allRobotsExhibition) {
            robot.uniquePossibility();
        }

        RobotEngineer[] engineerRobotsExhibition = {robotSapper, robotBuilder};

        System.out.println("Уникальные способности инженерных роботов:");
        for (RobotEngineer engineer : engineerRobotsExhibition) {
            engineer.uniquePossibility();
        }

        for (RobotEngineer engineer : engineerRobotsExhibition) {
            engineer.createItem();
        }

        RobotSapper[] sapperRobotsExhibition = {robotSapper};

        for (RobotSapper sapper : sapperRobotsExhibition) {
            sapper.uniquePossibility();
        }

        robotCook.turnOff();
        robotSapper.turnOff();
        robotBuilder.turnOff();
    }
}