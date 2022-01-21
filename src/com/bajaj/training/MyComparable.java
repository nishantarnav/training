package com.bajaj.training;

	import java.util.*;

 class Student implements Comparable<Student>{
		int id;
		String name;
		int marks;
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
		}
		public Student(int id, String name, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		@Override
		public int compareTo(Student o) {
		return this.id-o.id;
		}
		
	}
 class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
		
	}
	 
 }
 class SortBymarks implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
			
		}
		 
	 }
 

	public class MyComparable {
		public static void main(String args[]) {
			List<Student> s=new ArrayList<Student>();
			s.add(new Student(15,"bannu",76));
			s.add(new Student(10,"chinnu",91));
			s.add(new Student(11,"cherry",56));
			s.add(new Student(7,"viswa",93));
			for(Student p:s) {
				System.out.println(p);
			}
			Collections.sort(s,new SortBymarks());
		}
	}
	

