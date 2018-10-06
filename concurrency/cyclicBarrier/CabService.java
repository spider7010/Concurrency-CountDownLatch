package com.santhosh.concurrency.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {

	private CyclicBarrier cyclicBarrier;

	public CabService(CyclicBarrier cyclicBarrier) {
		super();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has arrived");
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("All passangers are arrived and cab starting now.");
	}

}
