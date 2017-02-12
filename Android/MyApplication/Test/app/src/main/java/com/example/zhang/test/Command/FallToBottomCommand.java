package com.example.zhang.test.Command;

/**
 * Created by zhang on 1/11/2017.
 */
public class FallToBottomCommand implements Command {

    TetrisMachine machine;

    public FallToBottomCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
