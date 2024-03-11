package com.training.demo;

import com.training.demo.model.DataStructure;

public class Main {
	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		DataStructure ds = new DataStructure(numbers);
        ds.printEven();
	}
}
