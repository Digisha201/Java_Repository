package Package1;

public class MethodsAssignment2 
{
 public int div(int a, int b)
 {
	 int c;
	 c=a/b;
	 System.out.println("Result is :"+c);
	 return c;
 }
 public int sub(int a1, int b1)
 {
	 int c1;
	 c1=a1-b1;
	 System.out.println("Result is :"+c1);
	 return c1;
 }
 public int mul(int a2, int b2)
 {
	 int c2;
	 c2=a2*b2;
	 System.out.println("Result is :"+c2);
	 return c2;
 }
 public void sum(int a3, int b3)
 {
	 int c3;
	 c3=a3+b3;
	 System.out.println("Finl Result is :"+c3);	 
 }
 public static void main(String[] args) 
 {
	 MethodsAssignment2 obj = new MethodsAssignment2();
	 int divResult = obj.div(10, 2);
	 int subResult = obj.sub(divResult, 2);
	 int mulResult = obj.mul(subResult, 2);
	 int subResult1 = obj.sub(mulResult, 2);
	 obj.sum(subResult1, 2);
}
}
