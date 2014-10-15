package test;
import java.io.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String url = "\"http://115.29.184.142:81/weixin-image/tmp/20140915/0a6fa815fefe4cd2a7311089d6e9b264/0\""; 
		System.out.println(url.indexOf("/0")); 
		System.out.println(url); 
		String url1 = url.replaceAll("\\/0\"", "\\/0_640x480\""); 
		System.out.println(url1);
		System.out.println("\\/0");
	}}
