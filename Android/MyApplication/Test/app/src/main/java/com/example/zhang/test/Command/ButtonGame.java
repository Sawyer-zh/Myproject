package com.example.zhang.test.Command;

/**
 * Created by zhang on 1/11/2017.
 * 请求者  设置不同的Command
 */
public class ButtonGame {

    private Command leftCommand,rightCommand,fallToBottonCommand,transformCommand;

    public void setLeftCommand(Command leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(Command rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallToBottonCommand(Command fallToBottonCommand) {
        this.fallToBottonCommand = fallToBottonCommand;
    }

    public void setTransformCommand(Command transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void left(){
        leftCommand.execute();
    }

    public void right(){
        rightCommand.execute();
    }

    public void fall(){
        fallToBottonCommand.execute();
    }

    public void transform(){
        transformCommand.execute();
    }
}
