package com.bajaj.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

//Collection--collection is collection of class which help to create ,update , delete ,sort, insert 
//many type of data , int , string , long, object 

//Collections
//Comparable 
//Comparaotor
class Employees implements Comparable<Employees>
{
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
	
	@Override
	public String toString() {
		return "Employees [rollno=" + rollno + ", name=" + name + "]";
	}
	public Employees(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	int rollno;
	String name;
	//if first value is greater return 1
	//if first value is less restrun -1
	//both retrun 0
	
	
	//e1.compareTo(e2);
	
	
	@Override
	public int compareTo(Employees e2) {
		
		if(this.rollno>e2.getRollno())
		{
			return -1;
		}
		else if(this.rollno<e2.getRollno())
		{
			return 1;
		}
		else
		{
		// TODO Auto-generated method stub
		return 0;
		}
	}
}

public class MyCollection {
	
	public static void main(String args[])
	{
		//Parent //giving the reference of child class of implemeations
		//Array --add , delete , append , create
		//creating the arraylist
		List<Employees> ls=new ArrayList<Employees>();
		
		//add
		
		ls.add(new Employees(1001,"Zriya"));
		ls.add(new Employees(100,"Ansar"));
		ls.add(new Employees(85,"Mahesh"));
		ls.add(new Employees(50,"Kamreah"));
	
		
		//ls.
		//ls.pe
		
		//ls.add(1);
		
		//ls.add(10.2f);
		
		//display
	//	System.out.println(ls);
		
		//ls.remove(0);
		//  ls.remove("A");
		  
		 // 
			/*
			 * if(ls.contains("Ansar")) { System.out.println("Found"); }
			 */
		//  System.out.println(ls.get(1));
		//  ls.isEmpty();
		 // ls.clear();
		  //ls.size();
		
		Collections.sort(ls,Collections.reverseOrder());
		
		//System.out.println(ls);
		for(Employees str:ls)
		{
			//str.toString();
			System.out.println(str.toString());
		}
		//System.out.println(ls.size());
		//ls.
		
	}

}
