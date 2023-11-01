class Makeupkit
{
   String company;
   int noOfitems;
   double cost;
   float noOfbrushes;
   
   Makeupkit()
   {
	   super();
   }
   Makeupkit(String company)
   {
	   super();
	   this.company=company;
	   System.out.println("company of the Makeupkit:"+company);
   }
   Makeupkit(int noOfitems)
   {
	   super();
	   this.noOfitems=noOfitems;
	   System.out.println("noOfitems of the Makeupkit:"+noOfitems);
   }
   
   Makeupkit(double cost)
   {
	   super();
	   this.cost=cost;
	   System.out.println("cost of the Makeupkit:"+cost);
   }
   Makeupkit( float noOfbrushes)
   {
	   super();
	   this.noOfbrushes=noOfbrushes;
	   System.out.println("noOfbrushes of the Makeupkit:"+noOfbrushes);
   }
   
   
   
}