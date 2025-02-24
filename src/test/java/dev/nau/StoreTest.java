package dev.nau;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {

    private Store store;

    @BeforeEach
    void setUp() {
        store = new Store(1L, "Tech Store", "Juan Perez", "123456789");
    }

@Test
    void testAddComputer() {
        Computer computer = new Computer(1L, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        assertTrue(store.addComputer(computer));
        assertEquals(1, store.listComputers().size());
    }

}
