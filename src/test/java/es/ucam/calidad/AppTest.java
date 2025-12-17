package es.ucam.calidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSuma() {
        assertEquals(10, App.suma(2, 3));
    }
}
