package com.social.kata.user;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserTest {

    @Test
    void getUsername_ok() {
        User u = mock(User.class);

        when(u.getUsername()).thenReturn("nome");

        assertEquals(u.getUsername(), "nome");
    }

    @Test
    void getUsername_nok() {
        User u = mock(User.class);

        when(u.getUsername()).thenReturn(null);

        assertNotEquals(u.getUsername(), "nome");
    }

    @Test
    void addFollower_ok() {
        User u = mock(User.class);

        assertDoesNotThrow(() -> u.addFollower("nome"));
    }

    @Test
    void getFollowers() {
        User u = mock(User.class);

        assertDoesNotThrow(() -> u.getFollowers());
    }

    @Test
    void addMessage() {
        User u = mock(User.class);

        assertDoesNotThrow(() -> u.addMessage("nome"));
    }

    @Test
    void getMessages() {
        User u = mock(User.class);

        assertDoesNotThrow(() -> u.getMessages());
    }
}