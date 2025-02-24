package dev.nau;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    void testCreateComputer() {
        Computer computer = new Computer(1L, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        assertNotNull(computer);
        assertEquals("Dell", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Intel i7", computer.getProcessor());
        assertEquals("Windows 11", computer.getOperatingSystem());
        assertEquals(1200.0, computer.getPrice());
    }
}
