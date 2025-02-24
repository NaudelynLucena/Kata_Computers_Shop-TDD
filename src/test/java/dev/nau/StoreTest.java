package dev.nau;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StoreTest {

@Test
    void testAddComputer() {
        Computer computer = new Computer(1L, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        assertTrue(store.addComputer(computer));
        assertEquals(1, store.listComputers().size());
    }
}
