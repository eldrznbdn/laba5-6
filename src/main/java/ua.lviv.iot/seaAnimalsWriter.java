package ua.lviv.iot;

import ua.lviv.iot.seaAnimals.seaAnimals;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class seaAnimalsWriter {

    public void writeToFile(List<seaAnimals> seaAnimals) {
        try(FileWriter fileWriter = new FileWriter("src/main/java/ua.lviv.iot/seaAnimal")){
            fileWriter.write(seaAnimals.get(0).getHeaders() + "\n");
            seaAnimals.forEach(seaAnimal -> {
                try {
                    fileWriter.write(seaAnimal.toCSV() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void readFromFile() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/ua.lviv.iot/seaAnimal"));
        List<String> actual = bufferedReader.lines().toList();
        System.out.println(actual);
    }
}
