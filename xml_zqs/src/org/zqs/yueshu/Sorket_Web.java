/**
 * 
 */
package org.zqs.yueshu;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 *
 */
public class Sorket_Web {


	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(3000);//����ServerSocket
		Socket client = server.accept();//���տͻ�������
        FileInputStream in = new FileInputStream(new File("E:/ѧϰ����/java/workspace/xml_zqs/src/contact.xml"));//�õ��ļ�
        
        OutputStream out = client.getOutputStream();
        
	    byte[] temp = new byte[1024];//һ��һ�εĶ�
	    int len = 0;
	    while((len = in.read(temp))!=-1){
	    	out.write(temp, 0, len);
	    }
       if(InetAddress.getLocalHost().isReachable(3000)) System.out.println("���ص�ַ�Ѿ�����");
	    out.close();
	    in.close();
	   }

}
