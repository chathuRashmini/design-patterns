package com.company;

public class ConsoleBasedLogger extends Logger{

    public ConsoleBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Console Logger Info: " + msg);
    }
}
