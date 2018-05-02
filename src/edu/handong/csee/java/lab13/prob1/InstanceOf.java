package edu.handong.csee.java.lab13.prob1;

/**
 * Name: Doyoung Kim 21700082
 * Date: 2018-05-02
 * 
 *
 */

public class InstanceOf {//class InstanceOf
	public static void WhatFriend(Friend friend)//WhatFriend method
	{
		if(friend instanceof ClassFriend) //if friend value is instance of ClassFriend
			((ClassFriend) friend).classFriend();//call classFriend
		else if(friend instanceof SchoolFriend) //if friend value is instance of
			((SchoolFriend) friend).schoolFriend();//call schoolFriend
		else //or else
			friend.JustFriend();//call JustFriend
	}

}
