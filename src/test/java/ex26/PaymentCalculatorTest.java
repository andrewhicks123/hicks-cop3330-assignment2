package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    public void calculateMonthsUntilPaidOff() {
        double balance = 5000;
        double apr = 12;
        double payment = 100;
        assertEquals(70,PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment));
    }
}