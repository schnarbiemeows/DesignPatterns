package main;

import java.util.ArrayList;
import java.util.List;

import classes.Car;
import classes.CarTest;
import classes.FilteringIterator;
import classes.Person;
import classes.PersonTest;

public class MainMethod {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("john","male"));
		people.add(new Person("jane","female"));
		people.add(new Person("susan","female"));
		people.add(new Person("jack","male"));
		
		FilteringIterator filteringiterator = new FilteringIterator(people.iterator(),new PersonTest());
		while(filteringiterator.hasNext()) {
			Person item = (Person)filteringiterator.next();
			System.out.println(item.getName() + " : " + item.getGender());
		}
		// test an empty list
		people = new ArrayList<Person>();
		filteringiterator = new FilteringIterator(people.iterator(),new PersonTest());
		while(filteringiterator.hasNext()) {
			Person item = (Person)filteringiterator.next();
			System.out.println(item.getName() + " : " + item.getGender());
		}
		
		// test a list where everything qualifies
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("honda",2018,"yellow"));
		cars.add(new Car("toyota",2018,"yellow"));
		cars.add(new Car("ford",2018,"yellow"));
		cars.add(new Car("chrystler",2018,"yellow"));
		FilteringIterator carfilteringiterator = new FilteringIterator(cars.iterator(),new CarTest());
		while(carfilteringiterator.hasNext()) {
			Car item = (Car)carfilteringiterator.next();
			System.out.println(item.getModel() + " : " + item.getYear() + " : " + item.getColor());
		}
		// test a list where nothing qualifies
		cars = new ArrayList<Car>();
		cars.add(new Car("honda",2018,"blue"));
		cars.add(new Car("toyota",2018,"blue"));
		cars.add(new Car("ford",2018,"blue"));
		cars.add(new Car("chrystler",2018,"blue"));
		carfilteringiterator = new FilteringIterator(cars.iterator(),new CarTest());
		while(carfilteringiterator.hasNext()) {
			Car item = (Car)carfilteringiterator.next();
			System.out.println(item.getModel() + " : " + item.getYear() + " : " + item.getColor());
		}
	}

}
