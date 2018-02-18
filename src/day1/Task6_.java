package day1;

public class Task6_ {

	public static void main(String[] args) {

		int a[] = new int[50];

		for (int i = 0; i < 50; i++) {
			a[i] = (int) Math.ceil(Math.random() * 100);

			System.out.println("Massive a-  " + a[i]);
		}

		int b[] = new int[50];

		for (int i = 0; i < 50; i++) {
			b[i] = (int) Math.ceil(Math.random() * 100);

			System.out.println("Massive b-  " + b[i]);
		}

		int x = 0;
		for (int i = 0, j = 1; i < 50; i = i + 2, j = j + 2) {
			if (i % 2 == 0)
				x = a[j];
			a[j] = b[i];
			b[j] = x;
		}

		System.out.println("new massiv a ");

		for (int i = 0; i < 50; i++) {
			System.out.println("Massive a---------    " + a[i]);

		}

		System.out.println("new massiv b ");

		for (int i = 0; i < 50; i++) {
			System.out.println("massive b --------------" + b[i]);
		}

	}

}
