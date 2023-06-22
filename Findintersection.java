package week1.day2;


public class Findintersection {
	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int ln1=arr1.length;
				int ln2=arr2.length;
				for (int i=0;i<ln1;i++) {
					for(int j=0;j<ln2;j++) {
						if (arr1[i]==arr2[j]) {
							System.out.println(+arr1[i]);
						}
					}
				
						}
	}

}
