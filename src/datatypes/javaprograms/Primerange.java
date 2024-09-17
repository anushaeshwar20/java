package datatypes.javaprograms;

public class Primerange {

	public static void main(String[] args) {
		int start=10;
		int stop=50;
		for(int i=start; i<stop; i++) {
			int p=0;
			for(int j=2;j<i;j++) {
				if(j%i==0) {
					p=1;
					break;
				}
			}
			if(p==0) {
				System.out.println(i);
			}
		}
	}

}
