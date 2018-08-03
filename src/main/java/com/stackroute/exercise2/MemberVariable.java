package com.stackroute.exercise2;


public class MemberVariable extends Member {
	
	public void main(String[] args) {
		MemberVariable obj=new MemberVariable();
		System.out.println("Members Name:"+ obj.name);
		System.out.println("Member age:"+ obj.age);	
		System.out.println("Members Salary:"+ obj.salary);	
		
	}

}

class Member {
		
		String name="Harry potter";
		double salary=2500.3;
		int age=30;
	}

 	
