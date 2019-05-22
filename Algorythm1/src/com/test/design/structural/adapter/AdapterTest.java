package com.test.design.structural.adapter;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testObjectAdapter();
		testClassAdapter();

	}
	
	private static void testObjectAdapter(){
		SocketAdapter adapter = new SocketAdapterObjectImpl();
		Volt v3 = getVolt(adapter, 3);
		Volt v12 = getVolt(adapter, 12);
		Volt v120 = getVolt(adapter, 120);
		
		System.out.println("v3 volts using Object  Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object  Adapter="+v12.getVolts());
        System.out.println("v120 volts using Object  Adapter="+v120.getVolts());
		
	}
	
	private static void testClassAdapter(){
		SocketAdapter adapter = new SocketAdapterClassImpl();
		Volt v3 = getVolt(adapter, 3);
		Volt v12 = getVolt(adapter, 12);
		Volt v120 = getVolt(adapter, 120);
		
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
		
	}
	
	private static Volt getVolt(SocketAdapter socket, int volt) {
		
		switch(volt){
			case 3: return socket.get3Volts();
			case 12: return socket.get12Volts();
			case 120: return socket.get120Volts();
			default : return socket.get120Volts();
		}
	}

}
