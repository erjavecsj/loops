public class Loops {
	
	public static void main(String[] args) {
		
		effectiveness();

		// String s = "My String";
		// int length = findLength(s);
		// System.out.println(length);


		// int x = 1;
		// while (x <= 100) {
		// 	System.out.println(x);
		// 	x++;
		// }

		// for (int i=1; i <= 100; i++) {
		// 	System.out.println(i);
		// }


		// int t = 45;
		// while (t <= 45 && t >= 20) {
		// 	System.out.println(t);
		// 	t = t-5;
		// }

		// for (int g=24; g >= 24 && g <= 68; g=g+2) {
		// 	System.out.println(g);
		// }

	}

		// public static int findLength(String str) {

		// 	int len =0
		// 	for (int i=0; i<str.length(); i++) {
				
		// 	}

		// 	return len;
		// }
		 
		 
	public static void effectiveness() {

		int month = 0;
		double effect = 100;
		for ( ; effect >= 50; effect = effect - (effect*.04)) {
			System.out.println("month: " + month + " effectiveness: " + effect);
			month++;
		}

		if (effect < 50) {
			System.out.println("month: " + month + " effectiveness: " + effect + " DISCARDED");
		}

		

	}
		
}