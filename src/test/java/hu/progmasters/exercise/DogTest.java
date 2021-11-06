package hu.progmasters.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testGuardHerd() {
        Dog fifi = new Dog("Fifi", 40);
        Herd herd1 = new Herd(10);
        fifi.guardHerd(herd1);
        assertTrue(herd1.isGuarded());
        assertEquals(herd1, fifi.getGuardedHerd());
        Herd herd2 = new Herd(20);
        fifi.guardHerd(herd2);
        assertFalse(herd1.isGuarded());
        assertTrue(herd2.isGuarded());
        assertEquals(herd2, fifi.getGuardedHerd());
    }

    @Test
    void testGuardHerd_exhausted() {
        Dog fifi = new Dog("Fifi", 0);
        Herd herd = new Herd(10);
        fifi.guardHerd(herd);
        assertFalse(herd.isGuarded());
    }

    @Test
    void testCountSheeps() {
        Dog fifi = new Dog("Fifi", 30);
        Herd herd = new Herd(10);
        fifi.guardHerd(herd);
        fifi.countSheeps();
        assertEquals(20, fifi.getEnergy());
        assertTrue(herd.isGuarded());
    }

    @Test
    void testCountSheeps_exhausted() {
        Dog fifi = new Dog("Fifi", 30);
        Herd herd = new Herd(30);
        fifi.guardHerd(herd);
        fifi.countSheeps();
        assertEquals(0, fifi.getEnergy());
        assertFalse(herd.isGuarded());
    }

    @Test
    void testCountSheeps_moreThanExhausted() {
        Dog fifi = new Dog("Fifi", 30);
        Herd herd = new Herd(50);
        fifi.guardHerd(herd);
        fifi.countSheeps();
        assertEquals(0, fifi.getEnergy());
        assertFalse(herd.isGuarded());
    }

}