package com.exemplo.threadlabs;

public class ThreadLab2 extends Thread {

	String text; 
	static final Object lock = new Object();
	
	public ThreadLab2(String text) {
		super(text);
	}
	
	public void run() {
		
		synchronized (lock) {
			for(int i = 0; i < 10; i++) {
				System.out.println(getName());				
			}
			//ThreadLab2.lock.notify();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
