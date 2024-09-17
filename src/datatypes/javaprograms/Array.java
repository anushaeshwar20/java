package datatypes.javaprograms;

public class Array {

	public static void main(String[] args) {
		int[] age= {18,9,20,30,15};
		for (int i=0; i<age.length; i++) {
			if(age[i]<18) {
				System.out.println("invalid age" +age[i]);
				continue;
			}
			System.out.println("Valid age" +age[i]);
			
			}
		}
		
	}


