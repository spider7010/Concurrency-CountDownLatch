package com.santhosh.concurrency;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {

	private CountDownLatch latch;
	private String[] items;

	public FoodProcessor(CountDownLatch latch, String[] items) {

		this.latch = latch;
		this.items = items;
	}

	@Override
	public void run() {

		for (int i = 0; i < items.length; i++) {
			try {
				System.out.println("Before food preparation of item " + items[i] + " and count is :" + latch.getCount());
				Thread.sleep(5000);
				latch.countDown();
				System.out.println("Food prepared for item " + items[i] + " and count is :" + latch.getCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
