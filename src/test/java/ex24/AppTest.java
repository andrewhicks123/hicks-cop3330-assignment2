package ex24;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void isAnagram() {
        String one = "note";
        String two = "tone";
        org.junit.Assert.assertEquals(true,App.isAnagram(one,two));
    }
}
