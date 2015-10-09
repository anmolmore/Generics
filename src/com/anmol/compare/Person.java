package com.anmol.compare;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	private String name;
	private int salary;
	private int exp;

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getExp() {
		return exp;
	}

	Person(String name, int salary, int exp) {
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return ("\nName : " + name + 
				"\nSalary : " + salary +
				"\nExperience : " + exp);
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}
