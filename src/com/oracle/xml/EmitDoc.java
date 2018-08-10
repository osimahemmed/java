package com.oracle.xml;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class EmitDoc {

	
	public static void main(String[] args)throws Exception {
		
		File xmlfile = new File("C:\\xmldata\\docfile.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlfile);
		new EmitDoc().emit(doc);	

	}
	
	public void emit(Document doc)throws Exception{
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "publicId");
		t.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "systemId");
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		DOMSource source = new DOMSource(doc);
		t.transform(source, result);
		String XString = writer.toString();
		
		System.out.println(XString);
		
	}

}
