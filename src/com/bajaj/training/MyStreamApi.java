package com.bajaj.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Student1
{
public Student1(int rollno, String name, int fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
private int rollno;
private String name;
private int fees;
	
}

//StreamAPi is class in java which is used to filter and map the data 
//1,2,3,4,5,6,7,8,9
public class MyStreamApi {
	
	public static void main(String args[])
	{
		
		/*
		 * List<Student1> ls=new ArrayList<Student1>();
		 * 
		 * ls.add(new Student1(1, "Ansar", 2000)); ls.add(new Student1(200, "Pooja",
		 * 1000)); ls.add(new Student1(2, "priya", 500));
		 * 
		 * 
		 * List<Integer> ls1=ls.stream() .filter(student->student.getFees()>500)
		 * .map(s->s.getRollno()) .collect(Collectors.toList());
		 * 
		 * ls1.forEach(s->System.out.println(s));
		 * 
		 * List<String> ls2=ls.stream()
		 * .filter(student->student.getName().startsWith("A"))
		 * .map(s->s.getName().toUpperCase()) .collect(Collectors.toList());
		 * 
		 * ls2.forEach(s->System.out.println(s));
		 */
		//Stream is created with null or empty list
		//data 
		//from the soruce to destination 
		
	    //Stream<String> stream =Stream.empty();
 
		 
		
		//1. count
		//2. min
		//3. max
		//4. filter
		//5. map
        //6. collectors	    
	    //7  distinct
		
	    
	    Collection<Integer> collection= Arrays.asList(1000,200,5000,200);
	  //  collection.forEach(str->System.out.println(str)); 
	    
	    Stream<Integer> streamofCollection=collection.stream();
	 
	    
	    Optional<Integer> s=streamofCollection.max((i,j)->i.compareTo(j));
	     System.out.println(s.get());   
	     
	     
	     
		/*
		 * Collection<Integer> collections = streamofCollection .distinct() //give the
		 * unique value as result // .filter(value->value==200)
		 * .collect(Collectors.toList());
		 * 
		 * collections.forEach(s->System.out.println(s));
		 */
	    
	   // .count();
	    //filter the data 
	    //.forEach(s->System.out.println(s));  //priting the value
	 //System.out.println(count); 
	    
	//    collections.forEach(str->System.out.println(str));
	 
	}
	
	

}
