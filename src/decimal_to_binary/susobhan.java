package decimal_to_binary;

public class susobhan {
	public static void main(String args[]) {
		int num = 7;
		int temp = num;
		int rem = 0;
		while (temp!=0) {
			 rem = temp %2;
			System.out.print(" "+rem);
			temp= temp/2;
			
		}
	}

}
