package com.toyRobot.command;

import com.toyRobot.status.Status;
import com.toyRobot.status.Face;

public class Place extends Command {
    private Status status;

    public Place(int x, int y, Face face) {
        this.status = new Status(x, y, face);
    }

    @Override
    public Status execute(Status status) {
        return this.status;
    }
}
