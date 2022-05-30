package com.exemplo.threadlabs;

public class ThreadLab1 extends Thread {
	String text; 
	public ThreadLab1(String text) {
		super(text);
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
