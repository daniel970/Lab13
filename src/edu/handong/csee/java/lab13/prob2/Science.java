package edu.handong.csee.java.lab13.prob2;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class Science extends Book {//class Science extends Book
	private String publisher; //create new steing publisher
	public Science(String Name, String Publisher)
	{
		super(Name);//set name of book
		this.publisher = Publisher;//set Publisher
	}
	public String toString()//method toString
	{
		return super.toString() + "\n\tPublisher: " + publisher;//print toString from Book and Publisher
	}
	public void show()//method show
	{
		System.out.println("<<<Science>>>" + this.toString());//print label Science and toString method
	}

}
