class Rocket
{
	long weight;
	float length;
	double noOffins;
	String name;
	
	Rocket()
	{
		super();
	}
	Rocket(long weight)
	{
		super();
		this.weight=weight;
		System.out.println("weight of the rocket:"+weight);
	}
	Rocket(float length)
	{
		super();
		this.length=length;
		System.out.println("length of the rocket:"+length);
	}
	Rocket(double noOffins)
	{
		super();
		this.noOffins=noOffins;
		System.out.println("noOffins in the rocket:"+noOffins);
	}
	Rocket(String name)
	{
		super();
		this.name=name;
		System.out.println("shapeOfnose of the rocket:"+name);
	}
}