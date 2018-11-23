package com.ximalaya.thread.learn;



/**
 * Created by nali on 2018/2/13.
 */
public class MyThread extends Thread {
	@Override
	public void run(){
		super.run();
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread is Running !");
	}
}

class Run {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.start();
		System.out.println("over !");
	}
}
