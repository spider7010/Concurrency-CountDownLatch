/**
 * 
 */
package com.santhosh.concurrency.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Santhosh Surimani
 *
 */
public class CyclicBarrierEx {

	public static void main(String[] args) throws Exception {

		CyclicBarrier barrier = new CyclicBarrier(3);

		Thread t1 = new Thread(new CabService(barrier));
		t1.setName("Passanger1");
		t1.start();
		Thread.sleep(5000);

		Thread t2 = new Thread(new CabService(barrier));
		t2.setName("Passanger2");
		t2.start();
		Thread.sleep(5000);

		Thread t3 = new Thread(new CabService(barrier));
		t3.setName("Passanger3");
		t3.start();
		Thread.sleep(5000);

		Thread t4 = new Thread(new CabService(barrier));
		t4.setName("Passanger4");
		t4.start();
		Thread.sleep(5000);

		Thread t5 = new Thread(new CabService(barrier));
		t5.setName("Passanger5");
		t5.start();
		Thread.sleep(5000);

		Thread t6 = new Thread(new CabService(barrier));
		t6.setName("Passanger6");
		t6.start();
		Thread.sleep(5000);
	}
}
