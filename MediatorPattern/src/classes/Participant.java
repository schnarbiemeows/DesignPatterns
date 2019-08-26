package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dylan
 *
 */
public class Participant {

	private String name;

	/**
	 * @param name
	 */
	public Participant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<String> messages = new ArrayList<String>();

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

}
