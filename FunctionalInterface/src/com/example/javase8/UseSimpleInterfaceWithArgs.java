package com.example.javase8;

import com.example.javase8.interfaces.InterfaceWithArgs;
import com.example.javase8.interfaces.Simpleinterface;

public class UseSimpleInterfaceWithArgs {

	public static void main(String[] args) {
		InterfaceWithArgs obj= (v1,v2) ->{ 
			int result=v1*v2;
			System.out.println("result:" +result );};
			obj.multiply(3, 4);
		 
 }

}
