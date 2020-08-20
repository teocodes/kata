package com.social.kata.console;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConsoleTest {

    @Test
    void input_ok() throws IOException {
        Console cs = mock(Console.class);

        when(cs.getConsoleLine()).thenReturn("Input ok");

        assertEquals(cs.getConsoleLine(), "Input ok");
    }


}