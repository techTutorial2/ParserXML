package example.java.xml.parser.util;

public interface Converter {
	public abstract String asXml(Object obj);
	public abstract Object asObject(String s);
}
