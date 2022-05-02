package ua.lviv.iot;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.seaAnimals.seaAnimals;
public class Realization {
    private Manager realization;

    private Comparator<seaAnimals> sizeOfAquariumComparator = (o1, o2) -> {
        if (o1.getSizeOfAquarium() > o2.getSizeOfAquarium()) {
            return 1;
        } else if (o1.getSizeOfAquarium() < o2.getSizeOfAquarium()) {
            return -1;
        }
        return 0;
    };
    //new
    public Realization(Manager realization) {
        if(realization == null) { throw new IllegalArgumentException(); }
        this.realization = realization;
    }

    public Manager getManager() {
        return realization;
    }

    public void setManager(Manager realization) {
        //new
        if(realization == null) { throw new IllegalArgumentException(); }
        //
        this.realization = realization;
    }

   /* public Realization(Manager realization) {
        this.realization = realization;
    }*/

    public List<seaAnimals> getSortedBySizeOfAquariumUp() {
        return realization.getSeaAnimals().stream().sorted(sizeOfAquariumComparator).toList();
    }

    public List<seaAnimals> getSortedBySizeOfAquariumDown() {
        return realization.getSeaAnimals().stream().sorted(sizeOfAquariumComparator.reversed()).toList();
    }

    public List<seaAnimals> sortByYearOfLife(){
        return realization.getSeaAnimals().stream().filter(p->p.getYearOfLife()>8).toList();
    }

}



