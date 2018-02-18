package day1;

public class Task4_ {

	public static void main(String[] args) {
	int x[]=new int[100];
	for (int i=0; i<x.length; i++) {
		x[i]=(int) Math.ceil(Math.random() * 100);
		
		System.out.println(x[i]);
	}
	

		int max= x[0];
		for (int i=0; i<x.length; i++) {
			if (x[i]>max)
				max=x[i];}
			System.out.println("max");
		System.out.println(max);
			
		
		
		
	}
	

	}


