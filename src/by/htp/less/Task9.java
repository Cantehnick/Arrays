package by.htp.less;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int str;
		int col;
		int r1;
		int r2;

		Scanner in = new Scanner(System.in);
		System.out.println("vvedite kol-vo strok");
		str = in.nextInt();
		System.out.println("vvedite kol-vo kolonok");
		col = in.nextInt();

		int a[][] = new int[str][col];

		for (int i = 0; i < str; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = (int) Math.ceil(Math.random() * 100);
			}
			System.out.println(java.util.Arrays.toString(a[i]));

		}

		System.out.println("vvedite nomer stroki na zameny ");
		r1 = in.nextInt();
		System.out.println("vvedite nomer stroki na kotorii menaem ");
		r2 = in.nextInt();

		int b[] = new int[col];

		for (int j = 0; j < col; j++) {
			b[j] = a[r1 - 1][j];
			a[r1 - 1][j] = a[r2 - 1][j];
			a[r2 - 1][j] = b[j];
		}

		for (int i = 0; i < str; i++) {
			System.out.println(java.util.Arrays.toString(a[i]));

		}
		int max[] = new int[col];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < col; j++) {

				if (a[i][j] > max[j]) {
					max[j] = a[i][j];
				}
			}
		}
		System.out.println("max element v stolbce ");
		System.out.println(java.util.Arrays.toString(max));
		in.close();
	}
}
