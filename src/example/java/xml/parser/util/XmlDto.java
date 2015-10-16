package example.java.xml.parser.util;

import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

//added JAR (spring-oxm-tiger-1.5.8.jar) just to remove compilation error
import org.springframework.oxm.xstream.AnnotationXStreamMarshaller;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;

public class XmlDto implements Serializable {
	private static final long serialVersionUID = -123456789L;
	
	protected AnnotationXStreamMarshaller getMarshaller(){
		AnnotationXStreamMarshaller m = new AnnotationXStreamMarshaller();
		m.setAnnotatedClass(this.getClass());
		return m;
	}

	public String asXml(){
		StringWriter writer = new StringWriter();
		Result result = new StreamResult(writer);
		try{
			//error
			getMarshaller().marshal(this,result);
		} catch(Exception e){
			e.printStackTrace();
		}
		return writer.toString();
	}
	
	public Document asDocument(){
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//error
			return builder.parse(new InputSource(new StringReader(asXml())));
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public XmlDto asObject(String xml){
		try{
			//error
			Object o = this.getMarshaller().unmarshal(new StreamSource(new StringReader(xml)));
			XmlDto dto = (XmlDto)o;
			return dto;
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
}
