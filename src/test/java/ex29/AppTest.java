package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void calculate() {
        int r = 4;
        assertEquals(18, App.calculate(r));
    }
}