package main;

import java.util.ArrayList;
import java.util.List;

import classes.AndCriteria;
import classes.CriteriaFemale;
import classes.CriteriaMale;
import classes.CriteriaSingle;
import classes.OrCriteria;
import classes.Person;
import interfaces.Criteria;

public class FilterPatternMain {

	/*
	 * Structural design pattern
	 * filter a list of items using conditionals that implement a common Criteria interface,
	 * and also implementers that can chain together individual conditionals
	 * https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
	 */
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));

	      Criteria male = new CriteriaMale();
	      Criteria female = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, female);

	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));

	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));

	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	   }

	   public static void printPersons(List<Person> persons){
	   
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
	      }
	   }      
	}

