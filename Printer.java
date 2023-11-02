class Printer
{
	double cost;
	String company;
	float noOfpages;
	String color;
	long productno;
	
	Printer()
	{
		this(20000,"canon",5,"black",2253);
	}
	Printer(double cost,String company)
	{
		this.cost=cost;
		this.company=company;
		System.out.println("cost and company of the printer:"+cost+","+company);
		
	}
	Printer(int cost,String company,float noOfpages)
	{
		this(cost,company);
		this.noOfpages=noOfpages;
		System.out.println("cost company and noOfpagesprinting  the printer:"+cost+","+company+","+noOfpages);
		
	}
	Printer(int cost,String company,float noOfpages,String color)
	{
		this(cost,company, noOfpages);
		this.color=color;
		System.out.println("cost company  noOfpagesprinting and color the printer:"+cost+","+company+","+noOfpages+","+color);
		
	}
	Printer(int cost,String company,float noOfpages,String color,long productno)
	{
		this(cost,company, noOfpages,color);
		this.productno=productno;
		System.out.println("cost company and noOfpagesprinting  color and productno ofthe printer:"+cost+","+company+","+noOfpages+","+color+","+productno);
		
	}
	
	
	
	
}