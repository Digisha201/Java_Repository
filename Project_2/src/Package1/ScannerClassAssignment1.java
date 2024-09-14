package Package1;

import java.util.Scanner;

public class ScannerClassAssignment1
{
 public int sum(int a, int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("Sum Result is :"+c);
	 return c;
 }
 public int sub(int a, int b)
 {
	 int c;
	 c=a-b;
	 System.out.println("Sub Result is :"+c);
	 return c;
 }
 public int mul(int a, int b)
 {
	 int c;
	 c=a*b;
	 System.out.println("Mul Result is :"+c);
	 return c;
 }
 public void div(int a, int b)
 {
	 int c;
	 c=a/b;
	 System.out.println("Div Result is :"+c);
 }
 
 public static void main(String[] args) 
 {
	 ScannerClassAssignment1 obj = new ScannerClassAssignment1();
	 Scanner ob = new Scanner(System.in);
	 System.out.println("Please enter X1 :");
	 System.out.println("Please enter X2 :");
	 int a = ob.nextInt();
	 int b= ob.nextInt();
	 int sumResult = obj.sum(a, b);
	 System.out.println("Please enter X3 :");
	 int c= ob.nextInt();
	 int sumResult1 = obj.sum(sumResult, c);
	 
	 System.out.println("Please enter X4 :");
	 int d= ob.nextInt();
	 int subResult = obj.sub(sumResult1, d);
	 	 
	 System.out.println("Please enter X5 :");
	 int e= ob.nextInt();
	 int mulResult = obj.mul(subResult, e);
	  
	 System.out.println("Please enter X5 :");
	 int f= ob.nextInt();
	 obj.div(mulResult, f);
}
}
