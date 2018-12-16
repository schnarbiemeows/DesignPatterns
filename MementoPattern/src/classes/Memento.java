package classes;

import java.util.Date;

public class Memento {
	   private TestObject state;
	   private Date dateCreated;
	   
	   public Memento(TestObject state,Date dateCreated){
	      this.state = state;
	      this.dateCreated = dateCreated;
	   }

	   public TestObject getState(){
	      return state;
	   }
	   
	   public Date getDateCreated() {
		   return dateCreated;
	   }
	}
