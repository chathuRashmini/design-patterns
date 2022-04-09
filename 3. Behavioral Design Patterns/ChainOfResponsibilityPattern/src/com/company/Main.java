package com.company;

public class Main {

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OutputInfo);

        Logger errorLogger = new ErrorBasedLogger(Logger.ErrorInfo);

        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DebugInfo);

        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
	    Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OutputInfo, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ErrorInfo, "An error caused.");
        chainLogger.logMessage(Logger.DebugInfo, "The error debugging completed.");
    }
}
