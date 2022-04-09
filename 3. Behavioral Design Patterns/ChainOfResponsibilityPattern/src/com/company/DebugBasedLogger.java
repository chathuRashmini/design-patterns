package com.company;

public class DebugBasedLogger extends Logger{

    public DebugBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Debug Logger Info: " + msg);
    }
}
