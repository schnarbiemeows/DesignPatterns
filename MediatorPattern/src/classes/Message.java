package classes;

public class Message {

	private String from;
	private String audience;
	private String message;
	public Message(String from, String audience, String message) {
		super();
		this.from = from;
		this.audience = audience;
		this.message = message;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
}
