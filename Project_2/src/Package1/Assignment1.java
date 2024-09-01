package Package1;

public class Assignment1 
{
 int rollno;
 int age;
 
 public void display1()
 {
	 System.out.println("Welcome to all of you");
 }
 public void display2()
 {
	 System.out.println("Automation is very easy");
 }
 public static void main(String[] args)
 {
	Assignment1 digu=new Assignment1();
	digu.display1();
	digu.display2();
	digu.rollno=356;
	System.out.println("RollNo is: "+digu.rollno);
	digu.age=34;
	System.out.println("Age is: "+digu.age);
}
}



