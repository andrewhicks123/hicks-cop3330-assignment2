package ex33;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void getRandomTest() {
        int range = 3;
        int num = ex33.App.getRandom(range);
        assertTrue(num >= 0 && num <= 3);
    }
}