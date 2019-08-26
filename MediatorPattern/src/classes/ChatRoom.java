package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dylan
 *
 */
public class ChatRoom {

	private Map<String, Participant> participants = new HashMap<String, Participant>();

	/**
	 * @param person
	 */
	public void addParticipant(Participant person) {
		participants.put(person.getName(), person);
	}

	/**
	 * @param message
	 */
	public void sendMessage(Message message) {
		String recipient = message.getAudience();
		participants.get(recipient).getMessages().add(message.getMessage());
	}
}
