package com.company;

public class MenuOptionsInvoker {

    private ActionListenerCommand openCommand;

    private ActionListenerCommand saveCommand;

    public void chickOpen() {
        openCommand.execute();
        System.out.println("Opened!");
    }

    public void clickSave() {
        saveCommand.execute();
        System.out.println("saved.");
    }

    public MenuOptionsInvoker(ActionListenerCommand openCommand, ActionListenerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }
}
