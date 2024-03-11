package com.training.demo.model;

import java.util.Arrays;
import java.util.Iterator;

public class DataStructure {
	private final static int SIZE = 15;
	private int[] arrayOfInts;
	
	{this.arrayOfInts=new int[SIZE];}
	
	public DataStructure() {
		super();
	}

	public DataStructure(int[] arrayOfInts) {
		super();
		this.arrayOfInts = arrayOfInts;
	}

	public int[] getArrayOfInts() {
		return arrayOfInts;
	}

	public void setArrayOfInts(int[] arrayOfInts) {
		this.arrayOfInts = arrayOfInts;
	}

	@Override
	public String toString() {
		return "DataStructure [arrayOfInts=" + Arrays.toString(arrayOfInts) + "]";
	}

//	interface which allows to iterate over multiple elements 
	interface DatastructureIterator extends Iterator<Integer>{}
	
	private class EventIterator implements DatastructureIterator{
		 private int nextIndex = 0;	
		@Override
		public boolean hasNext() {
		
			return (nextIndex<=SIZE-1);//01234-True 5->false
		}

		@Override
		public Integer next() {
			Integer nextValue=Integer.valueOf(arrayOfInts[nextIndex]);
//			nextIndex+=2;//incr by 2
			nextIndex++;
			return nextValue;
		}
		
	}
	public void printEven() {
			
			DatastructureIterator iterator=this.new EventIterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");
			}
			
	}
	
}
