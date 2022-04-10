package com.company;

public class ActionOpenConcreteCommander implements ActionListenerCommand{

    private DocumentReceiver document;

    public ActionOpenConcreteCommander(DocumentReceiver documentReceiver) {
        this.document = documentReceiver;
    }

    @Override
    public void execute() {
        document.open();
    }
}
