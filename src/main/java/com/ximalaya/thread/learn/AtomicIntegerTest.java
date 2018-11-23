package com.ximalaya.thread.learn;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by nali on 2018/3/5.
 */
public class AtomicIntegerTest {
	public static void main(String[] args) throws InterruptedException {
		Thread1 mt = new Thread1();

		Thread thread = new Thread(mt);
		Thread thread2 = new Thread(mt);
		thread.start();
		thread2.start();
		Thread.sleep(5 * 100);
		System.out.println(mt.atomicInteger.get());

		System.out.println(null instanceof AtomicIntegerTest);
	}
}

class Thread1 implements Runnable {

	AtomicInteger atomicInteger = new AtomicInteger();
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++){
			atomicInteger.getAndIncrement();
		}
	}
}
