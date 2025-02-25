package fatorialrecursivo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialRecursivoTest {

    @Test
    void testFatorialDeZero() {
        assertEquals(1, FatorialRecursivo.fatorial(0));
    }

    @Test
    void testFatorialDeUm() {
        assertEquals(1, FatorialRecursivo.fatorial(1));
    }

    @Test
    void testFatorialDeNumeroPositivo() {
        assertEquals(120, FatorialRecursivo.fatorial(5));
        assertEquals(720, FatorialRecursivo.fatorial(6));
        assertEquals(5040, FatorialRecursivo.fatorial(7));
    }

    @Test
    void testFatorialDeNumeroNegativo() {
        Exception exception = assertThrows(Exception.class, () -> FatorialRecursivo.fatorial(-5));
        assertNotNull(exception);
    }
}

