package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void passwordValidator() {
        String veryweak = "12345";
        String weak = "abcdef";
        String strong = "abc123xyz";
        String verystrong = "1337h@xor!";
        assertEquals(1,App.passwordValidator(veryweak));
        assertEquals(2,App.passwordValidator(weak));
        assertEquals(3,App.passwordValidator(strong));
        assertEquals(4,App.passwordValidator(verystrong));

    }
}