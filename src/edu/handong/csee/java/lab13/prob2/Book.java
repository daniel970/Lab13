package edu.handong.csee.java.lab13.prob2;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class Book {//class Book
	private static int idCount = 0; //make idCount value 0
	private String BookName;//make string value BookName
	private int id;//make int value id
	
	public Book(String Name)//book method
	{
		this.BookName = Name; //set name of book
		idCount++;//+1 on idCount
		id = idCount;//set id to new id number
	}
	public String toString() //method toString
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName; //print id and book name
	}
	public void show()//method show
	{
		System.out.println("<<<BOOK>>>" + this.toString());//print book tag and toString method
	}
}
