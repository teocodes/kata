package com.social.kata.user;

import com.social.kata.console.Console;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MessageTest {

    @Test
    void getSendDate_ok() {
        Message msg = mock(Message.class);

        Date now = new Date();
        when(msg.getSendDate()).thenReturn(now);

        assertEquals(msg.getSendDate(), now);
    }

    @Test
    void getSendDate_nok() {
        Message msg = mock(Message.class);

        when(msg.getSendDate()).thenReturn(null);

        assertNotEquals(msg.getSendDate(), new Date());
    }

    @Test
    void getMessage_ok() {
        Message msg = mock(Message.class);

        Date now = new Date();
        when(msg.getMessage()).thenReturn("messaggio");

        assertEquals(msg.getMessage(), "messaggio");
    }

    @Test
    void getMessage_nok() {
        Message msg = mock(Message.class);

        when(msg.getMessage()).thenReturn(null);

        assertNotEquals(msg.getMessage(), "messaggio");
    }

    @Test
    void getUsername_ok() {
        Message msg = mock(Message.class);

        when(msg.getUsername()).thenReturn("user");

        assertEquals(msg.getUsername(), "user");
    }

    @Test
    void getUsername_nok() {
        Message msg = mock(Message.class);

        when(msg.getUsername()).thenReturn(null);

        assertNotEquals(msg.getUsername(), "user");
    }
}