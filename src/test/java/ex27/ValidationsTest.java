package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationsTest {

    @Test
    public void validateInput() {
        assertEquals(true,Validations.validateInput("Andrew","Hicks","32765","AH-1099"));
        assertEquals(false,Validations.validateInput("A","A","A","A"));
    }

    @Test
    public void validateFirstName() {
        assertEquals(false,Validations.validateFirstName("a"));
        assertEquals(true,Validations.validateFirstName("Andrew"));
    }

    @Test
    public void validateLastName() {
        assertEquals(false,Validations.validateLastName("a"));
        assertEquals(true,Validations.validateLastName("Andrew"));
    }

    @Test
    public void validateZip() {
        assertEquals(false,Validations.validateZip("123"));
        assertEquals(true,Validations.validateZip("12345"));
    }

    @Test
    public void validateEmpId() {
        assertEquals(false,Validations.validateEmpId("ABDB-1313113"));
        assertEquals(true,Validations.validateEmpId("AB-1099"));
    }

    @Test
    public void validateFnameIn() {
        assertEquals(false,Validations.validateFnameIn(""));
        assertEquals(true,Validations.validateFnameIn("Andrew"));
    }

    @Test
    public void validateLnameIn() {
        assertEquals(false,Validations.validateLnameIn(""));
        assertEquals(true,Validations.validateLnameIn("Andrew"));
    }

    @Test
    public void isNumeric() {
        assertEquals(true,Validations.isNumeric("1"));
        assertEquals(false,Validations.isNumeric("abcded"));
    }
}