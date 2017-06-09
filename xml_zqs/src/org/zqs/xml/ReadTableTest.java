package org.zqs.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.jaxen.XPath;

/**
 * @author Administrator
 *
 */
public class ReadTableTest {


	public static void main(String[] args) throws Exception {
	  Document doc = new SAXReader().read(new File("./src/personList.html"));
	  
	  String title = ((Element)doc.selectSingleNode("//title")).getText();
	  System.out.println(title);
	  
	  List<Element> list =  (List<Element>)doc.selectNodes("//tbody/tr");
	  Element tr1Elem =  (Element)doc.selectSingleNode("//thead/tr");
	  for (Element elem : list) {
		String id = ((Element) elem.elements().get(0)).getText();
		String name = ((Element) elem.elements().get(1)).getText();
		String sex = ((Element) elem.elements().get(2)).getText();
		String age = ((Element) elem.elements().get(3)).getText();
		String address = ((Element) elem.elements().get(4)).getText();
		String phone = ((Element) elem.elements().get(5)).getText();
		
		String str = ((Element)tr1Elem.elements().get(0)).getText()+":"+id+" "+
		             ((Element)tr1Elem.elements().get(1)).getText()+":"+name+" "+
			    	 ((Element)tr1Elem.elements().get(2)).getText()+":"+sex+" "+
		             ((Element)tr1Elem.elements().get(3)).getText()+":"+age+" "+
			    	 ((Element)tr1Elem.elements().get(4)).getText()+":"+address+" "+
		             ((Element)tr1Elem.elements().get(5)).getText()+":"+phone;
		System.out.println(str);
	}
	  
	}

}
