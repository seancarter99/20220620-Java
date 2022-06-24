package com.skillstorm.week1.day5;

import java.util.concurrent.LinkedBlockingQueue;

/*
 * Thread states
 * 
 * 1. NEW (Created, but not yet started new Thread())
 * 2. RUNNABLE (Thread has started, but is eligible to be given control)
 * 3. BLOCKED (Thread is waiting on some mutex/lock before continuing)
 * 4. WAITING (join(). Thread waiting indefinitely)
 * 5. TIMED_WAITING (join(1000). Wait, but after 1000 seconds give up if it isn't done yet)
 * 6. TERMINATED (Thread has finished execution)
 */

// ProducerConsumer is a way of having two separate threads working in tandem
public class ProducerConsumer {

	public static void main(String[] args) {
		LinkedBlockingQueue<String> expo = new LinkedBlockingQueue<>(10);
		Chef chef1 = new Chef(expo, "Mitch", "Calamari", 7000);
		Chef chef2 = new Chef(expo, "Shawn", "New York Strip", 9000);
		Chef chef3 = new Chef(expo, "Atul", "Cacio e bepe", 3000);
		
		Waiter joe = new Waiter(expo, "Joe", 6000);
		
		Thread t1 = new Thread(chef1);
		Thread t2 = new Thread(chef2);
		Thread t3 = new Thread(chef3);
		Thread t4 = new Thread(joe);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Chef implements Runnable {

	// When a chef completes cooking, add the item to the expo
	LinkedBlockingQueue<String> expo; 
	private String name;
	private String dish;
	private int cookTime;
	
	public Chef() {
		
	}
	
	public Chef(LinkedBlockingQueue<String> expo, String name, String dish, int cookTime) {
		super();
		this.expo = expo;
		this.name = name;
		this.dish = dish;
		this.cookTime = cookTime;
	}

	public LinkedBlockingQueue<String> getExpo() {
		return expo;
	}

	public void setExpo(LinkedBlockingQueue<String> expo) {
		this.expo = expo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(cookTime);
				expo.put(dish); // Blocking operation if the queue is full
				System.out.println(name + " finished cooking " + dish);
				System.out.println("Amount of items on the expo: " + expo.size());
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

class Waiter implements Runnable {

	LinkedBlockingQueue<String> expo;
	private String name;
	private int deliveryTime;
	
	public Waiter() {
		
	}
	
	public Waiter(LinkedBlockingQueue<String> expo, String name, int deliveryTime) {
		super();
		this.expo = expo;
		this.name = name;
		this.deliveryTime = deliveryTime;
	}

	public LinkedBlockingQueue<String> getExpo() {
		return expo;
	}

	public void setExpo(LinkedBlockingQueue<String> expo) {
		this.expo = expo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String dish = expo.take(); // If the expo is empty, wait
				System.out.println(name + " is now delivering " + dish);
				Thread.sleep(deliveryTime);
			} catch (InterruptedException e) {
				
			}
		} 
	}
	
}
