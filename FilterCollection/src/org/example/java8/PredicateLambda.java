package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateLambda {
	
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Predicate<Person> predO=(p)->p.getAge()>=55;
		Predicate<Person> predY=(p)->p.getAge()<=40;
		displayPeople(people, predY);
	}

	private static void displayPeople(List<Person> people,
			Predicate<Person> predO) {
		people.forEach(p->{
			if(predO.test(p)){
				System.out.println(p.toString());
			}
		});
	}

}