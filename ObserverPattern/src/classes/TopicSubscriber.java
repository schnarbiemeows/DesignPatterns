package classes;

import interfaces.Observer;
import interfaces.Subject;

public class TopicSubscriber implements Observer {

	private Subject topic;
	private String subscriberName;
	
	public TopicSubscriber(String subscriberName) {
		super();
		this.subscriberName = subscriberName;
	}

	@Override
	public void update() {
		String message = (String)topic.getTopicUpdate(this);
		if(message==null) {
			System.out.println("no new message");;
		} else {
			System.out.println(subscriberName + " --> consuming message : " + message);
		}
	}

	@Override
	public void setSubject(Subject s) {
		this.topic = s;
	}

}
