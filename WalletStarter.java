class WalletStarter
{
	public static void main(String[] args)
	{
		Wallet wallet=new Wallet();
		System.out.println("cost:"+wallet.cost);
		System.out.println("color:"+wallet.color);
		System.out.println("brand:"+wallet.brand);
		System.out.println("noOfpockets:"+wallet.noOfpockets);
		
		Wallet wallet1=new Wallet(100.0);
		System.out.println("cost:"+wallet1.cost);
		System.out.println("color:"+wallet1.color);
		System.out.println("brand:"+wallet1.brand);
		System.out.println("noOfpockets:"+wallet1.noOfpockets);
		
		Wallet wallet2=new Wallet("brown",100.0);
		System.out.println("cost:"+wallet2.cost);
		System.out.println("color:"+wallet2.color);
		System.out.println("brand:"+wallet2.brand);
		System.out.println("noOfpockets:"+wallet2.noOfpockets);
		
		Wallet wallet3=new Wallet("lotus");
		System.out.println("cost:"+wallet3.cost);
		System.out.println("color:"+wallet3.color);
		System.out.println("brand:"+wallet3.brand);
		System.out.println("noOfpockets:"+wallet3.noOfpockets);
		
		Wallet wallet4=new Wallet(4);
		System.out.println("cost:"+wallet4.cost);
		System.out.println("color:"+wallet4.color);
		System.out.println("brand:"+wallet4.brand);
		System.out.println("noOfpockets:"+wallet4.noOfpockets);
		
		System.out.println("************************");
		Ornament ornament=new Ornament();
		System.out.println("cost:"+ornament.cost);
		System.out.println("color:"+ornament.color);
		System.out.println("brand:"+ornament.types);
		System.out.println("noOfpockets:"+ornament.weight);
		
		Ornament ornament1=new Ornament(500.0);
		System.out.println("cost:"+ornament1.cost);
		System.out.println("color:"+ornament1.color);
		System.out.println("brand:"+ornament1.types);
		System.out.println("noOfpockets:"+ornament1.weight);
		
		Ornament ornament2=new Ornament("gold",500.0);
		System.out.println("cost:"+ornament2.cost);
		System.out.println("color:"+ornament2.color);
		System.out.println("brand:"+ornament2.types);
		System.out.println("noOfpockets:"+ornament2.weight);
		
		Ornament ornament3=new Ornament("rings");
		System.out.println("cost:"+ornament3.cost);
		System.out.println("color:"+ornament3.color);
		System.out.println("brand:"+ornament3.types);
		System.out.println("noOfpockets:"+ornament3.weight);
		
		Ornament ornament4=new Ornament(50);
		System.out.println("cost:"+ornament4.cost);
		System.out.println("color:"+ornament4.color);
		System.out.println("brand:"+ornament4.types);
		System.out.println("noOfpockets:"+ornament4.weight);
		
	}
}