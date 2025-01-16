package java_training;

public class oddnumbers {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				count++;
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("Count:"+count);
		System.out.println("Sum:"+sum);
	}

}
