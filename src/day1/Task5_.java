package day1;

public class Task5_ {

	public static void main(String[] args) {
	

		int array[] = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = (int) Math.ceil(Math.random() * 100);
			System.out.println(array[i]);
		}

		int min = array[0];

		for (int i = 0; i < 100; i++) {
			if (array[i] < min)
				min = array[i];
		
		}
		System.out.println("min:");
		System.out.println(min);
		
		double array2[] = new double[100];
		for (int i = 0; i < 100; i++) {
			array2[i] =(double) array[i] / min;
			System.out.println(array2[i]);
		}

	}
}
