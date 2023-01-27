package decimal_to_binary;

public class susobhan {
	public static void main(String args[]) {
		
		
		
		int num = 15;
		
		int sum = 0;
		int temp = num;
		int rem = 0;
		int p =1;
		while(temp!=0) {
			rem = temp%2;
			sum = sum+rem*p;
			temp = temp/2;
			p=p*10;
			
		}
		
		System.out.print(sum);
		
	}

}
