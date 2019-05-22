package com.test.design.structural.adapter;

public class SocketAdapterObjectImpl implements SocketAdapter {

	//Using Composition for adapter pattern
	
	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volts() {
		// TODO Auto-generated method stub
		return socket.getVolts();
	}

	@Override
	public Volt get12Volts() {
		Volt v = socket.getVolts();
		return convertVolts(v,10);
	}

	@Override
	public Volt get3Volts() {
		Volt v = socket.getVolts();
		return convertVolts(v,40);
	}
	
	private Volt convertVolts(Volt v, int no){
		return new Volt(v.getVolts()/no);
	}
}
