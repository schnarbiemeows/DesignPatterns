package classes;

public class BaseballPlayerFactory {

	// 1. create a factory class that will be used to return implementation objects
	public BaseballPlayerFactory() {
		// TODO Auto-generated constructor stub
	}

	public BaseBallPlayer getPlayer(String playerType) {
		if(playerType==null) {
			System.out.println("no player type given!");
			return null;
		}
		if(playerType.equals("pitcher")) {
			return new Pitcher();
		}
		if(playerType.equals("catcher")) {
			return new Catcher();
		}
		if(playerType.equals("outfielder")) {
			return new OutFielder();
		}
		System.out.println("invalid player type!");
		return null;
	}
}
