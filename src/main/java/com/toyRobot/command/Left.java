package com.toyRobot.command;

import com.toyRobot.status.Status;

public class Left extends Command {
    @Override
    public Status execute(Status prevStatus) {
        return new Status(prevStatus.position(), prevStatus.face().left());
    }
}
