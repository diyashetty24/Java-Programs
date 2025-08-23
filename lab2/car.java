package code;

public class Car 
{
	 private String brand;  
	 private String model;  
	 private double price;
	 private double mileage;   
	 private String name ; 
	 
	 private static int totalcars;
	 private static String ShowroomName="motors";
			 
	 public Car(String b, String m, double p, double mil)
		{
			brand=b;
			model=m;
			this.price=p;
			this.mileage=mil;
			this.name="not assigned";
			totalcars++;
		}
		
		public Car(String b, String m, double p, double mil, String owner) 
		{
			brand=b;
			model=m;
			this.price=p;
			this.mileage=mil;
			this.name=owner;
			totalcars++;
		}

		public String getname() 
		{
			return name;
		}

		public void setname(String name) 
		{
			this.name = name;
		}
		
		public void displayDetails() 
		{
			System.out.println("Brand:"+brand);
			System.out.println("model:"+model);
			System.out.println("price:"+this.price);
			System.out.println("mileage:"+this.mileage);
			System.out.println("ownername:"+this.name);
		
		}
			public void updatePrice(double newPrice)
			{
				price=newPrice;
			}
		public static void showTotalCars()
		{
			   System.out.println("Total Cars:"+totalcars);
		}
		
	    public static void showShowroomName() 
	    {
	    	System.out.println("showroom:"+ShowroomName);
		}

	}

