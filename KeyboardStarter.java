class KeyboardStarter
{
public static void main (String[] args)
{
	System.out.println("Starting keyboardstarter");
	Keyboard keyboard=new Keyboard();
	System.out.println("keyboard:"+keyboard.noOfkeys);
	System.out.println("keyboard:"+keyboard.brand);
	System.out.println("keyboard:"+keyboard.color);
	System.out.println("keyboard:"+keyboard.type);
	System.out.println("keyboard:"+keyboard.cost);
	
	Keyboard keyboard1=new Keyboard(80);
	System.out.println("keyboard:"+keyboard1.noOfkeys);//80
	System.out.println("keyboard:"+keyboard1.brand);
	System.out.println("keyboard:"+keyboard1.color);
	System.out.println("keyboard:"+keyboard1.type);
	System.out.println("keyboard:"+keyboard1.cost);
	
	Keyboard keyboard2=new Keyboard("dell");
	System.out.println("keyboard:"+keyboard2.noOfkeys);
	System.out.println("keyboard:"+keyboard2.brand);//dell
	System.out.println("keyboard:"+keyboard2.color);
	System.out.println("keyboard:"+keyboard2.type);
	System.out.println("keyboard:"+keyboard2.cost);
	
	Keyboard keyboard3=new Keyboard(80,"black");
	System.out.println("keyboard:"+keyboard3.noOfkeys);
	System.out.println("keyboard:"+keyboard3.brand);
	System.out.println("keyboard:"+keyboard3.color);//black
	System.out.println("keyboard:"+keyboard3.type);
	System.out.println("keyboard:"+keyboard3.cost);
	
	Keyboard keyboard4=new Keyboard(5000);
	System.out.println("keyboard:"+keyboard4.noOfkeys);
	System.out.println("keyboard:"+keyboard4.brand);
	System.out.println("keyboard:"+keyboard4.color);//black
	System.out.println("keyboard:"+keyboard4.type);
	System.out.println("keyboard:"+keyboard4.cost);
	
	Keyboard keyboard5=new Keyboard();
	System.out.println("keyboard:"+keyboard5.noOfkeys);
	System.out.println("keyboard:"+keyboard5.brand);
	System.out.println("keyboard:"+keyboard5.color);//black
	System.out.println("keyboard:"+keyboard5.type);
	System.out.println("keyboard:"+keyboard5.cost);
	

	
	System.out.println("ending keyboardstarter");
}
}