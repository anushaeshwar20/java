package datatypes.javaprograms;

public class Gcd {

	public static void main(String[] args) {
		int x=8, y=4;
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		System.out.println(x);

	}

}
