 package org.zqs.xml;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DocumentCreate {

	public static void main(String[] args) throws Exception {
		
		Document doc = DocumentHelper.createDocument();//这里DocumentHelper
		                                               //OutputFormat
		//OutputFormat format = OutputFormat.createCompactFormat();//紧凑格式，适合项目上线
		OutputFormat format = OutputFormat.createPrettyPrint();//适合开发者调试的漂亮格式
		format.setEncoding("utf-8");
		
		
		Element nodeEle = doc.addElement("contactList");
		Element con = nodeEle.addElement("contact");
		con.addAttribute("id", "001");
		con.addAttribute("id", "004");//通过添加属性来修改属性值
		con.addElement("name").addText("詹桥松");
		con.addElement("iphone").addText("15005183668");
		con.addElement("email").addText("874431856@qq.com");
		nodeEle.addElement("contact").addAttribute("id", "002");
	    
	
		FileOutputStream  out = new FileOutputStream("e:/contact.xml");//设置输出路径
		XMLWriter writer = new XMLWriter(out,format);
		writer.write(doc);
		

	}

}
