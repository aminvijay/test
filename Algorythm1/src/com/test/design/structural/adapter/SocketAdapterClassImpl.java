package com.test.design.structural.adapter;

public class SocketAdapterClassImpl extends Socket implements SocketAdapter {

	//Using inheritance for adapter pattern
	@Override
	public Volt get120Volts() {
		return getVolts();
	}

	@Override
	public Volt get12Volts() {
		Volt v = getVolts();
		return convertVolts(v, 10);
	}

	@Override
	public Volt get3Volts() {
		Volt v = getVolts();
		return convertVolts(v, 40);
	}
	
	public Volt convertVolts(Volt v, int no){
		return new Volt(v.getVolts()/no);
	}

}
