package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PostingCommandTest {

    @Mock
    private UserRepo userRepo;

    @Test
    void post_ok() {
        String[] arrstr = {"nome", "->","messaggio"};
        PostingCommand pc = new PostingCommand(arrstr);

        assertDoesNotThrow(() ->  pc.execCommand(userRepo));
    }

    @Test
    void post_nok() {

        PostingCommand pc = new PostingCommand(null);

        assertThrows(NullPointerException.class,() ->  pc.execCommand(userRepo));
    }



}