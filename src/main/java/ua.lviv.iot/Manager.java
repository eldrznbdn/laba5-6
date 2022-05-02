package ua.lviv.iot;
import java.util.List;
import java.util.Objects;

import ua.lviv.iot.seaAnimals.seaAnimals;
public class Manager {
    private List<seaAnimals> seaAnimals;
    public void addSeaAnimal(seaAnimals seaAnimal){
        seaAnimals.add(seaAnimal);
    }

    public boolean checkSeaAnimals(seaAnimals seaAnimal){
        if(seaAnimals.contains(seaAnimal)){
            return seaAnimals.remove(seaAnimal);
        }else{
            return false;
        }
    }

    public Manager(List<seaAnimals> seaAnimals) {
        this.seaAnimals = seaAnimals;
    }

    public List<seaAnimals> getSeaAnimals() {
        return seaAnimals;
    }

    public void setSeaAnimals(List<seaAnimals> seaAnimals) {
        this.seaAnimals = seaAnimals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Manager manager = (Manager) o;
        return seaAnimals != null ? seaAnimals.equals(manager.seaAnimals) : manager.seaAnimals == null;
    }

    @Override
    public int hashCode() {
        return seaAnimals != null ? seaAnimals.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "seaAnimals=" + seaAnimals +
                '}';
    }
}
