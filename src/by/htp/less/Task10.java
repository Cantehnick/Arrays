package by.htp.less;

public class Task10 {

 
		public static void main(String[] args) {
			  
			  int a[][] = new int[4][5];
			  int count = 0;
			  
			  //Initializing array
			  System.out.println("Array A has following elements");
			  
			  for(int i=0; i < a.length ; i++) {
			   for(int j=0; j < a[i].length; j++) {
			   
			    a[i][j] = (int)Math.ceil((Math.random()* 200));
			   }
			   System.out.println(java.util.Arrays.toString(a[i]));
			  }
			  
			  //Calling isEven method for every element of array
			  for(int i=0; i < a.length ; i++) {
			   for(int j=0; j < a[i].length; j++) {
			   
			    if (isEven(a[i][j])) {
			     count ++;
			    }
			   }
			   
			  }
			  
		
			  //Printing count to console
			  System.out.println("Number of element between 9 and 100 with even sum of digits = "+ count);

			 }

			// Method for checking if 9 < a < 100; returns TRUE if a has even sum of digits
			  public static boolean isEven(int a) {
			  
			   int d1 = 0;
			   int d2 = 0;
			   int s = 0;
			   
			   if ((a > 9) && (a < 100)){
			       d2 = a%10;
			       a = a/10;
			       d1 = a%10;
			   } else {
			    return false; 
			   }
			   
			   s = d1+d2;
			  
			   if (s%2==0) {
			    return true;
			   } else {
			    return false;
			   }
	

			  }

			}

	