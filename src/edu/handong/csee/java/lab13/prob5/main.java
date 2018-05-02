package edu.handong.csee.java.lab13.prob5;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */


import java.util.Scanner;//import scanner

public class Main {//main class
	public static void main(String[] args) {//main method
		int n1, n2 = 0;//create int value n1, n2
		
		Scanner keyboard = new Scanner(System.in);//create new scanner kerboard
		System.out.print("Enter row size(maximum 5): ");//print instruction
		n1 = keyboard.nextInt();//save input value
		System.out.print("Enter column size(maximum 5): ");//print instruction
		n2 = keyboard.nextInt();//save input value
		int[][] m1 = new int[n1][n2];//create new array
		System.out.print("Enter row size(maximum 5): ");//print instruction
		n1 = keyboard.nextInt();//save input value
		System.out.print("Enter column size(maximum 5): ");//print instruction
		n2 = keyboard.nextInt();//save input value
		int[][] m2 = new int[n1][n2];//create new array
		System.out.print("Enter List1: ");//print instruction
		for (int i = 0; i < m1.length; i++) {//for which will use every input value
			for (int j = 0; j < m1[i].length; j++)//for which will use every input value
				m1[i][j] = keyboard.nextInt();//save input value each on every array
		}
		System.out.print("Enter list2: ");//print instruction
		for (int i = 0; i < m2.length; i++){//for which will use every input value
			for (int j = 0; j < m2[i].length; j++)//for which will use every input value
				m2[i][j] = keyboard.nextInt();//save input value each on every array
		}
		for (int i = 0; i < m1.length; i++){//for which will use every input value
			for (int j = 0; j < m1[i].length; j++)//for which will use every input value
				System.out.print(m1[i][j] + " ");//print space
		    System.out.println();//goto next line
		}
		System.out.println();//go to next line
		
		for (int i = 0; i < m2.length; i++){//for which will use every input value
			for (int j = 0; j < m2[i].length; j++)//for which will use every input value
				System.out.print(m2[i][j] + " ");//print space
		    System.out.println();//goto next line
		}
		System.out.println();//goto next line
		                  
		        
		if (m1.equals(m2))//when there are values which is good for equal class
		    System.out.println("The two arrays are approximately identical.");//print proper message
		else //if its not
		    System.out.println("The two arrays are not identical");//print proper message
		
		keyboard.close();
	}
}