package example.java.xml.parser.jaxb.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;

//adapts the Date/LocalDate objects by implementing the XmlAdapter interface for marshal and unmarshal
//public class DateAdapter extends XmlAdapter<String, LocalDate> {
public class DateAdapter extends XmlAdapter<String, Date> {
	// Overrides the unmarshal method of the class XmlAdapter in order to 
	// parse a date string of the type Date/LocalDate object
	/*public LocalDate unmarshal(String date) throws Exception {
		return LocalDate.parse(date);
	}*/
	public Date unmarshal(String date) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		return dateFormat.parse(date);
		// return Date.parse(date);
	}

	// Overrides the marshal method of the class XmlAdapter in order to 
	// convert the date object to an String
	// public String marshal(LocalDate date) throws Exception {
	public String marshal(Date date) throws Exception {
		return date.toString();
	}
}
