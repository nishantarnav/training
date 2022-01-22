package com.bajaj.training;
import java.util.*;
//implement these in stream
//1. count
//2. min
//3. max
//4. filter
//5. map
//6. collectors
//7 distinct
//8 sorted

//collector(collectors.groupby)
import java.util.stream.Collectors;

public class MyStreamEx {

	public static void main(String args[]) {
	
		List<Vehicles> ve= new ArrayList<>();

		ve.add(new Vehicles(1,"Car","Maruti",140));
		ve.add(new Vehicles(2,"Bike","Suzuki",120));
		ve.add(new Vehicles(3,"Car","Hyundai",100));
		ve.add(new Vehicles(4,"Car","Tata",90));
		
		//count
		  long vec=ve.stream().map(v-> v.getSpeed()).count();
		  System.out.println(vec);
		//min
		  Optional<String> maxTypeLength5 = ve.stream().map(v-> v.getType()).max((a,b)-> a.compareTo(b));
		  System.out.println(maxTypeLength5.get());
		 //max
		  Optional<String> minTypeLength5 = ve.stream().map(v-> v.getType()).min((a,b)-> a.compareTo(b));
		  System.out.println(minTypeLength5.get());
		  //filter+map+collectors
		  List<String> vex= ve.stream().map(v -> v.getBrand()).filter(st->st.length()>5).map(s->s.toUpperCase()).collect(Collectors.toList());
		  
		  vex.forEach(i-> System.out.println(i));
		  
		  //distinct+map
		  List<String> dist= ve.stream().map(v->v.getType()).distinct().collect(Collectors.toList());
		  dist.forEach(i-> System.out.println(i));
		  
		  //sorting
			//Example 1 - Ascending order
			List<String> sortedBrandsAsc = ve.stream().map(v->v.getBrand()).sorted().collect(Collectors.toList());
			System.out.println("\nNames in ascending order - "+sortedBrandsAsc);
			sortedBrandsAsc.forEach(i-> System.out.print(i));
			
			// Example 2 - Descending order using comparator
//			List<String> sortedBrandsDsc = ve.stream().map(v->v.getBrand()).sorted(new Comparator<String>(){
//				@Override
//				public int compare(String o1, String o2) {
//					// TODO Auto-generated method stub
//					return o2.compareTo(o1);
//				}
//			}).collect(Collectors.toList());
			
		//	and directly printing without storing
			ve.stream().map(v->v.getBrand()).sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(i->System.out.println(i));
			
			//adding all the speeds
			int sum= ve.stream().map(v->v.getSpeed()).reduce(0, (x, y) -> x + y);
			System.out.println(sum);
		  
		  
	}
	
}


class Vehicles{
	
	private int modelNo;
	private String type;
	private String brand;
	private int speed;
	
	public Vehicles(int modelNo, String type, String brand, int speed) {
		super();
		this.modelNo = modelNo;
		this.type = type;
		this.brand = brand;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "Vehicles [modelNo=" + modelNo + ", type=" + type + ", brand=" + brand + ", speed=" + speed + "]";
	}
	
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}