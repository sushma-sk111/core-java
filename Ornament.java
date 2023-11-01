class Ornament
{
   double cost;
   String color;
   String types;
   long weight;
   
   Ornament()
   {
	   super();
   }
   Ornament(double cost)
   {
	   super();
	   this.cost=cost;
	   System.out.println("cost of the ornament:"+cost);
   }
   Ornament( String color)
   {
	   super();
	   this.color=color;
	   System.out.println("color of the ornament:"+color);
   }
   Ornament( String types,double cost)
   {
	   super();
	   this.types=types;
	   System.out.println("types of the ornament:"+types);
   }
    Ornament( long weight)
   {
	   super();
	   this.weight=weight;
	   System.out.println("weightof the ornament:"+weight);
   }
}