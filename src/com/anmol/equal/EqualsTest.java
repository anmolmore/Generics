package com.anmol.equal;

import java.util.List;

public class EqualsTest {
	public static void main(String[] args) {
		Person p1 = new Person("Anmol", 500);
		Person p2 = new Person("Anmol1", 500);
		Person p3 = new Person("Anmol", 500);
		if (p1.equals(p2)) {
			System.out.println("one and two are equal");
		}
		if (p1.equals(p3)) {
			System.out.println("one and three are equal");
		}
		
		List l;
	}
}

class Person {
	private String name;
	private int salary;
	
	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			if(p.getName().equals(name) && p.getSalary() == salary) {
				return true;
			}
		}
		return false;
	}
}

