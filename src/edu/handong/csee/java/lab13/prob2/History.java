package edu.handong.csee.java.lab13.prob2;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class History extends Book {//class History extends Book 
	private String Author;//create new string Author
	public History(String Name, String Author)
	{
		super(Name);//set name of book
		this.Author = Author;//set Author
	}
	public String toString()//method toString
	{
		return super.toString() + "\n\tAuthor: " + Author; //print toString from Book and Author
	}
	public void show()//method show
	{
		System.out.println("<<<History>>>" + this.toString());//print label History and toString method
	}

}
