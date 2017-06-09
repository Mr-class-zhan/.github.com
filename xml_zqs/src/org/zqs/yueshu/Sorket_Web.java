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
		ServerSocket server = new ServerSocket(3000);//创建ServerSocket
		Socket client = server.accept();//接收客户的连接
        FileInputStream in = new FileInputStream(new File("E:/学习工具/java/workspace/xml_zqs/src/contact.xml"));//得到文件
        
        OutputStream out = client.getOutputStream();
        
	    byte[] temp = new byte[1024];//一段一段的读
	    int len = 0;
	    while((len = in.read(temp))!=-1){
	    	out.write(temp, 0, len);
	    }
       if(InetAddress.getLocalHost().isReachable(3000)) System.out.println("本地地址已经到达");
	    out.close();
	    in.close();
	   }

}
