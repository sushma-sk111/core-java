class ClockStater
{
	public static void main(String[] args)
	{
	    Clock clock=new Clock();
		System.out.println("numbers:"+clock.numbers);
		System.out.println("cost:"+clock.cost);
		System.out.println("company:"+clock.company);
		System.out.println("shape:"+clock.shape);
		
		 Clock clock1=new Clock(12);
		System.out.println("numbers:"+clock1.numbers);
		System.out.println("cost:"+clock1.cost);
		System.out.println("company:"+clock1.company);
		System.out.println("shape:"+clock1.shape);
		
		 Clock clock2=new Clock(4.5);
		System.out.println("numbers:"+clock2.numbers);
		System.out.println("cost:"+clock2.cost);
		System.out.println("company:"+clock2.company);
		System.out.println("shape:"+clock2.shape);
		
		 Clock clock3=new Clock("titen");
		System.out.println("numbers:"+clock3.numbers);
		System.out.println("cost:"+clock3.cost);
		System.out.println("company:"+clock3.company);
		System.out.println("shape:"+clock3.shape);
		
		 Clock clock4=new Clock();
		System.out.println("numbers:"+clock4.numbers);
		System.out.println("cost:"+clock4.cost);
		System.out.println("company:"+clock4.company);
		System.out.println("shape:"+clock4.shape);
		
		
	}
}