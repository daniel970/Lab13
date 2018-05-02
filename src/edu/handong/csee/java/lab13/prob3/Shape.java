package edu.handong.csee.java.lab13.prob3;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public abstract class Shape { //abstract class Shape
	public abstract double area();//create abstract double area
	public abstract double perimeter();//create abstract double perimeter
	
	public void display()//display method
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n");//print area and perimeter
	}

}
