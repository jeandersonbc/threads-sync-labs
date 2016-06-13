package com.example;

public class Foo {

	static Object lock = new Object();

	void f() throws InterruptedException {
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + ": f(): " + System.currentTimeMillis());
			Thread.sleep(3 * 1000);
		}
	}

	void g() throws InterruptedException {
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + ": g(): " + System.currentTimeMillis());
			Thread.sleep(3 * 3000);
		}
	}

}
