package org.zqs.xml;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Dom4j_read {
 public static void main(String args []){
		try{
			SAXReader reader = new SAXReader();
		    Document doc =  reader.read(new File("./src/contact.xml"));
			System.out.println(doc);
		}catch(DocumentException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
 }
}