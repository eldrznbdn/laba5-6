package ua.lviv.iot.seaAnimals;

public class Fish extends seaAnimals{

    private String name;
    private int yearOfLife;
    private int sizeOfAquarium;

    public Fish(String name,int yearOfLife,int sizeOfAquarium) {
        this.name = name;
        this.yearOfLife=yearOfLife;
        this.sizeOfAquarium=sizeOfAquarium;
    }

    public int getYearOfLife() {
        return yearOfLife;
    }

    public void setYearOfLife(int yearOfLife) {
        this.yearOfLife = yearOfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeOfAquarium() {
        return sizeOfAquarium;
    }

    public void setSizeOfAquarium(int sizeOfAquarium) {
        this.sizeOfAquarium = sizeOfAquarium;
    }

    @Override
    public String toString() {
        return " Fish[" +
                "name='" + name + '\'' +
                ", yearOfLife=" + yearOfLife +
                ", sizeOfAquarium=" + sizeOfAquarium +
                ']';
    }

    public String toCSV() {
        return name +","+ yearOfLife+","+sizeOfAquarium;
    }
}
