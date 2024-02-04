package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @Test
    void changeCount() {
        CartService service = new CartService();

        assertThrows(UnsupportedOperationException.class, () -> service.changeCount(1, 1));
    }
}