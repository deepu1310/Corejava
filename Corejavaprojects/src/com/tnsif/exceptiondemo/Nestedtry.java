package com.tnsif.exceptiondemo;
//nested demo
public class Nestedtry {
public static void check() {
	String str="TNS";
	int slength=str.length();
	System.out.println("string length"+slength);
	String anotherstring=null;
	int y=6;
	try {
		try {
			System.out.println(str.charAt(y)); //location of character search
			
		}
		catch(StringIndexOutOfBoundsException ex)
		{
		System.out.println("indexout of bound exception "+ex.getMessage());
	}
	System.out.println("string length "+anotherstring.length());
}
catch(NullPointerException npe) {
	System.out.println("exception is thrown "+npe.getMessage());
}
}
}
