import java.util.Arrays;

public class DriverValidateCreditCard {

	public static void main(String[] args) {

		// need to skip
		// need to do little by little
		
		int c1 [] = {4,5,3,9,6,8,9,8,8,7,7,0,5,7,9,8};
		int c2 [] = new int [c1.length];	
	
//		c2[c1.length -1] = c1[c1.length -1]; // not needed
		int total = 0;
		
		for (int i = c1.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				c2[i] = c1[i] * 2;
				c2[i] = c2[i] > 9 ? c2[i] - 9 : c2[i];
			}
			else {
				c2[i] = c1[i];
			}

			total += c2[i];
		}
		
		
		boolean isValidcc = total % 10 ==0;
		String message = Arrays.toString(c2);
		System.out.println(message);
		System.out.println("Total: " + total);
		System.out.println("isValid: " + isValidcc);
		
	}

}
