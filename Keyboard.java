class Keyboard
{
  int noOfkeys=80;
  String brand="dell";
  String color="black";
  String type;
  double cost;
  
  Keyboard()
  {
	  System.out.println("starting keyboard");
  }
  Keyboard( int noOfkeys)
  {
	  this.noOfkeys=noOfkeys;
	  System.out.println("number of keys discribe:"+noOfkeys);
  }
  Keyboard(String brand)
  {
	 
	  this.brand=brand;
	  System.out.println("brand of keyboard show:"+brand);
  }
  Keyboard(int noOfkeys,String color)
  {
	  this.noOfkeys=noOfkeys;
	   this.color=color;
	   System.out.println("color of  keyboard discribe:"+color);
  }
  Keyboard(String type,double cost)
  {
      this.type=type;
	  this.cost=cost;
	  System.out.println("type of keyboard show:"+type);
  }
  Keyboard(double cost)
  {
	 this.cost=cost;
	  System.out.println("cost of keyboard:"+cost);
  }
}