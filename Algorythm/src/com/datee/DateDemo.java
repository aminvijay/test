package com.datee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		    Date myDate = new Date();
		    System.out.println(myDate);

		    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM/dd/yyyy");
		    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
		    
		    SimpleDateFormat mdyFormat1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		    String dmy1 = mdyFormat1.format(myDate);
		    System.out.println("dmy1 = " + dmy1);

		    // Format the date to Strings
		    String mdy = mdyFormat.format(myDate);
		    String dmy = dmyFormat.format(myDate);

		    // Results...
		    System.out.println(mdy);
		    System.out.println(dmy);
		    // Parse the Strings back to dates
		    // Note, the formats don't "stick" with the Date value
		    System.out.println(mdyFormat.parse(mdy));
		    System.out.println(dmyFormat.parse(dmy));
		} catch (Exception exp) {
		    exp.printStackTrace();
		}

	}

}
