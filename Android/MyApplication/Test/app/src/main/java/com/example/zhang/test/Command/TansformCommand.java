package com.example.zhang.test.Command;

/**
 * Created by zhang on 1/11/2017.
 */
public class TansformCommand implements Command {

    TetrisMachine machine;

    public TansformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.transform();
    }
}
