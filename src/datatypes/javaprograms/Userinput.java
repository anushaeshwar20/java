package datatypes.javaprograms;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=scn.nextInt();
    System.out.println(n);
    
    int sum=0;
	while(n!=0) {
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
System.out.println(sum);

}
}