package com.oracle.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//import sun.rmi.runtime.GetThreadPoolAction;

public class ReadFile {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] argv) throws ParserConfigurationException, SAXException, IOException {
		
		try{
			File filename = new File("C:\\xmldata\\details.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filename);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			
			NodeList nlist = doc.getElementsByTagName("staff");
			System.out.println("-----------------lenght " +nlist.getLength());
			
			for(int temp=0;temp<=nlist.getLength();temp++){
				
				Node nNode = nlist.item(temp);
				System.out.println("get result");
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					System.out.println("test 1");
					Element element = (Element)nNode;
					System.out.println("First Name : "+getTagValue("firstname",element));
					System.out.println("Last Name : "+getTagValue("lastname",element));
					System.out.println("Nick Name : "+getTagValue("nickname",element));
					System.out.println("Salary : "+getTagValue("salary",element));
					System.out.println("test 2");
				}
			}
		

	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	}
	private static String getTagValue(String tagname,Element element){
		
		NodeList nlList= element.getElementsByTagName(tagname).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0); 
		return nValue.getNodeValue();
	}
}
