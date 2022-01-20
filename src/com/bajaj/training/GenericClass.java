package com.bajaj.training;


//Generic Class --pass data type as paramters to class
//wrapper classes
class Employ<T,V,Z>
{
//fixed int
 private T id;
 //fixed String
 private V name;
 private Z salary;
 
 Employ(T id, V name,  Z salary)
 {
	this.id=id;
	this.name=name;
	this.salary=salary;
 }
}



public class GenericClass {
	
	public static void main(String args[])
	{
                            //long        //long
       Employ<Long,String,Long> e2=new Employ(100,"Ansar",100);
    
       Employ<Double,String,Long> e3=new Employ(100.00,"Ansar",100);
       
       
       
	}

}
