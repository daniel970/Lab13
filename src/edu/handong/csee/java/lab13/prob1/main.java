package edu.handong.csee.java.lab13.prob1;

/**
 * Name: Doyoung Kim 21700082
 * Date: 2018-05-02
 * 
 *
 */

public class main {//class main
	public static void main(String[] args) { //main
		// TODO Auto-generated method stub
		Friend friend1 = new Friend(); //creates new object of Friend
		SchoolFriend friend2 = new SchoolFriend();//creates new object of SchoolFriend
		ClassFriend friend3 = new ClassFriend();//creates new object of SchoolFriend

		InstanceOf.WhatFriend(friend1);//call WhatFriend method from class InstanceOf
		InstanceOf.WhatFriend(friend2);//call WhatFriend method from class InstanceOf
		InstanceOf.WhatFriend(friend3);//call WhatFriend method from class InstanceOf
		}

}
