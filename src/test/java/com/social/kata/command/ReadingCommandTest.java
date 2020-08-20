package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ReadingCommandTest {

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

        ReadingCommand rc = new ReadingCommand(arrstr);

        assertDoesNotThrow(() -> rc.execCommand(userRepo));
    }

    @Test
    void read_nok() {

        ReadingCommand rc = new ReadingCommand(null);

        assertThrows(NullPointerException.class,() ->  rc.execCommand(userRepo));
    }

}