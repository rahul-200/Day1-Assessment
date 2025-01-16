package java_training;
import java.util.Scanner;
public class sumofnaturalnumbers {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int number=Sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
