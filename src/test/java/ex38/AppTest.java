package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        List<Integer> oldArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        oldArray.add(1);
        oldArray.add(2);
        oldArray.add(3);
        oldArray.add(4);
        oldArray.add(5);
        newArray.add(2);
        newArray.add(4);
        assertTrue(newArray.equals(App.filterEvenNumbers(oldArray)));
    }
}