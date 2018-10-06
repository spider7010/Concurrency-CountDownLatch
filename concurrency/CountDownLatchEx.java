package com.santhosh.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

	public static void main(String[] args) throws Exception{

		CountDownLatch latch = new CountDownLatch(args.length);
		FoodProcessor foodProcessor = new FoodProcessor(latch, args);
		
		Thread t1 = new Thread(foodProcessor);
		t1.start();
		System.out.println("Order is recieved and its being processed");
		latch.await();
		System.out.println("Order processed successfully");
	}

}
