/**
 * 
 */
package com.mycompany.expgit2.chapter1;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Paul Jerchaflie
 *
 */
public class MyClass {
	private String name;
	private String lastName;
	
	public MyClass(String name){
		this.setName(name);	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN");
		staticMethod("input");
		System.out.println("END");
	}
	
	public static void staticMethod(String inp){
		System.out.println("Hi, input is "+inp);
		System.out.println("Bye");
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
