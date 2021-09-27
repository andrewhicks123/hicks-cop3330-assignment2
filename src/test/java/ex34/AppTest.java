package ex34;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void removeFromArray() {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> newn = new ArrayList<String>();
        names.add("Hello");
        names.add("Andrew");
        newn.add("Hello");
        App.removeFromArray(names,"Andrew");
        assertTrue(newn.equals(names));
    }
}