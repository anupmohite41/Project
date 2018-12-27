package com.tomcat.sample.cont;
//public class SampleThread implements Runnable{
//	public void run(){
//		System.out.println("Thread Running");
//	}
//}
public class SampleThread extends Thread{
	public void run(){
		int i=10;
		System.out.println("Thread Running");
		for(i=0;i<20;i++){
			System.out.println(i);
		}
	}
}