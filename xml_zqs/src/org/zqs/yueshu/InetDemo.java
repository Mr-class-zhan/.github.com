package org.zqs.yueshu;

import java.net.InetAddress;
class InetDemo 
{
	public static void main(String[] args) throws Exception{
		InetAddress local = InetAddress.getLocalHost() ;
        //InetAddress remaddress = InetAddress.getByName("http://www.mldnjava.cn/") ;
        System.out.println("������ַ"+local.getHostAddress());
		//System.out.println("Զ�̵�ַ"+remaddress.getHostAddress());
        //System.out.println("Զ�̵�ַ�ܷ񵽴�:"+remaddress.isReachable(3000));
        System.out.println("���ص�ַ�ܷ񵽴�:"+local.isReachable(3000));
	}
}
