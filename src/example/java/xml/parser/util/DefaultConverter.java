package example.java.xml.parser.util;

public class DefaultConverter implements Converter {
	public DefaultConverter() {
	}

	public Object asObject(String xml) {
		return xml;
	}
	
	public String asXml(Object object){
		return (new StringBuilder()).append("<object>").append(object).append("<object>").toString();
	}
}
