package by.htp.less;

public class Task6 {

	public static void main(String[] args) {

		int x[] = { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}

		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max)
				max = x[i];
		}

		System.out.println("max = " + max);
		
		double a[] = new double[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (double) x[i] / max;

			System.out.printf("new massiv "+"%.2f", a[i]);

		}
	}
}