package by.htp.less;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int s, str, col;

		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite chislo ");
		s = in.nextInt();
		
		System.out.println("VVedite kol-vo strok ");
		str = in.nextInt();
		System.out.println("Vvedite kol-vo stolbcov");
		col = in.nextInt();

		int a[][] = new int[str][col];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = (int) Math.ceil(Math.random() * 10);
			}
			System.out.println(java.util.Arrays.toString(a[i]));
		}
		

		int k = 0;
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < col; j++) {
				if (s == a[i][j])
					k = k + 1;

			}
	
		}
		System.out.println("kol-vo cifr "+k);
		in.close();
	}

}
