class Helmet
{
	String company;
	int type;
	double cost;
	String color;
	String features;
	
	Helmet()
	{
		this("vega",6,1000,"red","shell");
	}
	Helmet(String company,int type)
	{
		this.company=company;
		this.type=type;
		System.out.println("company and type of the helment:"+company+","+type);
	}
	Helmet(String company,int type,double cost)
	{
		this(company,type);
		this.cost=cost;
		System.out.println("company type and cost of the helment:"+company+","+type+","+cost);
	}
	Helmet(String company,int type,double cost,String color)
	{
		this(company,type,cost);
		this.color=color;
		System.out.println("company type cost and color of the helment:"+company+","+type+","+cost+","+color);
	}
	Helmet(String company,int type,double cost,String color,String features)
	{
		this(company,type,cost,color);
		this.features=features;
		System.out.println("company  type cost color and features of the helment:"+company+","+type+","+cost+","+color+","+features);
	}
	
	
}