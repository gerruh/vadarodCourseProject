package by.homework.lessons.task19;

/*
2. Создать класс Город. Поля id, имя города, население, континент (Enum)
1.1. Создать города
1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
1.4. Найти самый густонаселённый город (max)
1.5. Найти город с самым маленьким населением. (min)
1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
1.7. Отобрать города с населением больше 1 млн. (filter)
1.8. Создать коллекцию из названий городов, на основании объектов (map)
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        Continents PREFERABLE_CONTINENT = Continents.SouthAmerica;
        City newYork = new City(1, "New York", 8480000, Continents.NorthAmerica);
        City minsk = new City(2, "Minsk", 1996730, Continents.Eurasia);
        City sydney = new City(3, "Sydney", 5500000, Continents.Australia);
        City capeTown = new City(4, "Cape Town", 5000000, Continents.Africa);
        City rioDeJaneiro = new City(5,"Rio De Janeiro", 6700000, Continents.SouthAmerica);
        City comandanteFerrazAntarcticStation = new City(6,"Comandante Ferraz Antarctic Station", 100, Continents.Antarctica);
        City saoPaolo = new City(7,"Sao Paolo", 11900000, Continents.SouthAmerica);

        List<City> cities = List.of(
                newYork,
                minsk,
                sydney,
                capeTown,
                rioDeJaneiro,
                comandanteFerrazAntarcticStation,
                saoPaolo
        );

        findMaxPopulationCityOnContinent(cities,PREFERABLE_CONTINENT);
        findMinPopulationCityOnContinent(cities,PREFERABLE_CONTINENT);
        findMaxPopulationCity(cities);
        findMinPopulationCity(cities);
        findFirstMillionCity(cities);
        findMillionCities(cities);
        getCityNames(cities).stream()
                .forEach(cityName -> System.out.println(cityName));

    }

    public static void findMaxPopulationCityOnContinent(List<City> cities, Continents continent) {
        City largestCityInSouthAmerica = cities.stream()
                .filter(city -> city.getContinent().equals(continent))
                .max(Comparator.comparing(City::getPopulation))
                .orElseThrow();

        System.out.println("Largest city on continent + " + continent + " : " + largestCityInSouthAmerica.getName());
    }

    public static void findMinPopulationCityOnContinent(List<City> cities, Continents continent) {
        City smallestCityInSouthAmerica = cities.stream()
                .filter(city -> city.getContinent().equals(continent))
                .min(Comparator.comparing(City::getPopulation))
                .orElseThrow();

        System.out.println("Smallest city on continent + " + continent + " : " + smallestCityInSouthAmerica.getName());
    }

    public static void findMaxPopulationCity(List<City> cities) {
        City largestCityInSouthAmerica = cities.stream()
                .max(Comparator.comparing(City::getPopulation))
                .orElseThrow();

        System.out.println("Max population city: " + largestCityInSouthAmerica.getName());
    }

    public static void findMinPopulationCity(List<City> cities) {
        City largestCityInSouthAmerica = cities.stream()
                .min(Comparator.comparing(City::getPopulation))
                .orElseThrow();

        System.out.println("Min population city: " + largestCityInSouthAmerica.getName());
    }

    public static void findFirstMillionCity(List<City> cities) {
        City largestCityInSouthAmerica = cities.stream()
                .filter(city -> city.getPopulation() > 100000)
                .findFirst()
                .orElseThrow();

        System.out.println("First million city: " + largestCityInSouthAmerica.getName());
    }

    public static void findMillionCities(List<City> cities) {
         cities.stream()
                .filter(city -> city.getPopulation() > 100000)
                .forEach(city -> System.out.println("Million+ city: " + city.getName()));
    }

    public static List<String> getCityNames(List<City> cities) {
        List<String> cityNames = cities.stream()
                .map(City::getName)
                .collect(Collectors.toUnmodifiableList());
        return cityNames;
    };
}