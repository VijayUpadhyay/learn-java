package org.vijay.javaBasics;

class Table{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i+" Thread Name is"+ Thread.currentThread().getName());  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	public void run(){  
	Table.printTable(1);  
	}  
	}  
	  
	class MyThread2 extends Thread{  
	public void run(){  
	Table.printTable(10);  
	}  
	}  
	  
	class MyThread3 extends Thread{  
	public void run(){  
	Table.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThread4 extends Thread{  
	public void run(){  
	Table.printTable(1000);  
	}  
	}  
	  
	public class TestStaticSynchronizationBlock{  
	public static void main(String t[]){  
	MyThread1 t1=new MyThread1();  
	MyThread2 t2=new MyThread2();  
	MyThread3 t3=new MyThread3();  
	MyThread4 t4=new MyThread4();  
	 t1.setName("1st Thread");
     t2.setName("2nd Thread");
     t3.setName("3rd Thread");
     t4.setName("4th Thread");
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	}  
