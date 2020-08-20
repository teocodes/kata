package com.social.kata.command;

import com.social.kata.user.UserRepo;

public interface Command {
    public void execCommand(UserRepo userRepo);
}
