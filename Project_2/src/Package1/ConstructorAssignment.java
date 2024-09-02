package Package1;

public class ConstructorAssignment 
{
 public ConstructorAssignment() 
 {
	     this(23,24,25);
	 	 System.out.println("Default Parameterized Constructor...");
 }
 public ConstructorAssignment(int a) 
 {
	 this(111,112);
	 System.out.println("One Parameterized Constructor...");
 }
 public ConstructorAssignment(int a, int b) 
 {
	 this();
	 System.out.println("Two Parameterized Constructor...");
 }
 public ConstructorAssignment(int a, int b, int c) 
 {
	 System.out.println("Three Parameterized Constructor...");
 }
 public static void main(String[] args) 
 {
	ConstructorAssignment obj = new ConstructorAssignment(11);
}
}
