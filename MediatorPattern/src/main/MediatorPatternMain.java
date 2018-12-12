package main;

import classes.ChatRoom;
import classes.Message;
import classes.Participant;

public class MediatorPatternMain {

	/*
	 * Behavioral Pattern
	 * used to reduce the complexity of communication between mutliple objects or classes
	 */
	public static void main(String[] args) {
		
		ChatRoom chatroom = new ChatRoom();
		Participant john = new Participant("john");
		Participant jane = new Participant("jane");
		chatroom.addParticipant(john);
		chatroom.addParticipant(jane);
		chatroom.sendMessage(new Message("john","jane","Hi Jane!"));
		chatroom.sendMessage(new Message("jane","john","Hi john!"));
		System.out.println("John's messages are:");
		for(String item : john.getMessages()) {
			System.out.println(item);
		}
		System.out.println("Jane's messages are:");
		for(String item : jane.getMessages()) {
			System.out.println(item);
		}
	}

}
