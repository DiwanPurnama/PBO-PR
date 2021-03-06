/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Windows 10
 */
public class CoffeeMachine extends Thread {

	static String coffeeMade = null;
	static final Object lock = new Object();
	private static int coffeeNumber = 1;

	void makeCoffee() {
		synchronized (CoffeeMachine.lock) {
			if (coffeeMade != null) {
				try {
					System.out.println("Coffee machine: Waiting for waiter "
                                                + "notification to deliver the coffee");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			coffeeMade = "Coffee No. " + coffeeNumber++;
			System.out.println("Coffee machine says: Made " + coffeeMade);
			// once coffee is ready, notify the waiter to pick it up
			CoffeeMachine.lock.notifyAll();
			System.out.println("Coffee machine: Notifying waiter to pick the coffee ");
		}
	}

	public void run() {
		while (true) {
			makeCoffee();
			try {
				System.out.println("Coffee machine: Making another coffee now");
				// simulate the time taken to make a coffee by calling sleep method
				Thread.sleep(10000);
			} catch (InterruptedException ie) {
				// its okay to ignore this exception
				// since we're not using thread interrupt mechanism
				ie.printStackTrace();
			}
		}
	}
}
