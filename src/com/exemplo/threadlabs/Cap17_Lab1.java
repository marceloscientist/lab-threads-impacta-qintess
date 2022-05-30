package com.exemplo.threadlabs;

public class Cap17_Lab1 {

	public static void main(String[] args) {
		/*
		ThreadLab1 t1 = new ThreadLab1("Thread 1");
		ThreadLab1 t2 = new ThreadLab1("Thread 2");
		
		t1.start();
		t2.start();
		*/
		
		ThreadLab2 t1 = new ThreadLab2("Thread 1");
		ThreadLab2 t2 = new ThreadLab2("Thread 2");
		
		t1.start();
		t2.start();
		

	}

}
