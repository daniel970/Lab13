package edu.handong.csee.java.lab13.prob2;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */

public class MAIN {//Main class
	public static void main(String[] args) {//Main method
		Book book = new Book("Simple Book");//creates new object Name
		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, Publisher
		History history1 = new History("What Is history?", "E.H.Carr" );//Name, Author
		book.show();//play method show from Book
		science.show();//play method show from Science
		history1.show();//play method show from History
		}

}
