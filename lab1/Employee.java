package code;

public class Employee 
{
	//data members
	String name;
	int id;
	double salary;
 public Employee(String name, int id , double salary)
{
	this.name=name;
	this.id=id;
	this.salary=salary;
}
void displaydetails()
{
	System.out.println("Employee ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	System.out.println();
}
void increase_salary(double per)
{
    salary+=(salary*per)/100.0d;
}
}
