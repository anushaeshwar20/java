package datatypes.javaprograms;

public class Countdays {

	public static void main(String[] args) {
	    String month="jan";
		switch(month) {
		case  "jan", "march", "may", "july", "aug", "oct", "dec":
			System.out.println(31);
			break;
		case "apr", "june", "sep", "nov":
			System.out.println(30);
			break;
		default:
			System.out.println(28);
				break;
			
		}

	}

}
