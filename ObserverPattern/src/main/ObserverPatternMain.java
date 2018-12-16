package main;

import classes.Topic;
import classes.TopicSubscriber;
import interfaces.Observer;

public class ObserverPatternMain {

	/*
	 * Behavioral Pattern
	 * The Observer pattern is used when there 
	 * is one-to-many relationship between objects such as if one object is modified, its depenedent objects 
	 * are to be notified automatically.
	 */
	public static void main(String[] args) {
		
		// create the Subject(Topic)
		Topic myTopic = new Topic();
		
		// create subscribers
		Observer o1 = new TopicSubscriber("Robot 1AA");
		Observer o2 = new TopicSubscriber("Robot 2BB");
		Observer o3 = new TopicSubscriber("Robot 3CC");
		Observer o4 = new TopicSubscriber("Robot 4DD");
		
		myTopic.registerWithTopic(o1);
		myTopic.registerWithTopic(o2);
		myTopic.registerWithTopic(o3);
		myTopic.registerWithTopic(o4);
		
		o1.setSubject(myTopic);
		o2.setSubject(myTopic);
		o3.setSubject(myTopic);
		o4.setSubject(myTopic);
		
		o1.update();
		
		myTopic.postMessage("MSG17A6G45T904X");

		myTopic.unRegisterWithTopic(o1);
		
		myTopic.postMessage("MSG6Y87NU30K92");
	}

}
