package ua.lviv.iot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.seaAnimals.Dolphin;
import ua.lviv.iot.seaAnimals.Fish;
import ua.lviv.iot.seaAnimals.Shark;
import ua.lviv.iot.seaAnimals.seaAnimals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealizationTest {

    private Manager manager;

    @BeforeEach
    void fillInManagerData() {
        manager = new Manager(generateListOfSeaAnimals1());
        manager = new Manager(generateListOfSeaAnimals3());
        manager = new Manager(generateListOfSeaAnimals2());

    }

    @AfterEach
    void makeManagerNull() {
        manager = null;
    }

    @Test
    void constructorNullArgumentTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Realization(null);
        });
    }

    @Test
    void managerSetterTest() {
        Realization realization = new Realization(manager);
        Manager emptyManager = new Manager(new ArrayList<>());
        realization.setManager(emptyManager);

        assertEquals(realization.getManager(), emptyManager);
    }

    @Test
    void getSortedBySizeOfAquariumUpTest() {
        Realization realization = new Realization(manager);

        //Comparator<seaAnimals> comparator = Comparator.comparing(seaAnimal -> seaAnimal.getSizeOfAquarium());
        List<seaAnimals> actual = realization.getSortedBySizeOfAquariumUp();
        List<seaAnimals> expected = generateListOfSeaAnimals1();//.stream().sorted(comparator).toList()
        assertEquals(expected.toString(),actual.toString());
    }
    @Test
    void getSortedBySizeOfAquariumDownTest() {
        Realization realization = new Realization(manager);
        //Comparator<seaAnimals> comparator = Comparator.comparing(seaAnimal -> seaAnimal.getSizeOfAquarium());
        List<seaAnimals> actual = realization.getSortedBySizeOfAquariumDown();
        List<seaAnimals> expected = generateListOfSeaAnimals2();//.stream().sorted(comparator.reversed()).toList();
        assertEquals(expected.toString(),actual.toString());
    }

    @Test
    void sortByYearOfLifeTest() {
        /*public List<seaAnimals> sortByYearOfLife(){
        return realization.getSeaAnimals().stream().filter(p->p.getYearOfLife()>8).toList();
    }*/
        Realization realization = new Realization(manager);
        //Comparator<seaAnimals> comparator = Comparator.comparing(seaAnimal -> seaAnimal.getYearOfLife()>8);
        List<seaAnimals> expected = realization.sortByYearOfLife();
        List<seaAnimals> actual = generateListOfSeaAnimals3();//.stream().filter(p->p.getYearOfLife()>8).toList();
        assertEquals(expected.toString(),actual.toString());
    }

    private List<seaAnimals> generateListOfSeaAnimals1(){
        List<seaAnimals> seaAnimals = new ArrayList<>();

        seaAnimals.add(new Fish("tilly",2,4));
        seaAnimals.add(new Fish("dolly",3,5));
        seaAnimals.add(new Fish("willy",9,6));
        seaAnimals.add(new Dolphin("whiteDolphin",4,8));
        seaAnimals.add(new Dolphin("blackDolphin",7,10));
        seaAnimals.add(new Shark("whiteShark",8,11));
        seaAnimals.add(new Dolphin("blueDolphin",9,12));
        seaAnimals.add(new Shark("megaShark",10,15));
        seaAnimals.add(new Shark("bigShark",12,17));


        return seaAnimals;
    }

    private List<seaAnimals> generateListOfSeaAnimals2(){
        List<seaAnimals> seaAnimals = new ArrayList<>();
        seaAnimals.add(new Shark("bigShark",12,17));
        seaAnimals.add(new Shark("megaShark",10,15));
        seaAnimals.add(new Dolphin("blueDolphin",9,12));
        seaAnimals.add(new Shark("whiteShark",8,11));
        seaAnimals.add(new Dolphin("blackDolphin",7,10));
        seaAnimals.add(new Dolphin("whiteDolphin",4,8));
        seaAnimals.add(new Fish("willy",9,6));
        seaAnimals.add(new Fish("dolly",3,5));
        seaAnimals.add(new Fish("tilly",2,4));
        return seaAnimals;
    }
    private List<seaAnimals> generateListOfSeaAnimals3(){
        List<seaAnimals> seaAnimals = new ArrayList<>();
        seaAnimals.add(new Shark("bigShark",12,17));
        seaAnimals.add(new Shark("megaShark",10,15));
        seaAnimals.add(new Dolphin("blueDolphin",9,12));
        seaAnimals.add(new Fish("willy",9,6));


        return seaAnimals;
    }
}