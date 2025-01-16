package java_training;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int number=Sc.nextInt();
		int original=number;
		int reversed=0;
		while(number>0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		if(original==reversed) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
