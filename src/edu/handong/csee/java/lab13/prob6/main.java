package edu.handong.csee.java.lab13.prob6;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class main {//class main
	public static void main(String[] args) {//method main
		UpPoint p1 = new UpPoint(3,3);//create new object p1
		DownPoint p2 = new DownPoint(2,5);//create new object p2
		DownPoint p3 = new DownPoint(4,7);//create new object p3
		UpPoint p4 = new UpPoint(9,12);//create new object p4
		
		Printer.print(p1);//bring print method from class Printer using p1
		Printer.print(p2);//bring print method from class Printer using p2
		Printer.print(p3);//bring print method from class Printer using p3
		Printer.print(p4);//bring print method from class Printer using p4
	}

}	
