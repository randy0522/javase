package com.ximalaya.thread.learn;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nali on 2018/2/13.
 */
public class MyRunnableTest implements Runnable {
	public void run() {
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Running !");
	}
}

class Test2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnableTest());
		thread.start();
		new Thread(new Thread(() -> System.out.println(Thread.currentThread().getName()))).start();

		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

		List<String> strings = Arrays.asList("randy1", "randy2", "randy3");

		for (String s : strings){
			System.out.println(s);
		}

		strings.forEach(System.out::println);
	}
}

@FunctionalInterface
interface WorkerInterface {
	void doSome();
}

class WorkerInterfaceTest {
	private static void execute(WorkerInterface workerInterface){
		workerInterface.doSome();
	}

	public static void main(String[] args) {
/*		WorkerInterfaceTest.execute(new WorkerInterface() {
			@Override
			public void doSome() {
				System.out.println("randy");
			}
		});*/
		execute(() -> System.out.println("randy"));
	}
}

interface Worker {
	void say(String s);
}

class WorkerTest {
	private static void execute(Worker worker, String s){
		worker.say(s);
	}

	public static void main(String[] args) {
		execute(e -> System.out.println(), "randy");
	}
}