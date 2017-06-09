package org.zqs.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MyDefaultHander2 extends DefaultHandler {
	private StringBuffer str = new StringBuffer();
	public String getContent(){
		return str.toString();
	}
   
    @Override
    public void startDocument() throws SAXException {
    	
    }
  
    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(String uri, String localName, String qName,
    		Attributes attributes) throws SAXException {
    	   str.append("<"+qName);  
    	   if(attributes!=null){
    		   for(int i=0;i<attributes.getLength();i++){
    			   String attrName = attributes.getQName(i);
    			   String attrValue = attributes.getValue(i);
    			   str.append(" "+attrName+"=\""+attrValue+"\"");
    		   }  
        	   }       
    	   str.append(">");
    }
    
    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void endElement(String uri, String localName, String qName)
    		throws SAXException {
 	        str.append("</"+qName+">");
    }
    
    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
     */
    @Override
    public void characters(char[] ch, int start, int length)
    		throws SAXException {
 	   str.append(new String(ch,start,length));}
    
    @Override
    public void endDocument() throws SAXException {
    }
}
