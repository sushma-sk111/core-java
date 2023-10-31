class Matchbox
{
	String company="lotus";
	int noOfsticks=20;
	long length;
	double price=50;
	float weight;
	int size;
	
	Matchbox()
	{
		System.out.println("Starting matchbox");
	}
	Matchbox(String company)
	{
		this.company=company;
		System.out.println("company name of matchbox:"+company);
	}
	Matchbox(int noOfsticks)
	{
		this.noOfsticks=noOfsticks;
		System.out.println("noOfsticks in matchbox:"+noOfsticks);
	}
	Matchbox(long lengths)
	{
		this.length=length;
		System.out.println("length of matchbox sticks:"+length);
	}
	Matchbox(double price,String company)
	{
		this.price=price;
		System.out.println("price of matchbox:"+price);
	}
	Matchbox(float weight)
	{
		this.weight=weight;
		System.out.println("weight of matchbox:"+weight);
	}
	Matchbox(int size,float weight)
	{
		this.size=size;
		System.out.println("size of matchbox:"+size);
	}

}