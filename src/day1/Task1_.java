package day1;

public class Task1_ {

	public static void main(String[] args) {
		//��������� ������ �������� �� 100 ��������� ���������� ������ ������� 
		//������� �� ������� (������� 1) ��� ������ �������� �� �����

int []x=new int[100];
System.out.println("elements");
for (int i=0; i<100; i++) {
	
	x[i] = (int) Math.ceil(Math.random() * 100); 

	System.out.println(x[i]);
}
	System.out.println("4etn _____________");
for (int i=0; i<100; i++) {
		if (x[i]%2==0 ) {
		System.out.println(x[i]);}
	}
	

	
	
	
	
	
	
	
	
	}

}
