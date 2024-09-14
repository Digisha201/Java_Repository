package Package1;

import java.util.Scanner;

public class ScannerClassAssignment2 
{
 public int mul(int a, int b)
 {
	 int c;
	 c=a*b;
	 System.out.println("Mul Result is :"+c);
	 return c;
 }
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
 public void div(int a, int b)
 {
	 int c;
	 c=a/b;
	 System.out.println("Div Result is :"+c);
	  }
 public static void main(String[] args)
 {
	ScannerClassAssignment2 obj = new ScannerClassAssignment2();
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter X1 :");
	System.out.println("Enter X2 :");
	int a = ob.nextInt();
	int b = ob.nextInt();
	int MulResult = obj.mul(a, b);
	
	System.out.println("Enter X3 :");
	int c=ob.nextInt();
	int SumResult = obj.sum(MulResult, c);
	
	System.out.println("Enter X4 :");
	int d=ob.nextInt();
	int MulResult1 = obj.mul(SumResult, d);
	
	System.out.println("Enter X5 :");
	int e = ob.nextInt();
	int subResult = obj.sub(MulResult1, e);
	
	System.out.println("Enter X6 :");
	int f = ob.nextInt();
	obj.div(subResult, f);
	
}
}
