package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MathCalculationsTest {

    @Test
    void add() {
        assertEquals(2,MathCalculations.add(1,1));
    }

    @Test
    void subtract() {
        assertEquals(0,MathCalculations.subtract(1,1));
    }

    @Test
    void multiply() {
        assertEquals(2,MathCalculations.multiply(1,2));
    }

    @Test
    void divide() {
        assertEquals(2,MathCalculations.divide(4,2));
    }

    @Test
    void average() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(10);
        assertEquals(5,MathCalculations.average(nums));
    }

    @Test
    void min() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(10);
        assertEquals(0,MathCalculations.min(nums));
    }

    @Test
    void max() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(10);
        assertEquals(10,MathCalculations.max(nums));
    }

    @Test
    void std() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(10);
        assertEquals(5,MathCalculations.std(nums));
    }
    @Test
    void isIntegerTest(){
        assertTrue(MathCalculations.isInteger("1"));
        assertFalse(MathCalculations.isInteger("Hello"));
    }
}