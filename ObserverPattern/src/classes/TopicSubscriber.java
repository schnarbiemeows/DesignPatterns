package classes;

import interfaces.Observer;
import interfaces.Subject;

/**
 * @author dylan
 *
 */
public class TopicSubscriber implements Observer {

	private Subject topic;
	private String subscriberName;

	/**
	 * @param subscriberName
	 */
	public TopicSubscriber(String subscriberName) {
		super();
		this.subscriberName = subscriberName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Observer#update()
	 */
	@Override
	public void update() {
		String message = (String) topic.getTopicUpdate(this);
		if (message == null) {
			System.out.println("no new message");
			;
		} else {
			System.out.println(subscriberName + " --> consuming message : " + message);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Observer#setSubject(interfaces.Subject)
	 */
	@Override
	public void setSubject(Subject s) {
		this.topic = s;
	}

}
