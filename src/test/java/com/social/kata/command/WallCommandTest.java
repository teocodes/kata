package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WallCommandTest {

    private static UserRepo userRepo;

    @BeforeAll
    static void init(){
        userRepo = new UserRepo();
        User u = new User("nome","message");
        userRepo.add(u);
    }

    @Test
    void read_ok() {
        String[] arrstr = {"nome"};

        WallCommand wc = new WallCommand(arrstr);

        assertDoesNotThrow(() -> wc.execCommand(userRepo));
    }

    @Test
    void read_nok() {

        WallCommand wc = new WallCommand(null);

        assertThrows(NullPointerException.class,() ->  wc.execCommand(userRepo));
    }

}