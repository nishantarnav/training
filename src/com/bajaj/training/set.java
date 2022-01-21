package com.bajaj.training;
import java.util.*;
public class set {
	public static void main(String[] args) {
		
		Set<Student> std= new LinkedHashSet<>();
		std.add(new Student(15,"bannu",76));
		std.add(new Student(10,"chinnu",91));
		std.add(new Student(11,"cherry",56));
		std.add(new Student(7,"viswa",93));
		for(Student p:std) {
			System.out.println(p);
		}
	
		
			
		
		
	}
}
