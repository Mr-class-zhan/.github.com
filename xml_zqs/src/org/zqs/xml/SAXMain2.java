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
public class SAXMain2 {

	public static void main(String[] args) throws Exception {
     SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        MyDefaultHander2 hander = new MyDefaultHander2();
        parser.parse(new File("./src/contact.xml") ,hander);
        String content = hander.getContent();
        System.out.println(content);

	}

}
