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
		stuElem1.addElement("name").addText("����");
		stuElem1.addElement("gender").addText("��");
		stuElem1.addElement("grade").addText("�����һ��");
		stuElem1.addElement("address").addText("�������");
		
		Element stuElem2 = elem.addElement("Student");
		stuElem2.addAttribute("id", "2");
		stuElem2.addElement("name").addText("����");
		stuElem2.addElement("gender").addText("Ů");
		stuElem2.addElement("grade").addText("���������");
		stuElem2.addElement("address").addText("����Խ��");
		
		//�޸�
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
