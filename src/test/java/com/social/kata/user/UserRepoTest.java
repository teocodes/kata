package com.social.kata.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserRepoTest {

    @Test
    void add() {
        UserRepo ur = mock(UserRepo.class);
        User u = mock(User.class);

        assertDoesNotThrow(() -> ur.add(u));
    }

    @Test
    void addFollower() {
        UserRepo ur = mock(UserRepo.class);
        User u = mock(User.class);

        assertDoesNotThrow(() -> ur.addFollower(u, "nome"));
    }

    @Test
    void get_ok() {
        UserRepo ur = mock(UserRepo.class);
        User u = mock(User.class);

        when(ur.get("nome")).thenReturn(u);

        assertEquals(ur.get("nome"), u);
    }

    @Test
    void get_nok() {
        UserRepo ur = mock(UserRepo.class);
        User u = mock(User.class);

        when(ur.get("nome")).thenReturn(null);

        assertNotEquals(ur.get("nome"), u);
    }
}