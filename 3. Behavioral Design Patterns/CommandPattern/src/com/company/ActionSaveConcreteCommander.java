package com.company;

public class ActionSaveConcreteCommander implements ActionListenerCommand{

    private DocumentReceiver document;

    public ActionSaveConcreteCommander(DocumentReceiver documentReceiver) {
        this.document = documentReceiver;
    }

    @Override
    public void execute() {
        document.save();
    }
}
