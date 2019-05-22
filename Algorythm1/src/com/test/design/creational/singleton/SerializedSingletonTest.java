package com.test.design.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			SerializedSingleton instance = SerializedSingleton.getInstance();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			oos.writeObject(instance);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.ser"));
			SerializedSingleton second = (SerializedSingleton) ois.readObject();
			ois.close();
			
			
			System.out.println(" instance hasd code = " + instance.hashCode());
			System.out.println(" second hasd code = " + second.hashCode());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
