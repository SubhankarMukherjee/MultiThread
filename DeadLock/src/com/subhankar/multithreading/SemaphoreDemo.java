package com.subhankar.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
public static void main(String[] args) {
	
	Semaphore sema= new Semaphore(2);
	new Printer(1,sema).start();
	new Printer(2,sema).start();
	new Printer(3,sema).start();
	new Printer(4,sema).start();
}
}

class Printer extends Thread
{
	private int id;
	private Semaphore sema;
	public Printer(int id,Semaphore sema)
	{
		this.id=id;
		this.sema=sema;
	}
	
	public void run()
	{
		//critical section
		try {
			sema.acquire();
			System.out.println("The printer"+id +" is printing....");
			Thread.sleep(2000);
			sema.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
