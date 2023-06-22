package week1.day2;

import java.util.Arrays;

public class Smallestnumber {
	public static void main(String[] args) {
		int [] num= {23,45,67,32,89,22 };
		Arrays.sort(num);
		//22,23,32,45,67,89
		int ln=num.length;
		System.out.println("second smallest number is "+num[ln-5]);
		
	}

}
	