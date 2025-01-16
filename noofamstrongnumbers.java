package java_training;
import java.util.Scanner;
public class noofamstrongnumbers {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			int orginal=i;
			int digits=String.valueOf(i).length();
			int sum=0;
			while(i!=0) {
				int digit=i%10;
				sum+=Math.pow(digit, digits);
				i/=10;
			}
			if(orginal==sum) {
				count++;
		   }
          i=orginal;
		}
		System.out.println(count);
	}
}
