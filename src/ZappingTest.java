import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZappingTest {
    @Test
    public void testSalida0(){
        assertEquals(0, Zapping.cambiarCanal(0, 0));
    }

    @Test
    public void testSalida1(){
        assertEquals(1, Zapping.cambiarCanal(1, 2));
    }
}