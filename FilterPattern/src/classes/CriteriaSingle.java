package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Criteria;

/**
 * @author dylan
 *
 */
public class CriteriaSingle implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
