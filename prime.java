package java_training;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				sum+=i;
				count++;
			}
		}
		if(count>0) {
			int average=sum/count;
			System.out.println("Sum:"+sum);
			System.out.println("Average:"+average);
		} else {
			System.out.println("no prime numbers");
		}
	}
		
		public static boolean isPrime(int num) {
	       if (num <= 1) return false;
	       for (int i = 2; i <= Math.sqrt(num); i++) {
	       if (num % i == 0) return false;
	     }
	     return true;
	}

}
