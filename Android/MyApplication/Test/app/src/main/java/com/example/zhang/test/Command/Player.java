package com.example.zhang.test.Command;


/**
 * Created by zhang on 1/11/2017.
 * 客户
 */
public class Player {


    public static void main(String[] args) {
        TetrisMachine machine = new TetrisMachine();

        Command lC = new LeftCommand(machine);
        Command rC = new RightCommand(machine);
        Command fC = new FallToBottomCommand(machine);
        Command tC = new TansformCommand(machine);

        ButtonGame buttonGame = new ButtonGame();

        buttonGame.setLeftCommand(lC);
        buttonGame.setRightCommand(rC);
        buttonGame.setFallToBottonCommand(fC);
        buttonGame.setTransformCommand(tC);

        buttonGame.left();
        buttonGame.right();
        buttonGame.transform();
        buttonGame.fall();
    }



}
