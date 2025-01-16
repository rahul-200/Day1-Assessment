package java_training;
import java.util.Scanner;
public class trianglepattern {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
