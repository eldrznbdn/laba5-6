package ua.lviv.iot;

import ua.lviv.iot.seaAnimals.Dolphin;
import ua.lviv.iot.seaAnimals.Fish;
import ua.lviv.iot.seaAnimals.Shark;
import ua.lviv.iot.seaAnimals.seaAnimals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
         Main main = new Main();
         main.doMain();
    }


    public void doMain() throws FileNotFoundException {

        Manager manager = new Manager(new ArrayList<>());
        Realization realization = new Realization(manager);

        List<seaAnimals> dolphins = generateListOfDolphin();
        List<seaAnimals> sharks = generateListOfShark();
        List<seaAnimals> fish = generateListOfFish();

        dolphins.forEach(manager::addSeaAnimal);
        sharks.forEach(manager::addSeaAnimal);
        fish.forEach(manager::addSeaAnimal);


        System.out.println("All seaAnimals : ");
        manager.getSeaAnimals().forEach(System.out::println);

        System.out.println("Sorted by sizeOfAquariumUp : ");
        realization.getSortedBySizeOfAquariumUp().forEach(System.out::println);

        System.out.println("Sorted by sizeOfAquarium : ");
        realization.getSortedBySizeOfAquariumDown().forEach(System.out::println);

        System.out.println("lastSort : ");
        realization.sortByYearOfLife().forEach(System.out::println);

        seaAnimalsWriter seaAnimalsWriter = new seaAnimalsWriter();
        seaAnimalsWriter.writeToFile(manager.getSeaAnimals());

        seaAnimalsWriter.readFromFile();
    }
    private List<seaAnimals> generateListOfDolphin() {
        List<seaAnimals> dolphins = new ArrayList<>();
        dolphins.add(new Dolphin("blackDolphin",7,10));
        dolphins.add(new Dolphin("whiteDolphin",4,8));
        dolphins.add(new Dolphin("blueDolphin",9,12));

        return dolphins;
    }

    private List<seaAnimals> generateListOfShark() {
        List<seaAnimals> sharks = new ArrayList<>();
        sharks.add(new Shark("megaShark",10,15));
        sharks.add(new Shark("whiteShark",8,11));
        sharks.add(new Shark("bigShark",12,17));

        return sharks;
    }

    private List<seaAnimals> generateListOfFish() {
        List<seaAnimals> fish = new ArrayList<>();
        fish.add(new Fish("dolly",3,5));
        fish.add(new Fish("willy",9,6));
        fish.add(new Fish("tilly",2,4));

        return fish;
    }
}
