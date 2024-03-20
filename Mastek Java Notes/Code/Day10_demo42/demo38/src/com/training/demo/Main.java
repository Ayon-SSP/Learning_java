package com.training.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		//before jdk1.5
		Collection c=new ArrayList();
		c.add(1);
		c.add("string");
		c.add(12.34f);
		c.add(12.34);
		c.add(true);
		
		System.out.println(c);
		
		//After jdk1.5
		Collection<String> c_jdk5=new ArrayList<String>();
//		c_jdk5.add(1);
		c_jdk5.add("string");
//		c_jdk5.add(12.34f);
//		c_jdk5.add(12.34);
//		c_jdk5.add(true);
		
		System.out.println(c_jdk5);
		
		//After jdk1.7
		Collection<String> c_jdk7=new ArrayList<>();
		System.out.println(c_jdk7);
		c_jdk7.add("Some String");
		System.out.println(c_jdk7);
		
	}

}
