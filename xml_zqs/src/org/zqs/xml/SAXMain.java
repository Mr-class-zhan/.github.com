/**
 * 
 */
package org.zqs.xml;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * @author Mr_Zhan
 *
 */
public class SAXMain {

	public static void main(String[] args) throws Exception {
     SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
     parser.parse(new File("./src/contact.xml") ,new MyDefaultHander());

	}

}
