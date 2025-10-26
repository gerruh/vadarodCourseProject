package by.homework.lessons.task9;

public class Zoo {
     private Animal[] animals = new Animal[0];

    public void addAnimalToZoo(Animal animalToAdd) {

        // создаём новый массив на 1 элемент больше
        Animal[] newArray = new Animal[animals.length + 1];

        // копируем старые значения
        for (int i = 0; i < animals.length; i++) {
            newArray[i] = animals[i];
        }

        // добавляем новый элемент в конец
        newArray[animals.length] = animalToAdd;

        animals = newArray;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void deleteAnimalById(int id) {
        for (int i = 0; i < animals.length; i++) {
            int currentId = animals[i].getId();

            if (currentId == id) {
                animals[i] = null;

//                Animal[] newArray = new Animal[animals.length - 1];
//                System.arraycopy(animals, 0, newArray, 0, i);
//                System.arraycopy(animals, i + 1, newArray, i, animals.length - i - 1);
//                animals = newArray;

                Animal[] newAnimals = new Animal[animals.length - 1];

                for (int j = 0; j < i; j++) {
                    newAnimals[j] = animals[j];
                }

                for (int j = i + 1; j < animals.length; j++) {
                    newAnimals[j - 1] = animals[j];
                }

                animals = newAnimals;

                for (Animal animal : animals) {
                    System.out.println(animal.toString());
                }

                return;
            }
            System.out.println("Животное с указанным id не надйено");
        }
    }
}
