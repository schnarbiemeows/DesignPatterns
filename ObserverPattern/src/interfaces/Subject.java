package interfaces;

public interface Subject {

	public void registerWithTopic(Observer o);
	public void unRegisterWithTopic(Observer o);
	public void notifyObservers();
	public Object getTopicUpdate(Observer o);
}
