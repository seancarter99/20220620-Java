package com.skillstorm.week1.day3;

import java.util.Comparator;
import java.util.LinkedList;

// Two choices for sorting
// 1. Have Student implement the Comparable interface
//    This should be used for the "default sort" since I can only one Comparable compareTo
// 2. Create a custom Comparator that compares two Student objects
public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	private float grade;

	public Student() {
		super();
	}

	public Student(String name, int age, float grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Student that) {
		/*
		 * Return -1, 0, or 1
		 * 0 - Equal
		 * -1 - Less than
		 * 1 - Greater than
		 */
		if (that == null) {
			return -1; // Kick to the end
		}
		// Handling nulls AKA edge cases
		if (this.name == null) {
			if (that.name == null) {
				return 0;
			}
			return 1; // Kick the null values to the end
		}
				
		return this.name.compareTo(that.name); // Use String's Comparable method
	}
	
	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();
		students.add(new Student("Mark", 24, 75.0f));
		students.add(new Student("Albert", 21, 30.0f));
		students.add(new Student("Zoe", 18, 92.0f));
		students.add(new Student("Matt", 30, 86.0f));
		
		System.out.println("Students before sort:");
		System.out.println(students);
		
//		students.sort(null); // This sorts using Comparable
		java.util.Collections.sort(students); // This also sorts using Comparable
		
		
		System.out.println("\nStudents after name sort:");
		System.out.println(students);
		
//		students.sort(new StudentAgeComparator()); // This also sorts using Comparable
		// Using a lambda to sort
		students.sort((student1, student2) -> {
			if (student1 == null) {
				if (student2 == null) {
					return 0;
				}
				return 1; // Kick student1 to the end of the list
			}
			if (student2 == null) {
				return -1;
			}
			
			// Nulls are handled
			return student1.getAge() - student2.getAge();
		});
		
		System.out.println("\nStudents after age sort:");
		System.out.println(students);
	}

}

class StudentAgeComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student student1, Student student2) {
		if (student1 == null) {
			if (student2 == null) {
				return 0;
			}
			return 1; // Kick student1 to the end of the list
		}
		if (student2 == null) {
			return -1;
		}
		
		// Nulls are handled
		return student1.getAge() - student2.getAge();
	}
	
}
