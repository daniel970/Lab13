package edu.handong.csee.java.lab13.prob4;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */


import java.util.Scanner;//import scanner

public class MAIN {//main class
	public static void main(String[] args) {//main method
		String cat_name, dog_name;//create string cat_name and dog_name

		Master master = new Master();//create new object master
		Cat cat = new Cat();//create new object cat
		Dog dog = new Dog();//create new object dog

		Scanner keyboard = new Scanner(System.in);//create new scanner
		System.out.print("Enter the cat name and dog name: ");//print instruction
		cat_name = keyboard.next();//save the user input
		dog_name = keyboard.next();//save the user input

		cat.setName(cat_name);//set cat name
		cat.getName();//get cat_name and save on cat
		master.feed(cat);//play feed method in method master

		dog.setName(dog_name);//set dog name
		dog.getName();//get dog_name and save on dog
		master.feed(dog);//play feed method in method master

		}
}
