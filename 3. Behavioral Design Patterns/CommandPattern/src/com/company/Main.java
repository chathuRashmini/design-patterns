package com.company;

public class Main {

    public static void main(String[] args) {
	    DocumentReceiver documentReceiver = new DocumentReceiver();

	    ActionListenerCommand clickOpen = new ActionOpenConcreteCommander(documentReceiver);

	    ActionListenerCommand clickSave = new ActionSaveConcreteCommander(documentReceiver);

	    MenuOptionsInvoker menu = new MenuOptionsInvoker(clickOpen, clickSave);

	    menu.chickOpen();

	    menu.clickSave();
    }
}
