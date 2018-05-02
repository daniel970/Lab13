package edu.handong.csee.java.lab13.prob5;

/**Name: Doyoung Kim
 * Date: 2018-05-02
 */


public class equals {//class equals
	public static boolean equals(int[][] m1, int[][] m2) {//boolean method equals
		int count = 0;//create count value 0
		
		if (m1.length != m2.length) // if the number of row is different, return false
			return false;//return false
		for (int i = 0; i < m1.length; i++) {//for which will use every array value
			for (int j = 0; j < m1[i].length; j++){//for which will use every array value
				if (m1[i][j] != m2[i][j])//if both arent same
					count++;//increase count value by 1
		        }
		}
		if(count <= 3)//if count is same or leaa than 3 (which means when there are same or less than 3 same value)
			return true;//return true
		else
			return false;//return false
	}
}
