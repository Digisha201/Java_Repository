package Package1;

public class Student 
{
	int a;
	public void display()
	{
		System.out.println("Welcome to all of you");
	}
public static void main(String[] args) 
{
	Student swati=new Student();
	swati.display();
	swati.a=12;
	System.out.println("Value of a: "+swati.a);
}
}
