package datatypes.javaprograms;

public class Count {

	public static void main(String[] args) {
		int start=100;
		int stop=200;
		int count=0;
		for(int i=start; i<stop; i++) {
			if(i%5==0) {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
