package day1;

public class Task3_ {

	public static void main(String[] args) {
		
		int chet=0;
		int nechet=0;
		
		int x[]=new int[100];
		for (int i=0;i<x.length;i++) {
			x[i] = (int) Math.ceil(Math.random() * 100);
			
			System.out.println(x[i]);
			if (x[i]%2==0)
		chet=chet+1;
			else 
				nechet=nechet+1;
			}
		System.out.println("chet"+chet);
		System.out.println("nechet"+nechet);
		
		
		

		
	}
		
	}


