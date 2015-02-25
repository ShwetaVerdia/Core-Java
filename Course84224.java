package classworkitujava;

import java.util.ArrayList;

public class Course84224 {

	String name;
	int ID;
	String date;
	String length;
	ArrayList<Student> students = new ArrayList<Student>();

	public Course84224(String CourseName, int CourseID) {
		name = CourseName;
		ID = CourseID;

	}

	public Course84224(String CourseName, int CourseID, String StartDate,String CourseLength) {
		name = CourseName;
		ID = CourseID;
		date = StartDate;
		length = CourseLength;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public void setID(int ID){
		this.ID=ID;
	}
	
	public int getID(){
		return ID;
	}
	public void setDate(String date){
		this.date=date;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setLength(String length){
		this.length=length;
	}
	
	public String getLength(){
		return length;
	}
	
	public static void main(String[] args) {
		Course84224 c1 = new Course84224("OO Programming with Java", 964);
		c1.setDate("02/14/2015");
		c1.setLength("3 weeks");
		Course84224 c2 = new Course84224("Data Structure", 850,"01/20/2015" , "16 weeks");
		System.out.println("Course: " +c1.name + " Course ID: "+ c1.ID + " Course Start Date: "+ c1.getDate()+" Course Length: "+ c1.getLength());
		System.out.println("Course: " +c2.name + " Course ID: "+ c2.ID + " Course Start Date: "+ c2.date +" Course Length: "+ c2.length);
	}
}
