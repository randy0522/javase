package com.ximalaya.thread.learn;

/**
 * Created by nali on 2018/2/14.
 */
public class MyThread3 extends Thread{
	private int count = 5;

	public MyThread3(String name){
		super();
		this.setName(name);
	}
	@Override
	synchronized public void run(){
		while (count > 0){
			count--;
			System.out.println("thread:" + Thread.currentThread().getName() + ", count=" + count);
		}
	}
}

class Test3 {
	public static void main(String[] args) {
/*		MyThread3 myThread3 = new MyThread3("A");
		MyThread3 myThread4 = new MyThread3("B");
		MyThread3 myThread5 = new MyThread3("C");

		myThread3.start();
		myThread4.start();
		myThread5.start();*/

/*		MyThread3 myThread3 = new MyThread3("randy");
		Thread thread1 = new Thread(myThread3, "A");
		Thread thread2 = new Thread(myThread3, "B");
		Thread thread3 = new Thread(myThread3, "C");
		thread1.start();
		thread2.start();
		thread3.start();*/
		System.out.println("ab".replace("a", "b"));

		CharSequence charSequence = "abcdefg";
		System.out.println(charSequence.charAt(0));
		System.out.println("abcdefg".codePointBefore(1));
	}
}