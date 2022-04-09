package com.company;

public abstract class Logger {

    public static int OutputInfo = 1;

    public static int ErrorInfo = 2;

    public static int DebugInfo = 3;

    protected int levels;

    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    protected abstract void displayLogInfo(String msg);

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels) {
            displayLogInfo(msg);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }
}
