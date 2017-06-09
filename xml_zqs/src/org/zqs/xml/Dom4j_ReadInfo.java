package org.zqs.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4j_ReadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//@Test
	public void test1() throws DocumentException{
		SAXReader reader = new SAXReader();
	    Document doc =  reader.read(new File("./src/contact.xml"));
	    Iterator<Node> ite = doc.nodeIterator();
	    while(ite.hasNext()){
	    	Node node = ite.next();
	    	String str = node.getName();
	    	System.out.print(str+"[");
		    //只有标签结点才有子结点
	    	if(node instanceof Element){
		    Iterator<Node> ite2 = ((Element)node).nodeIterator();
			    while(ite2.hasNext()){
			    	Node node2 = ite2.next();
			    	String str2 = node2.getName();
			    	if(str2!=null){
			    	System.out.print(str2+" ");
			    	}
			    }
	    	System.out.println("]");
	        }
	     }
	    
	}
	 @Test
		public void test2() throws DocumentException{
			SAXReader reader = new SAXReader();
		    Document doc =  reader.read(new File("./src/contact.xml"));
		    Element nodeElem  = doc.getRootElement();
		    getChildren(nodeElem,0);
	    }
	    public void getChildren(Element elem,int i){
	    	for(int j=0;j<i;j++){
	        	System.out.print("|-");
	        	}
	    	System.out.print(elem.getName());
			if(elem.attribute(0) instanceof Attribute){
				System.out.print(":属性："+elem.attribute(0).getName()+"="+elem.attribute(0).getValue());
			}
			if(elem.getText()!=" "){
				System.out.println(",文本："+elem.getTextTrim());
			}
	    	i++;
	    	Iterator<Node> ite = elem.nodeIterator();
	    	while(ite.hasNext()){
	    		Node node = ite.next();
	    		if(node instanceof Element){
	    			getChildren((Element)node,i);
	    		}
	    	}
	    }
	  
	    @Test
	    public void test() throws Exception{
			SAXReader reader = new SAXReader();
		    Document doc =  reader.read(new File("./src/contact.xml"));
		    StringBuffer sb = new StringBuffer();
		    Element nodeElem = doc.getRootElement();
		    getChildrenNodes(nodeElem,sb);
		    System.out.println(sb.toString());
	    }
	    
	    private void getChildrenNodes(Element elem,StringBuffer sb){
	    	sb.append("<"+elem.getName());
	    	List<Attribute> attrs = elem.attributes();
	    	if(attrs!=null){
	    		for(Attribute attr:attrs){
		    		sb.append(" "+attr.getName()+"=\""+attr.getValue()+"\"");   
	    	         }
	    	}  
	    	sb.append(">");
	    	
	    	Iterator<Node> ite = elem.nodeIterator();
            while(ite.hasNext()){
            	Node node = ite.next();
            	if(node instanceof Element){
	    		   getChildrenNodes((Element)node,sb);
            	}
            	
            	if(node instanceof Text){
            		Text text = (Text)node;
            		sb.append(text.getText());
            	}
            	
            }

	    	sb.append("</"+elem.getName()+">");
	    }
/*		public void test3() throws DocumentException{
			SAXReader reader = new SAXReader();
		    Document doc =  reader.read(new File("./src/contact.xml"));
		    Element nodeElem  = doc.getRootElement();
		    getChildren2(nodeElem);
	    }
	    public void getChildren2(Element elem){
	    	System.out.print("<"+elem.getName());
			if(elem.attribute(0) instanceof Attribute){
				System.out.print(" "+elem.attribute(0).getName()+"=\""+elem.attribute(0).getValue()+"\"");
			}
	    	System.out.print(">");
			if(elem.getText()!=" "){
				System.out.print(""+elem.getTextTrim());
			}
	    	Iterator<Node> ite = elem.nodeIterator();
	    	while(ite.hasNext()){
	    		Node node = ite.next();
	    		if(node instanceof Element){
	    			getChildren2((Element)node);
	    		}
	    	}
	   System.out.println("</"+elem.getName()+">");
	    }*/
}
