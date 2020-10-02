package dk.kea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Star sun = new Star();
    Planet earth = new Planet("Earth", sun);
    Moon moon = new Moon("Moon", earth);

    @Test
    void moonName(){
        String expected = "Moon";

        String actual = moon.getName();

        assertEquals(expected, actual);
    }

    @Test
    void earthName() {
        String expected = "Earth";

        String actual = earth.getName();

        assertEquals(expected, actual);
    }

    @Test
    void earthName2() {
        String wrong = "moon";

        String actual = earth.getName();

        assertNotEquals(actual, wrong);
    }

}