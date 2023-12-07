import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    VirtualPet cat = new VirtualPet("Steve");

    @Test
    void testChangeAttention() {
        cat.changeAttention(7);
        assertEquals(8, cat.getAttention());
    }

    @Test
    void testChangeBladder() {
        cat.changeBladder(7);
        assertEquals(8, cat.getBladder());
    }

    @Test
    void testChangeEnergy() {
        cat.changeEnergy(9);
        assertEquals(10, cat.getEnergy());
    }

    @Test
    void testChangeHunger() {
        cat.changeHunger(3);
        assertEquals(4, cat.getHunger());
    }

    @Test
    void testChangeHygiene() {
        cat.changeHygiene(4);
        assertEquals(5, cat.getHygiene());
    }

    @Test
    void testChangeThirst() {
        cat.changeThirst(8);
        assertEquals(9, cat.getThirst());
    }

    @Test
    void testTick() {
        cat.tick();
        assertEquals(0, cat.getHunger());
        assertEquals(0, cat.getThirst());
        assertEquals(0, cat.getAttention());
        assertEquals(0, cat.getBladder());
        assertEquals(0, cat.getEnergy());
        assertEquals(0, cat.getHygiene());
    }

    @Test
    void testSelfPreservation() {
        cat.selfPreservation();
        cat.tick();
        cat.changeHunger(0);
        cat.changeThirst(0);
        assertEquals(0, cat.getHunger());
        assertEquals(2, cat.getThirst());
    }

}
