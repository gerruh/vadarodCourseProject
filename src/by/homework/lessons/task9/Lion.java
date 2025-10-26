package by.homework.lessons.task9;

public class Lion extends Animal {

    private int id;

    @Override
    public void play() {
        System.out.println("Lion play");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion makes sound");
    }

    public Lion(String preferableFood, int lifetime, String color, int id) {
        super(preferableFood, lifetime, color,id);
    }
}
