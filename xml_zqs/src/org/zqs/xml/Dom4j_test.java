package org.zqs.xml;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class Dom4j_test {
	@Test
	public void generateNewXml() throws Exception{
		Document doc = DocumentHelper.createDocument();
		OutputFormat format = OutputFormat.createPrettyPrint(); 
		Element elem = doc.addElement("Students");
		Element stuElem1 = elem.addElement("Student");
		
		stuElem1.addAttribute("id", "1");
		stuElem1.addElement("name").addText("张三");
		stuElem1.addElement("gender").addText("男");
		stuElem1.addElement("grade").addText("计算机一班");
		stuElem1.addElement("address").addText("广州天河");
		
		Element stuElem2 = elem.addElement("Student");
		stuElem2.addAttribute("id", "2");
		stuElem2.addElement("name").addText("李四");
		stuElem2.addElement("gender").addText("女");
		stuElem2.addElement("grade").addText("计算机二班");
		stuElem2.addElement("address").addText("广州越秀");
		
		//修改
	    Element	stuEleid2 = (Element)doc.getRootElement().elements().get(1);
	    stuEleid2.element("name").detach();
	    
	    //stuEleid2.detach();
	    stuEleid2.getParent().remove(stuEleid2);
		
		//FileOutputStream out = new FileOutputStream("./src/students.xml");
		FileOutputStream out = new FileOutputStream("e:/students.xml");
		XMLWriter writer = new XMLWriter(out,format);
		writer.write(doc);
		
	}

}
