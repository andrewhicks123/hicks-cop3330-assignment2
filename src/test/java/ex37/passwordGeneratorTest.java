package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordGeneratorTest {

    @Test
    void generatePassword() {
        String testone = passwordGenerator.generatePassword(10,2,2);
        String testtwo = passwordGenerator.generatePassword(10,2,2);
        assertFalse(testone.equals(testtwo));
    }
}