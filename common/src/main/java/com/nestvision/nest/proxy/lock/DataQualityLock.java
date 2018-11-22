package com.nestvision.nest.proxy.lock;

import java.util.concurrent.locks.ReentrantLock;

public class DataQualityLock {
	private static long timeIncrement = 0;
	
	private static  ReentrantLock myLock = new ReentrantLock();
	
	public static long getTimeIncrement(){
		synchronized (DataQualityLock.class) {
			timeIncrement += 3;
			return timeIncrement;
		}
	}
	
	public static void lock(){
		myLock.lock();
	}
	
	public static void unlock(){
		myLock.unlock();
	}
	
	public static void setTimeIncrement(Long time){
		DataQualityLock.timeIncrement = time;
	}
}
