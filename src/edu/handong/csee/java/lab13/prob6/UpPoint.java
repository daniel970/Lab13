package edu.handong.csee.java.lab13.prob6;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */


public class UpPoint implements CapitalPrint {//class UpPoint implements CapitalPrint
	private int x, y; //create private int value x and y

	UpPoint(int x, int y){this.x = x; this.y = y;}//get x and y value

	public String toString()//method toString which will return string
	{
		return "x : " + x + " y : " + y;//return x and y value
	}


}
