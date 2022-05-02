package ua.lviv.iot;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class seaAnimalsWriterTest {

    Manager manager = new Manager(new ArrayList<>());

   /* @Test
    void writeToFile() {
        //seaAnimalsWriter seaAnimalsWriter = new seaAnimalsWriter();
        //seaAnimalsWriter.writeToFile(manager.getSeaAnimals());
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/ua.lviv.iot/seaAnimal"))) {
            List<String> file = bufferedReader.lines().toList();
            String expected = "[name,yearOfLife,sizeOfAquarium, blackDolphin,7,10, whiteDolphin,4,8, blueDolphin,9,12, megaShark,10,15, whiteShark,8,11, bigShark,12,17, dolly,3,5, willy,9,6, tilly,2,4]";
            assertEquals(expected,file.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }*/

   @Test
   void writeToFile() throws FileNotFoundException {
       //List<String> expected = new ArrayList<>();
       //expected.add("[name,yearOfLife,sizeOfAquarium, blackDolphin,7,10, whiteDolphin,4,8, blueDolphin,9,12, megaShark,10,15, whiteShark,8,11, bigShark,12,17, dolly,3,5, willy,9,6, tilly,2,4]" );
       try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/ua.lviv.iot/seaAnimal"))){
           String expected = "[name,yearOfLife,sizeOfAquarium, blackDolphin,7,10, whiteDolphin,4,8, blueDolphin,9,12, megaShark,10,15, whiteShark,8,11, bigShark,12,17, dolly,3,5, willy,9,6, tilly,2,4]";
           List<String> actual = bufferedReader.lines().toList();
           Assert.assertEquals(expected, actual.toString());
       }catch (IOException e){
           e.printStackTrace();
       }
   }
    /*"[name,yearOfLife,sizeOfAquarium\n" +
                    "blackDolphin,7,10\n" +
                    "whiteDolphin,4,8\n" +
                    "blueDolphin,9,12\n" +
                    "megaShark,10,15\n" +
                    "whiteShark,8,11\n" +
                    "bigShark,12,17\n" +
                    "dolly,3,5\n" +
                    "willy,9,6\n" +
                    "tilly,2,4]");*/

}