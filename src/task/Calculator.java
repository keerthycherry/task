package task;

import java.util.*;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch,add,sub,mul;
		double div;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter first number");
		 a=s.nextInt();
		 System.out.println("Enter second number");
		 b=s.nextInt();
		 while(true) {
			 System.out.println("Enter 1 for addition");
			 System.out.println("Enter 2 for subtraction");
			 System.out.println("Enter 3 for multiplication");
			 System.out.println("Enter 4 for division");
			 System.out.println("Enter 5 for exit");
			 ch=s.nextInt();
			 switch(ch) {
			 case 1:
				 add=a+b;
				 System.out.println("result:"+add);
				 break;
			 case 2:
				 sub=a-b;
				 System.out.println("result:"+sub);
				 break;
			 case 3:
				 mul=a*b;
				 System.out.println("result:"+mul);
				 break;
			 case 4:
				 div=a/b;
				 System.out.println("result:"+div);
				 break;
			 case 5:
				 System.exit(0);
				 
			 }
			 
		 }
		 
		

	}

}
