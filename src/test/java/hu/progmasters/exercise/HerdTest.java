package hu.progmasters.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerdTest {

    @Test
    void testHerdConstruct() {
        Herd herd = new Herd(40);
        assertFalse(herd.isGuarded());
        assertFalse(herd.isWellFed());
    }

    @Test
    void testGrow_hungry() {
        Herd herd = new Herd(100);
        herd.setWellFed(false);
        herd.grow();
        assertEquals(110, herd.getSheepCount());
    }

    @Test
    void testGrow_wellFed() {
        Herd herd = new Herd(100);
        herd.setWellFed(true);
        herd.grow();
        assertEquals(120, herd.getSheepCount());
    }

    @Test
    void testBleat_0() {
        Herd herd = new Herd(0);
        assertEquals("", herd.bleat());
    }

    @Test
    void testBleat_1() {
        Herd herd = new Herd(1);
        assertEquals("Baa", herd.bleat());
    }

    @Test
    void testBleat_10() {
        Herd herd = new Herd(10);
        assertEquals("Baa, baa", herd.bleat());
    }

    @Test
    void testBleat_100() {
        Herd herd = new Herd(100);
        assertEquals("Baa, baa, baa", herd.bleat());
    }

    @Test
    void testBleat_1000() {
        Herd herd = new Herd(1000);
        assertEquals("Baa, baa, baa, baa", herd.bleat());
    }
}