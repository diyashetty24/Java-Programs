package code;

public class Showroom 
{

		public static void main(String[] args) 
		{
			Car c1=new Car("Toyota","Corolla",15000,18.5,"mustang");
			Car c2=new Car("honda","Civic",20000,16.0,"John");
			Car c3=new Car("Hyundai","i20",12000,20.0);
			
			c1.displayDetails();
			c2.displayDetails();
			c3.displayDetails();
			
			c1.setname("Diya");
			c1.updatePrice(26000);
			
			System.out.println("After updates:");
			   c1.displayDetails();

		        Car.showShowroomName();
		        Car.showTotalCars();
			

		}

	}



