package com.example;

public class Main {

	public static void main(String[] args) throws Exception {
		Foo foo = new Foo();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					foo.f();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					foo.g();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}, "thread2");
		t1.start();
		t2.start();
		System.out.println("Active Threads: " + Thread.activeCount());
	}
}
