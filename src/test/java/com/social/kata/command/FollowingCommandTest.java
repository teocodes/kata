package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FollowingCommandTest {

    private static UserRepo userRepo;

    @BeforeAll
    static void init(){
        userRepo = new UserRepo();
        User u = new User("nome","message");
        userRepo.add(u);
    }

    @Test
    void follow_ok() {
        String[] arrstr = {"nome","follows","altroNome"};

        FollowingCommand fc = new FollowingCommand(arrstr);

        assertDoesNotThrow(() -> fc.execCommand(userRepo));
    }

    @Test
    void follow_nok() {

        FollowingCommand fc = new FollowingCommand(null);

        assertThrows(NullPointerException.class,() ->  fc.execCommand(userRepo));
    }

}