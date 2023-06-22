package week1.day2;

public class palindrome {
	public static void main(String[] args) {
		int num=34343;
		int temp=num;
		 int num1=0;

		for (;num!=0;num=num/10) {
	int num2=num%10;
	num1=num1*10+num2;
	


		}

		if(temp==num1) {

			System.out.println(num1+" - the number is palindrome");}


			else {
				System.out.println(num1+" - the number is not palindrome");
		}
		}

	}