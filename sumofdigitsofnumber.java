package java_training;
import java.util.Scanner;
public class sumofdigitsofnumber {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		System.out.println("Sum:"+sum);
	}

}
