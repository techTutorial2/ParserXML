package example.java.xml.parser.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProductDtoConverter implements Converter, Serializable {
	public String asXml(Object o){
		//error
		ProductDto dto = (ProductDto) productDtoClass.cast(o);
		return dto.asXml();
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
