package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class Topic implements Subject {

	private List<Observer> subscribers;
	private String message;
	private boolean changed;
	private final Object lock = new Object();

	public Topic() {
		super();
		subscribers = new ArrayList<Observer>();
	}

	@Override
	public void registerWithTopic(Observer o) {
		if (o == null)
			throw new NullPointerException("Null Observer");
		synchronized (lock) {
			if (!subscribers.contains(o))
				subscribers.add(o);
		}
	}

	@Override
	public void unRegisterWithTopic(Observer o) {
		if (o == null)
			throw new NullPointerException("Null Observer");
		synchronized (lock) {
			if (subscribers.contains(o))
				subscribers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> subscriberscopy = null;
		synchronized(lock) {
			if(!changed)
				return;
			subscriberscopy = new ArrayList<Observer>(this.subscribers);
			this.changed=false;
		}
		for(Observer o : subscriberscopy) {
			o.update();
		}

	}

	@Override
	public Object getTopicUpdate(Observer o) {
		return this.message;
	}

	// method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
