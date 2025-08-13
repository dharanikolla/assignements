package assignments;

public class Employee {
	String [] EmpName = {"Alice", "bob", "john"};
	int [] Empid = {12, 13, 14};
	
static class EmpGroups {
	 
	 String [] name  = {"Alice", "bob", "john"};
	 int [] id =  {12, 13, 14};
	 
}	 
	 
public static void main(String[] args) {
	
	 EmpGroups obj = new EmpGroups();	 
	 System.out.println("Emp name and empid:" + obj.name[0] + " " + obj.id[0]);
 }
	 
 }

