package h2;

public class H2_main {
	public static void main(String[] args) {

		int i = 343, j = 343, k = 18, min, max;
		
		if (i < j) {
			min = i;
		} else {
			min = j;
		}
		
		if (k < min) {
			min = k;
		}	
			
			
		if (i > j) {
			max = i;
		} else {
				max = j;
		}
			
		if (k > max) {
				max = k;	
		}
		
		System.out.println("min ist: " + min);
		System.out.println("max ist: " + max);

	}	
}
