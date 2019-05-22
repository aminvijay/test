import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class DateTest {
	
	public static void main(String[] args) {
		
		GregorianCalendar currentDate = getCurrentGMTTime();
		
		GregorianCalendar itemEndDate = getSpecificGMTTime();
		
		if(itemEndDate.after(currentDate)) {
			System.out.println(" yyyyyyyyyyy " + currentDate + " " + itemEndDate);
		}else {
			System.out.println(" nnnnnnnnnnnnnn ");
		}
		 
		
		
		
	}
	
	public static GregorianCalendar getCurrentGMTTime(){
		GregorianCalendar cal = (GregorianCalendar)GregorianCalendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		cal.setTime(new Date());
		return cal;
	}
	
	public static GregorianCalendar getSpecificGMTTime(){
		
		String year  = "2016";
		String month = "04";
		String day   = "29";
		 
		 GregorianCalendar newGregCal = new GregorianCalendar(
			     Integer.parseInt(year),
			     Integer.parseInt(month) - 1,
			     Integer.parseInt(day)
			 );
		 
		 newGregCal.setTimeZone(TimeZone.getTimeZone("GMT"));
		 
		
		return newGregCal;
	}

}
