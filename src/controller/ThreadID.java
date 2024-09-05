package controller;

public class ThreadID extends Thread {
	
	public ThreadID() {
		super();
	}
	
	@Override
	//Overwrites an existing method in parent class
	public void run() {
		seeThread();
	}
	//The run method act like a pointer for the start method 
	
	private void seeThread() {
		
		int id = (int)threadId();
		System.out.println("Thread Id: " + id);
		
	}
	
}
