package org.zqs.yueshu;

import java.net.InetAddress;
class InetDemo 
{
	public static void main(String[] args) throws Exception{
		InetAddress local = InetAddress.getLocalHost() ;
        //InetAddress remaddress = InetAddress.getByName("http://www.mldnjava.cn/") ;
        System.out.println("本机地址"+local.getHostAddress());
		//System.out.println("远程地址"+remaddress.getHostAddress());
        //System.out.println("远程地址能否到达:"+remaddress.isReachable(3000));
        System.out.println("本地地址能否到达:"+local.isReachable(3000));
	}
}
