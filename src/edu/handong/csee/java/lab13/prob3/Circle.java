package edu.handong.csee.java.lab13.prob3;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class Circle extends Shape{//class Circle extends Shape
	private double radius;
	
	public Circle(double r)//method Circle
	{
		radius = r;//save radius value with r
	}
	public double area()//area method
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r, equation for area
	}
	public double perimeter()//perimeter method
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius, equation for perimeter
	}
	public double get_Radius()//get_Radius method
	{
		return radius; //send radius method
	}

}	
