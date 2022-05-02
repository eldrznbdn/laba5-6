package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.seaAnimals.seaAnimals;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void addSeaAnimal() {
        Manager manager = new Manager(new ArrayList<>());
        seaAnimals seaAnimals = new seaAnimals("seaAnimal",0,0) {};

        assertEquals(manager.checkSeaAnimals(seaAnimals),false);
        manager.addSeaAnimal(seaAnimals);
        assertEquals(manager.checkSeaAnimals(seaAnimals),true);
    }
}