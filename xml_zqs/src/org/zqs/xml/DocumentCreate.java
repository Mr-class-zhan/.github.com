 package org.zqs.xml;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DocumentCreate {

	public static void main(String[] args) throws Exception {
		
		Document doc = DocumentHelper.createDocument();//����DocumentHelper
		                                               //OutputFormat
		//OutputFormat format = OutputFormat.createCompactFormat();//���ո�ʽ���ʺ���Ŀ����
		OutputFormat format = OutputFormat.createPrettyPrint();//�ʺϿ����ߵ��Ե�Ư����ʽ
		format.setEncoding("utf-8");
		
		
		Element nodeEle = doc.addElement("contactList");
		Element con = nodeEle.addElement("contact");
		con.addAttribute("id", "001");
		con.addAttribute("id", "004");//ͨ������������޸�����ֵ
		con.addElement("name").addText("ղ����");
		con.addElement("iphone").addText("15005183668");
		con.addElement("email").addText("874431856@qq.com");
		nodeEle.addElement("contact").addAttribute("id", "002");
	    
	
		FileOutputStream  out = new FileOutputStream("e:/contact.xml");//�������·��
		XMLWriter writer = new XMLWriter(out,format);
		writer.write(doc);
		

	}

}
