package com.ximalaya.thread.learn;

/**
 * Created by nali on 2018/2/13.
 */
public class MyThread2 extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 100; i++){
			int time = (int) (Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("Run=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Test {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		for (int i = 0; i < 100; i++){
			int time = (int) (Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
