package java_training;
import java.util.Scanner;
public class armstrongnumber {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int number=Sc.nextInt();
		int temp=number;
		int digit;
		int digits = 0;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		temp=number;
		int sum=0;
		while(temp>0) {
			digit=temp%10;
			sum+=Math.pow(digit, digits);
			temp/=10;
		}
		if(sum==number) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
