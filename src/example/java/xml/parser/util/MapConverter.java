package example.java.xml.parser.util;

import java.util.Map;

public interface MapConverter extends Converter {
	public abstract String asXml(Map map);
	public abstract Map asMap(String s);
}
