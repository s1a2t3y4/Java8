package com.example.javase8;

import com.example.javase8.interfaces.Simpleinterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		Simpleinterface obj= () -> System.out.println("say something");
		obj.doSomething();
 }

}
