package hu.progmasters.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShepherdTest {

    @Test
    void testShepherdConstruct() {
        Shepherd john = new Shepherd("John");
        assertEquals(0, john.getHerd().getSheepCount());
        assertFalse(john.hasDog());
    }

    @Test
    void testAdoptDog() {
        Herd herd = new Herd(23);
        Shepherd john = new Shepherd("John", herd);
        Dog cesar = new Dog("Cesar", 100);
        john.adoptDog(cesar);
        assertTrue(john.hasDog());
        assertEquals(john, cesar.getOwner());
        assertEquals(herd, cesar.getGuardedHerd());
        assertTrue(herd.isGuarded());
    }

    @Test
    void testAdoptDog_secondOwner() {
        Shepherd mike = new Shepherd("Mike", new Herd(10));
        Shepherd john = new Shepherd("John", new Herd(20));

        Dog cesar = new Dog("Cesar", 100);
        mike.adoptDog(cesar);
        john.adoptDog(cesar);
        assertFalse(mike.hasDog());
        assertTrue(john.hasDog());
        assertEquals(john, cesar.getOwner());

        assertFalse(mike.getHerd().isGuarded());
        assertTrue(john.getHerd().isGuarded());
    }

    @Test
    void testCook_2() {
        Herd herd = new Herd(5);
        Shepherd john = new Shepherd("John", herd);

        john.cook();
        john.cook();
        assertEquals(5, herd.getSheepCount());
    }

    @Test
    void testCook_3() {
        Herd herd = new Herd(5);
        Shepherd john = new Shepherd("John", herd);

        john.cook();
        john.cook();
        john.cook();
        assertEquals(4, herd.getSheepCount());
    }

    @Test
    void testCook_10() {
        Herd herd = new Herd(5);
        Shepherd john = new Shepherd("John", herd);

        for (int i = 0; i < 10; i++) {
            john.cook();
        }
        assertEquals(2, herd.getSheepCount());
    }

    @Test
    void testCook_noSheep() {
        Herd herd = new Herd(0);
        Shepherd john = new Shepherd("John", herd);

        for (int i = 0; i < 10; i++) {
            john.cook();
        }
        assertEquals(0, herd.getSheepCount());
    }
}