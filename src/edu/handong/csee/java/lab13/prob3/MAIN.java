package edu.handong.csee.java.lab13.prob3;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

import java.util.Scanner; //import scanner

public class MAIN {// main class
	public static void main(String[] args) {//main method

		double n1, n2; //create double value n1, n2
		Scanner keyboard = new Scanner(System.in); //create new scanner

		System.out.print("Enter radius: ");//print out instruction
		n1 = keyboard.nextDouble(); //save the user input to scanner
		Circle c1 = new Circle(n1);//create object c1 putting n1 value

		System.out.println("Radius: "+ c1.get_Radius());//print radius of circle
		c1.display();//use display method with object c1

		System.out.print("Enter length and width: ");//print instruction
		n1 = keyboard.nextDouble(); //save the first input in n1
		n2 = keyboard.nextDouble();//save the second input in n2
		Rectangle r1 = new Rectangle(n1, n2);//create new object r1 using n1, n2

		System.out.println("Length: "+ r1.get_Length());//print length
		System.out.println("Width: "+ r1.get_Width());//print  width
		r1.display();//use display method with object r1
		
		keyboard.close();
		}

}
