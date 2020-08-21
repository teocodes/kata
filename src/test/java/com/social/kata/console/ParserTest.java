package com.social.kata.console;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ParserTest {

    @Test
    void getCommandType_ok() throws IOException {

        Console cs = mock(Console.class);
        when(cs.getConsoleLine()).thenReturn("nome -> messaggio");

        Parser p = new Parser();
        assertDoesNotThrow(() ->  p.getCommandType(cs));
    }

    @Test
    void getCommandType_nok() throws IOException {

        Parser p = new Parser();
        assertThrows(NullPointerException.class,() ->  p.getCommandType(null));
    }
}