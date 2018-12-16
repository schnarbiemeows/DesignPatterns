package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Part;
import interfaces.Watch;

public class TimexWatch implements Watch {

	List<Part> gears;
	
	public TimexWatch() {
		super();
		this.gears = new ArrayList<Part>();
	}

	@Override
	public void setPart(Part p) {
		this.gears.add(p);
	}

	@Override
	public void oilWatch() {
		System.out.println("oiling the Watch, oil trickling down into the gears");
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for(Part p : gears) {
			p.oil();
		}
	}

}
