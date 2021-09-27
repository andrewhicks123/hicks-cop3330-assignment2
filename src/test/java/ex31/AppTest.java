package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void getTarget() {
        int rate = 65;
        int age = 22;
        assertEquals(138, App.getTarget(rate,age,55));
    }
}