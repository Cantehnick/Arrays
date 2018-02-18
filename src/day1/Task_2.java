package day1;

public class Task_2 {

	public static void main(String[] args) {
		 
		int x[]=new int[100];
		for (int i=0,j=1; i<100; i++,j++) {
		x[i]=j;
		System.out.println(x[i]);
		}
		int a=0;
		for (int i=0,j=1; i<100; i=i+2,j=j+2) {
			
		a=x[i];
		x[i]=x[j];
		x[j]=a;       }
		
		System.out.println("new massiv");
		
		for (int i=0; i<100; i++){
			
			System.out.println(x[i]);
		}
		
		
		
	
	}
}
