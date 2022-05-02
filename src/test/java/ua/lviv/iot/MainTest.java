package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws FileNotFoundException {
        Main main = new Main();
        main.doMain();
    }
}