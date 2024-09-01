package Package1;

public class ArithmeticAssignment1
{
  public int sum(int a, int b)
  {
	 int c;
	 c=a+b;
	 System.out.println("Result is :"+c);
	 return c;
  }
  public int sub(int a1, int a2)
  {
	  int c1;
	  c1=a1-a2;
	  System.out.println("Result is "+c1);
	  return c1;
  }
  public int mul(int a3, int a4)
  {
	  int c2;
	  c2=a3*a4;
	  System.out.println("Result is :"+c2);
	  return c2;
  }
  public void div(int a5, int a6)
  {
	  int c3;
	  c3=a5/a6;
	  System.out.println("Final Result is :"+c3);
  }
  public static void main(String[] args) 
  {
	  ArithmeticAssignment1 obj = new ArithmeticAssignment1();
	  int sumResult = obj.sum(10, 2);
	  int sumResult1 = obj.sum(sumResult, 2);
	  int subResult = obj.sub(sumResult1, 2);
	  int mulResult = obj.mul(subResult, 2);
	  obj.div(mulResult, 2);
}
}
