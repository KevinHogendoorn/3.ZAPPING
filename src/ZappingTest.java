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

    @Test
    public void testSalida20(){
        assertEquals(20, Zapping.cambiarCanal(10, 30));
    }

    @Test
    public void testSalida2(){
        assertEquals(2, Zapping.cambiarCanal(2, 99));
    }

    @Test
    public void testSalida41(){
        assertEquals(41, Zapping.cambiarCanal(5, 63));
    }
}