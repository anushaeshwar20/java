package datatypes.javaprograms;

public class Primenumber {

	public static void main(String[] args) {
		int num=7;
		int p=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				p=1;
				break;
			}
		}
		if(p==1) {
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println("it is a prime numer");
		}
		}

	}


