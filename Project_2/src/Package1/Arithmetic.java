package Package1;

public class Arithmetic
{
 public int sum(int a, int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("Sum Result is:"+c );
	 return c;
 }
 public int sub(int x, int y)
 {
	 int z;
	 z=x-y;
	 System.out.println("Sub Result is:"+z);
	 return z;
 }
 public void mul(int s, int r)
 {
	 int result;
	 result=s*r;
	 System.out.println("Final Result is:"+result);
 }
 public static void main(String[] args)
 {
	Arithmetic obj=new Arithmetic();
	int sumResult = obj.sum(10, 2);
	int subResult = obj.sub(10, 2);
	obj.mul(sumResult, subResult);
}
}
