package java_training;
import java.util.Scanner;
public class noofpalindromes {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPalindrome(int num) {
			int original=num;
			int reversed=0;
			while(num>0) {
				int digit=num%10;
				reversed=reversed*10+digit;
				num/=10;
			}
			if(original==reversed) return true;
			else return false;
	}
}
