class Wallet
{
    double cost;
	String color;
	String brand;
	int noOfpockets;
	
	
	Wallet()
	{
		super();
	}
	Wallet(double cost)
	{
		super();
		this.cost=cost;
		System.out.println("cost of the wallet:"+cost);
	}
	Wallet(String color,double cost)
	{
		super();
		this.color=color;
		System.out.println("color of the wallet:"+color);
		
	}
	Wallet(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("brand of the wallet:"+brand);
		
	}
	
	Wallet(int noOfpockets)
	{
		super();
		this.noOfpockets=noOfpockets;
		System.out.println(" noOfpockets in wallet:"+noOfpockets);
		
	}
	
	
}