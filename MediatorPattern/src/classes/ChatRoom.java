package classes;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom {

	private Map<String,Participant> participants = new HashMap<String,Participant>();
	
	public void addParticipant(Participant person) {
		participants.put(person.getName(), person);
	}
	
	public void sendMessage(Message message) {
		String recipient = message.getAudience();
		participants.get(recipient).getMessages().add(message.getMessage());
	}
}
