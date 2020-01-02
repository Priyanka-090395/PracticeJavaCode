package priyanka.java.project1;

public class StudentClass {
		
		//Java Program to illustrate how to define a class and fields   
		//defining fields 
	
		 int id;             //field or data member or instance variable  
		 String name;  
		 
		 public void studentBook() {
			 
		 }
		 //creating main method inside the Student class
		 
		 public static void main(String args[]){  
			  
		  StudentClass s1=new StudentClass();         //creating an object of Student
		  
		  //Printing values of the object
		  s1.id = 45;
		  s1.name = "Priyanka";
		  System.out.println("print the ID :" +s1.id);  //accessing member through reference variable  
		  System.out.println("print the name :" +s1.name);  
		 }  
		}  

