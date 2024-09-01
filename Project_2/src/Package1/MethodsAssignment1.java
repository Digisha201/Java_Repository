package Package1;

public class MethodsAssignment1 
{
	public int sum(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("Result is: "+c);
		return c;
	}
	public int mul(int a1, int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("Result is: "+c1);
		return c1;
	}
	public int sub(int a2, int b2)
	{
		int c2;
		c2=a2-b2;
		System.out.println("Result is: "+c2);
		return c2;
	}
	public void div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("Final Result is: "+c3);
	}
	public static void main(String[] args) 
	{
		MethodsAssignment1 obj = new MethodsAssignment1();
		int sumResult = obj.sum(10, 2);
		int mulResult = obj.mul(sumResult, 2);
		int subResult = obj.sub(mulResult, 2);
		int mulResult1 = obj.mul(subResult, 2);
		obj.div(mulResult1, 2);
		
	}

}
