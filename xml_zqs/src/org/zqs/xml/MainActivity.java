/**
 * 
 */
package org.zqs.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Mr_class_zhan
 *
 */
public class MainActivity {

	public static void main(String[] args) throws DocumentException {
    List<Contact> list = new ArrayList<>();
    SAXReader reader = new SAXReader();
    Document doc = reader.read(new File("./src/contact.xml"));
    Iterator<Element> ite= doc.getRootElement().elementIterator();
    while(ite.hasNext()){
    	Element elem = ite.next();
    	Contact con = new Contact();
    	con.setId(elem.attributeValue("id"));
    	con.setName(elem.elementText("name"));
    	con.setAge(elem.elementText("age"));
    	con.setPhone(elem.elementText("phone"));
    	con.setEmail(elem.elementText("email"));
    	con.setQq(elem.elementText("qq"));
    	list.add(con);
    }
   for (Contact cons : list) {
	  System.out.println(cons.toString());
    }
	}

}
