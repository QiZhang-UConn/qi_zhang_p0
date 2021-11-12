package com.revature.Bank_App.Screen;

import com.revature.Bank_App.util.ScreenRouter;

import java.io.BufferedReader;

public class TransactionScreen extends Screen{

    //TransactionScreen Constructor
    public TransactionScreen(String screenName, String routingString, BufferedReader consoleReader, ScreenRouter screenRouter) {
        super(screenName, routingString, consoleReader, screenRouter);
    }

    @Override
    public void render() throws Exception {
        System.out.println("show me where my money goes!");
        //TODO: implement show transaction feature
    }
}