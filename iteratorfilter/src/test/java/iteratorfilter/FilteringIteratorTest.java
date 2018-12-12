package iteratorfilter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import classes.Car;
import classes.CarTest;
import classes.FilteringIterator;
import classes.Person;
import classes.PersonTest;
import classes.StringTest;

public class FilteringIteratorTest {

	// our general FilterIterator for testing
	FilteringIterator iteratorTest;
	
	// Tests for List with String objects
	
	// normal string list
	List<String> stringsNormal;
	// empty string list
	List<String> stringsEmpty;
	// string list where nothing passes the test
	List<String> stringsNoQualifiers;
	StringTest stringtest;
	List<String> expectedStringsNormalOutput;
	List<String> expectedStringsEmptyOutput;
	List<String> expectedStringsNoQualifiersOutput;
	
	// tests for List with Person objects
	// normal Person list
	List<Person> personsNormal;
	// empty Person list
	List<Person> personsEmpty;
	// Person list where nothing passes the test
	List<Person> personsNoQualifiers;
	PersonTest persontest;
	List<Person> expectedPersonsNormalOutput;
	List<Person> expectedPersonsEmptyOutput;
	List<Person> expectedPersonsNoQualifiersOutput;
	
	// test for list with Car objects
	// normal Car list
	List<Car> carsNormal;
	// empty string list
	List<Car> carsEmpty;
	// string list where nothing passes the test
	List<Car> carsNoQualifiers;
	CarTest cartest;
	List<Car> expectedCarsNormalOutput;
	List<Car> expectedCarsEmptyOutput;
	List<Car> expectedCarsNoQualifiersOutput;
	
	@Before
	public void setup() {
		// String list setup
		stringtest = new StringTest();
		stringsNormal = new ArrayList<String>();
		stringsEmpty = new ArrayList<String>();
		stringsNoQualifiers = new ArrayList<String>();
		expectedStringsNormalOutput = new ArrayList<String>();
		expectedStringsEmptyOutput = new ArrayList<String>();
		expectedStringsNoQualifiersOutput = new ArrayList<String>();
		// add items the the normal and no qualifiers lists
		stringsNormal.add("hi");
		stringsNoQualifiers.add("hi");
		stringsNormal.add("there");
		stringsNormal.add("watch");
		stringsNormal.add("this");
		stringsNoQualifiers.add("this");
		// these should be in the normal filtered iterator
		expectedStringsNormalOutput.add("there");
		expectedStringsNormalOutput.add("watch");
		
		// Person List setup
		persontest = new PersonTest();
		personsNormal = new ArrayList<Person>();
		personsEmpty = new ArrayList<Person>();
		personsNoQualifiers = new ArrayList<Person>();
		expectedPersonsNormalOutput = new ArrayList<Person>();
		expectedPersonsEmptyOutput = new ArrayList<Person>();
		expectedPersonsNoQualifiersOutput = new ArrayList<Person>();
		// add items the the normal and no qualifiers lists
		personsNormal.add(new Person("john","male"));
		personsNoQualifiers.add(new Person("john","male"));
		personsNormal.add(new Person("jane","female"));
		personsNormal.add(new Person("sally","female"));
		personsNormal.add(new Person("jack","male"));
		personsNoQualifiers.add(new Person("jack","male"));
		// these should be in the normal filtered iterator
		expectedPersonsNormalOutput.add(new Person("jane","female"));
		expectedPersonsNormalOutput.add(new Person("sally","female"));
		// Car list setup
		cartest = new CarTest();
		carsNormal = new ArrayList<Car>();
		carsEmpty = new ArrayList<Car>();
		carsNoQualifiers = new ArrayList<Car>();
		expectedCarsNormalOutput = new ArrayList<Car>();
		expectedCarsEmptyOutput = new ArrayList<Car>();
		expectedCarsNoQualifiersOutput = new ArrayList<Car>();
		// add items the the normal and no qualifiers lists
		carsNormal.add(new Car("honda",2018,"blue"));
		carsNoQualifiers.add(new Car("honda",2018,"blue"));
		carsNormal.add(new Car("toyota",2016,"yellow"));
		carsNormal.add(new Car("ford",2015,"yellow"));
		carsNormal.add(new Car("chrystler",2014,"red"));
		carsNoQualifiers.add(new Car("chrystler",2014,"red"));
		// these should be in the normal filtered iterator
		expectedCarsNormalOutput.add(new Car("toyota",2016,"yellow"));
		expectedCarsNormalOutput.add(new Car("ford",2015,"yellow"));
	}
	// String tests - compare the size of the filtered lists with the size of the expected output list
	@Test
	public void testIteratorOnStringsNormal() {
		iteratorTest = new FilteringIterator(stringsNormal.iterator(),stringtest);
		List<String> tempOutput = new ArrayList<String>();
		while(iteratorTest.hasNext()) {
			String item = (String)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedStringsNormalOutput.size());
		for(int i = 0; i<tempOutput.size(); i++) {
			assertEquals(tempOutput.get(i).toString(),expectedStringsNormalOutput.get(i).toString());
		}
	}
	
	@Test
	public void testIteratorOnStringsEmpty() {
		iteratorTest = new FilteringIterator(stringsEmpty.iterator(),stringtest);
		List<String> tempOutput = new ArrayList<String>();
		while(iteratorTest.hasNext()) {
			String item = (String)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedStringsEmptyOutput.size());
		assertEquals(tempOutput.size(),0);
	}
	
	@Test
	public void testIteratorOnStringsNoQualifiers() {
		iteratorTest = new FilteringIterator(stringsNoQualifiers.iterator(),stringtest);
		List<String> tempOutput = new ArrayList<String>();
		while(iteratorTest.hasNext()) {
			String item = (String)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedStringsNoQualifiersOutput.size());
		assertEquals(tempOutput.size(),0);
	}
	// Person tests - compare the size of the filtered lists with the size of the expected output list
	@Test
	public void testIteratorOnPersonsNormal() {
		iteratorTest = new FilteringIterator(personsNormal.iterator(),persontest);
		List<Person> tempOutput = new ArrayList<Person>();
		while(iteratorTest.hasNext()) {
			Person item = (Person)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedPersonsNormalOutput.size());
		for(int i = 0; i<tempOutput.size(); i++) {
			assertEquals(tempOutput.get(i).getName(),expectedPersonsNormalOutput.get(i).getName());
			assertEquals(tempOutput.get(i).getGender(),expectedPersonsNormalOutput.get(i).getGender());
		}
	}
	
	@Test
	public void testIteratorOnPersonsEmpty() {
		iteratorTest = new FilteringIterator(personsEmpty.iterator(),persontest);
		List<Person> tempOutput = new ArrayList<Person>();
		while(iteratorTest.hasNext()) {
			Person item = (Person)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedPersonsEmptyOutput.size());
		assertEquals(tempOutput.size(),0);
	}
	
	@Test
	public void testIteratorOnPersonsNoQualifiers() {
		iteratorTest = new FilteringIterator(personsNoQualifiers.iterator(),persontest);
		List<Person> tempOutput = new ArrayList<Person>();
		while(iteratorTest.hasNext()) {
			Person item = (Person)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedPersonsNoQualifiersOutput.size());
		assertEquals(tempOutput.size(),0);
	}
	// Car tests - compare the size of the filtered lists with the size of the expected output list
	@Test
	public void testIteratorOnCarsNormal() {
		iteratorTest = new FilteringIterator(carsNormal.iterator(),cartest);
		List<Car> tempOutput = new ArrayList<Car>();
		while(iteratorTest.hasNext()) {
			Car item = (Car)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedCarsNormalOutput.size());
		for(int i = 0; i<tempOutput.size(); i++) {
			assertEquals(tempOutput.get(i).getModel(),expectedCarsNormalOutput.get(i).getModel());
			assertEquals(tempOutput.get(i).getYear(),expectedCarsNormalOutput.get(i).getYear());
			assertEquals(tempOutput.get(i).getColor(),expectedCarsNormalOutput.get(i).getColor());
		}
	}
	
	@Test
	public void testIteratorOnCarsEmpty() {
		iteratorTest = new FilteringIterator(carsEmpty.iterator(),cartest);
		List<Car> tempOutput = new ArrayList<Car>();
		while(iteratorTest.hasNext()) {
			Car item = (Car)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedCarsEmptyOutput.size());
		assertEquals(tempOutput.size(),0);
	}
	
	@Test
	public void testIteratorOnCarsNoQualifiers() {
		iteratorTest = new FilteringIterator(carsNoQualifiers.iterator(),cartest);
		List<Car> tempOutput = new ArrayList<Car>();
		while(iteratorTest.hasNext()) {
			Car item = (Car)iteratorTest.next();
			tempOutput.add(item);
		}
		assertEquals(tempOutput.size(),expectedCarsNoQualifiersOutput.size());
		assertEquals(tempOutput.size(),0);
	}
}