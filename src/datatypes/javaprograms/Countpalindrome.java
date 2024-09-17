package datatypes.javaprograms;

public class Countpalindrome {

	public static void main(String[] args) {
		int start=10;
		int stop=100;
		int count=0;
		
		for(int i=start;i<stop;i++) {
		int n=i;
		int rev=0;
		int temp=n;
		while(n>0) {
			int r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			
		}
		if(temp==rev) {
			count++;
		}
		

	}
		System.out.println(count);
	}
}


