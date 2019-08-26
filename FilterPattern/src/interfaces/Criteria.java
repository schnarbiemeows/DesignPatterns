package interfaces;

import java.util.List;

import classes.Person;

/**
 * @author dylan
 *
 */
public interface Criteria {

	/**
	 * @param persons
	 * @return
	 */
	public List<Person> meetCriteria(List<Person> persons);
}
