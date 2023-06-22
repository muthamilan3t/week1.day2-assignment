package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
 int fn=0;
 int sn=1;
 int sum;
 
 System.out.println(fn);
 for (int j=2;j<=8;j++) {
 sum=fn+sn;
 fn=sn;
 sn=sum;
		 System.out.println(+sum);
 }
	}
	}
