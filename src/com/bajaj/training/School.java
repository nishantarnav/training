package com.bajaj.training;

public class School {

	
	public School(int id, String name, int cls, int section, String house) {
	
		this.id = id;
		this.name = name;
		this.cls = cls;
		this.section = section;
		this.house = house;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	
	private int id;
	private String name;
	private int cls;
	private int section;
	private String house;
	
	public static void main(String[] args) {

		School skl= new School(1,"nus",3,5,"Arnav");
		System.out.println(skl.getHouse());
		skl.setName("Tappu");
		System.out.println(skl.getName());
	}
	
	
}
