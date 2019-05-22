package com.doj.batch.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Dinesh Rajput
 *
 */
public class DataJaxbAdapter extends XmlAdapter<String, Date>{
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Date unmarshal(String date) throws Exception {
		return dateFormat.parse(date);
	}

	@Override
	public String marshal(Date date) throws Exception {
		return dateFormat.format(date);
	}

}
