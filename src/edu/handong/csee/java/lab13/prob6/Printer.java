package edu.handong.csee.java.lab13.prob6;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class Printer {//class printer
	public static void print(Object object)//print method takes Object object
	{
		String str = object.toString();//create str which will change object value into string
		if(object instanceof CapitalPrint)//if object is instance in CapitalPring
			str = str.toUpperCase();//change str toUpperCase
		System.out.println(str);//print str value
	}

}
