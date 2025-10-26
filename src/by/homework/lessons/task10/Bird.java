package by.homework.lessons.task10;

public class Bird extends Animal {

    private String species;
    private double maxFlyHeight;

    @Override
    public void play() {
        System.out.println(species + " plays");
    }

    @Override
    public void makeSound() {
        System.out.println(species + " makes sound");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // одна и та же ссылка
        if (obj == null || getClass() != obj.getClass()) return false; // другой класс
        if (!super.equals(obj)) return false; // сравниваем поля родителя

        Bird bird = (Bird) obj;
        return Double.compare(bird.maxFlyHeight, maxFlyHeight) == 0 &&
                (species != null ? species.equals(bird.species) : bird.species == null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode(); // hashCode родителя
        result = 31 * result + (species != null ? species.hashCode() : 0);
        long temp = Double.doubleToLongBits(maxFlyHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bird{");
        sb.append("super=").append(super.toString());
        sb.append("species='").append(species).append('\'');
        sb.append(", maxFlyHeight=").append(maxFlyHeight);
        sb.append('}');
        return sb.toString();
    }

    public void sing() {
        System.out.println(species + " singing");
    }

    public void peck() {
        System.out.println(species + " pecking");
    }

    public void hatch() {
        System.out.println(species + " hatching");
    }

    public Bird(
            String preferableFood,
            int lifetime,
            String color,
            int id,
            String species,
            double maxFlyHeight
    )
    {
        super(preferableFood, lifetime, color, id);
        this.species = species;
        this.maxFlyHeight = maxFlyHeight;
    }
}
