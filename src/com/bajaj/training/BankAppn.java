package com.bajaj.training;
import java.util.*;
class Employee implements Comparable<Employee>{
	private int empid;
	private String empname;
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	public int getEmployeeID() {
		return empid;
	}
	public void setEmployeeID(int employeeID) {
		this.empid = employeeID;
	}
	public String getName() {
		return empname;
	}
	public void setName(String name) {
		this.empname = name;
	}
	@Override
	public int compareTo(Employee e) {
		return this.empid-e.empid;
		
	}
	
}
class SortDesc implements Comparator<Employee> {
	 
    public int compare(Employee a, Employee b)
    {
 
        return b.getEmployeeID() - a.getEmployeeID();
    }
}
public class BankAppn {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//initialising array
			Employee emp[];
			System.out.println("enter size:");
			int size=sc.nextInt();
			emp=new Employee[size];
			for(int i=0;i<size;i++) {
				System.out.println("enter details:");
				int id=sc.nextInt();
				String name=sc.next();
				Employee empi=new Employee(id,name);
				emp[i]=empi;
			}
			for(int i=0;i<size;i++) {
				System.out.println(emp[i].toString());
			}
		while(true) {
			System.out.println("enter the input");
			System.out.println("1-create New");
			System.out.println("2-insert/append");
			System.out.println("3-delete");
			System.out.println("4-update");
			System.out.println("5-search by name");
			System.out.println("6-sort ASC");
			System.out.println("7-sort DESC");
			System.out.println("8-close");
			int input=sc.nextInt();
			
		
		if(input==2) {
			Employee empnew[]=new Employee[emp.length+1];
			for(int i=0;i<emp.length;i++) {
				empnew[i]=emp[i];
			}// new array created 
			
			System.out.println("enter new input details:");
			int newid=sc.nextInt();
			String newname=sc.next();
			Employee empi=new Employee(newid,newname);
			empnew[emp.length]=empi;
			
			emp=new Employee[empnew.length];
			for(int i=0;i<emp.length;i++) {
				emp[i]=empnew[i];
			}// copied everything to old array
			for(int i=0;i<emp.length;i++) {
				System.out.println(emp[i].toString());
			}
		}
		
		if(input==3) {
			System.out.println("Enter id to be deleted:");
			int remove=sc.nextInt();
			int index=0;
			for(int i=0;i<emp.length;i++) {
				if(emp[i].getEmployeeID()==remove) {
					index=i;
					break;
				}
			}//found index
			Employee empnew[]=new Employee[emp.length-1];
			for(int i=0,k=0;i<emp.length;i++) {
				if(i==index) {
					continue;
				}
				empnew[k++]=emp[i];
			}//new array after deleting
			
			emp=new Employee[empnew.length];
			for(int i=0;i<emp.length;i++) {
				emp[i]=empnew[i];
			}//old array after deleting
			for(int i=0;i<emp.length;i++) {
				System.out.println(emp[i].toString());
			}
		}
	
		if(input==4) {
			System.out.println("enter id to be updated:");
			int idtobeup=sc.nextInt();
			System.out.println("enter details to be updated:");
			String nameup=sc.next();
			int update=0;
			for(int i=0;i<emp.length;i++) {
				if(emp[i].getEmployeeID()==idtobeup) {
					update=i;
					break;
				}
			}//found index to be updated
			emp[update].setName(nameup);
			for(int i=0;i<emp.length;i++) {
				System.out.println(emp[i].toString());
			}
		}
		
		if(input==5) {
			System.out.println("enter name of the person:");
			String search=sc.next();
			for(int i=0;i<emp.length;i++) {
				if(emp[i].getName()==search) {
					System.out.println(emp[i].toString());
				}
			}
		}
		
		if(input==6) {
			Arrays.sort(emp);
			for(int i=0;i<emp.length;i++) {
				System.out.println(emp[i].toString());
			}
			
			
		}
		if(input==7) {
			Arrays.sort(emp,new SortDesc());
			for(int i=0;i<emp.length;i++) {
				System.out.println(emp[i].toString());
			}
		}
		
		if(input==8) {
			System.err.println("Exiting....");
			break;
		}
	}
	}
}
