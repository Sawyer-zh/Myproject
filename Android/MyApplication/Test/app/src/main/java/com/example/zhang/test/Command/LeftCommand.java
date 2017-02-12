package com.example.zhang.test.Command;

/**
 * Created by zhang on 1/11/2017.
 */
public class LeftCommand implements Command {

    TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
