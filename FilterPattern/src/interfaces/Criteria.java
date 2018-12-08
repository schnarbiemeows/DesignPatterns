package interfaces;

import java.util.List;

import classes.Person;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
