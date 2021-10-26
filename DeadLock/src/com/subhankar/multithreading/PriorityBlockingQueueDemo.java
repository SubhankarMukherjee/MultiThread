package com.subhankar.multithreading;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	
	public static void main(String[] args) {
		
		PriorityBlockingQueue<Integer> pb= new PriorityBlockingQueue<Integer>();
		pb.add(2);
		pb.add(200);
		pb.add(45);
		
		//poling
		System.out.println(pb.poll());
		System.out.println(pb.poll());
		System.out.println(pb.poll());
		
		PriorityBlockingQueue<Student> pb1= new PriorityBlockingQueue<Student>();
		pb1.add(new Student("ashish",34));
		pb1.add(new Student("sibh",23));
		pb1.add(new Student("montar",100));
		
		//poling
		System.out.println(pb1.poll());
		System.out.println(pb1.poll());
		System.out.println(pb1.poll());
		// it will give classcast exception unless comparable is defined
	}
}

class Student implements Comparable<Student>
{
	private int rollnumber;
	private String name;
	
	public Student(String name,int rollnumber)
	{this.name=name;
	this.rollnumber=rollnumber;
		
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.rollnumber-arg0.rollnumber;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + "]";
	}
	
}
