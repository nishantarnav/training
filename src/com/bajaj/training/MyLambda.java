package com.bajaj.training;



class Calc{
	int a;
	int b;
	
public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
}
interface evenodd{
	void tellme(int n);
}
interface FunctionType{
	 void execute();
}
interface FindLengthType {
	 int len(String str);
}
public class MyLambda {
	public static void main(String[] args) {
		//value to variable
		int a=1;
		System.out.println(a);
		
		//store the func or behavior to the variable
		
		FunctionType code;
		code= () -> System.out.println("hello world");
		
		
		FindLengthType findtype = (str) -> {return str.length();};
		
		System.out.println(findtype.len("hello"));
		
		evenodd ans= (n)-> {
			if(n%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		};
		ans.tellme(5);
		
		
		//no need for access modifier
		//no need of return type
		 //no need to give method or func name
		// single line so need of { }
		 // we need to put -> labda symbol after the parameter
		
		
		code.execute();
	}
}
