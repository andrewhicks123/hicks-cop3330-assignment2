package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRandom() {
        int one = App.getRandom(1000);
        int two = App.getRandom(1000);
        assertFalse(one == two);
    }
}