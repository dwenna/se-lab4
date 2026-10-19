package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void getTorpedoCount_Success() {
        TorpedoStore store = new TorpedoStore(1);
        int torpedoCount = store.getTorpedoCount();
        assertEquals(1, torpedoCount);
    }

    @Test
    void fire_less_than_1() {
        TorpedoStore store = new TorpedoStore(1);
        assertThrows(IllegalArgumentException.class, () -> store.fire(0));
    }

}
