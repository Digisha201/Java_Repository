package Package1;

public class ThisKeywordUseInMethodsAsgnmnt 
{
  public void m1()
  {
	  this.m4(876, 765, 653);
	  System.out.println("Default Method");
  }
  public void m2(int a)
  {
	  this.m1();
	  System.out.println("One Parameterized Method");
  }
  public void m3(int a, int b)
  {
	  this.m2(167);
	  System.out.println("Two Parameterized Method");
  }
  public void m4(int a, int b, int c)
  {
	  System.out.println("Three Parameterized Method");
  }
  public void m5(int a,int b,int c,int d)
  {
	  this.m3(11,12);
	  System.out.println("Four Parameterized Method");
  }
  public static void main(String[] args) 
  {
	ThisKeywordUseInMethodsAsgnmnt obj = new ThisKeywordUseInMethodsAsgnmnt();
	obj.m5(101, 102, 103, 104);
}
}
