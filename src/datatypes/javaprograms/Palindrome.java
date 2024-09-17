package datatypes.javaprograms;

public class Palindrome {

	public static void main(String[] args) {
		int r=0;
		int sum=0;
		int n=45542;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}
}
