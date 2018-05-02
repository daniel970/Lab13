package edu.handong.csee.java.lab13.prob3;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class Rectangle extends Shape{//class Rectangle extends Shape
	private double length;//create double value length
	private double width;//create double value width
	
	public Rectangle(double length, double width)//method Rectangle
	{
		this.length = length;//save length value
		this.width = width;//save width value
	}
	public double area()//area method
	{
		return length * width; //return area value
	}
	public double perimeter()//perimeter method
	{
		return 2*(length+width);//return perimeter value
	}
	public double get_Length()//method get_length
	{
		return length;//return length
	}
	public double get_Width()//method get_Widt
	{
		return width;//return width
	}

}
