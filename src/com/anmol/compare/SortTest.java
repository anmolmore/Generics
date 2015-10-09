package com.anmol.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		Person p1 = new Person("Anmol", 500, 3);
		Person p2 = new Person("Cnmol1", 234, 5);
		Person p3 = new Person("Dmmol3", 5112, 4);
		Person p4 = new Person("Bnmol4", 332, 23);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		//Collections.sort(personList);
		
		PersonComparator sortComparator = new PersonComparator();
		Collections.sort(personList, sortComparator);
		
		System.out.println(personList);
	}
}

class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getSalary() < p2.getSalary()) {
			return -1;
		}
		if(p1.getSalary() > p2.getSalary()) {
			return 1;
		}
		return 0;
	}
}
