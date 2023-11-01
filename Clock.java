class Clock
{
	
	int numbers=12;
	double cost=1000;
	String shape;
	String company;
	
	
	Clock()
	{
	    super();
	}
	Clock(int numbers)
	{
		super();
		this.numbers=numbers;
		System.out.println("entering the numbers of clock:"+numbers);
	}
	Clock(double cost)
	{
		super();
		this.cost=cost;
		System.out.println("entering the cost of clock:"+cost);
	}
	Clock(String shape)
	{
		super();
		this.shape=shape;
		System.out.println("entering the shape of clock:"+shape);
	}
	Clock(String company,double cost)
	{
		super();
		this.company=company;
	
		System.out.println("entering the numbers of clock:"+company);
	}
	
}