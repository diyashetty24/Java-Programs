package code;

public class MainClass 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Nidhi",1,10000.0d);
		Employee e2=new Employee("Pallavi",2,10000.0d);
		
//display details
e1.displaydetails();
e2.displaydetails();

//increase salary
e1.increase_salary(10.0d);
e2.increase_salary(20.0d );

//display updated details
e1.displaydetails();
e2.displaydetails();

//optional tasks
//Declaring an array
Employee[] array=new Employee[10];

array[0]=new Employee("Nisha",3,1000.00d);
//Display all Employee
for(int i=0;i<array. length;i++)
{
	array[i].displaydetails();
	if(array[i].name.compareTo("Nisha")==0)
			{
		System.out.println("Employee is Found");
			}
}
	}

	
	}

