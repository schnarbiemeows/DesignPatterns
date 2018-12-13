package classes;

public class Memento {
	   private TestObject state;

	   public Memento(TestObject state){
	      this.state = state;
	   }

	   public TestObject getState(){
	      return state;
	   }	
	}
