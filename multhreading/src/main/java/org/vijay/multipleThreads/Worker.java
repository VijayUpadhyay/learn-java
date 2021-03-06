package org.vijay.multipleThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	Random r = new Random();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	
	
	// Its GPP to create separate lock object
	Object obj1 = new Object();
	Object obj2 = new Object();
	
	public void stage1() {
		synchronized (obj1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			list1.add(r.nextInt(100));	
		}
	}
	
	public void stage2() {
		synchronized (obj2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			list2.add(r.nextInt(100));	
		}
	}
	
	public void process() {
		System.out.println("Inside Process: "+Thread.currentThread().getName());
		for(int i =0;i<1000;i++){
		stage1();
		stage2();
		}
		
	}
	public void main() {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		
		System.out.println("Starting....");
		long start = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end =System.currentTimeMillis();
		
		System.out.println("Time taken: "+(end-start));
		System.out.println("List1 size: "+list1.size()+" List2 size: "+list2.size());
		
		
	}

}
