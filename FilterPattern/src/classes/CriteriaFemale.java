package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Criteria;

/**
 * @author dylan
 *
 */
public class CriteriaFemale implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
