package datatypes.javaprograms;

public class Reversethenumber {

	public static void main(String[] args) {
		int num=256;
		int rev=0;
		while(num!=0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
		System.out.println(rev);

	}

}

