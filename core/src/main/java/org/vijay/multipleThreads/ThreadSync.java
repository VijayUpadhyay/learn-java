package org.vijay.multipleThreads;

import java.io.IOException;
import java.util.Scanner;

public class ThreadSync {
	public static void main(String[] args) throws IOException {
		ThreadTest t = new ThreadTest();
		t.start();
		System.out.println("Press to stop");
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
		}
		System.out.println(t.getState());
		t.shutdown();
	}
}

class ThreadTest extends Thread{
	private volatile boolean running = true;
	@Override
	public void run() {
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void shutdown(){
		running = false;
	}
}
