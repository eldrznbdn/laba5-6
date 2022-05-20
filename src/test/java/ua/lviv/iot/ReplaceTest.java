package ua.lviv.iot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {
    Replace r ;

    @BeforeEach
    void setUp() {
        r = new Replace();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void replacePhoneNumber(){
        String text = "This is 2221575 second java 45 project.It is 444-15-75 to learn 9991575 and arrays.The 3331575 is cold like it 11-11-57-5 be in winter, but we are all 6661575 forward to spring.";
        StringBuilder actual = r.replacePhoneNumber(text);
        String expected = "This is 5751222 second java 45 project.It is 57-51-444 to learn 5751999 and arrays.The 5751333 is cold like it 5-75-11-11 be in winter, but we are all 5751666 forward to spring.";
        assertEquals(expected,actual.toString());
    }
}