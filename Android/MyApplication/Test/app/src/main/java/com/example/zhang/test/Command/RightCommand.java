package com.example.zhang.test.Command;

/**
 * Created by zhang on 1/11/2017.
 */
public class RightCommand implements Command {

    TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
