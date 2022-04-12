package com.company;

public class Main {

    public static void main(String[] args) {
	    ChatRoom chat = new ChatRoomImpl();

	    User1 user1 = new User1(chat);
	    user1.setName("Bella Swan");
	    user1.sendMsg("I know who you are.");

        User2 user2 = new User2(chat);
        user2.setName("Edward Cullen");
        user2.sendMsg("Then tell me.");
    }
}
