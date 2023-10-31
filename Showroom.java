class Showroom
{
  String company="Renult";
  int noOfcars;
  String Managername="Sush";
  double cost;
  String name="Shreya";
  int noOfemployes;
  short noOfworkers;
  long contactnumber;
  
  
  Showroom()
  {
	  System.out.println("Starting show inside showroom");
  }
  Showroom(String company)
  {
	  this.company=company;
	  System.out.println("company name of cars in the showroom:"+company);
  }
  Showroom(int noOfcars)
  {
	  this.noOfcars=noOfcars;
	  System.out.println("noOfcars in showroom:"+noOfcars);
  }
  Showroom(String Managername,int noOfcars)
  {
	  this.Managername=Managername;
	  System.out.println("manager name :"+Managername);
  }
  Showroom(double cost)
  {
	  this.cost=cost;
	  System.out.println("cost of the cars in showroom:"+cost);
  }
  Showroom(String name,long contactnumber)
  {
	  this.name=name;
	  System.out.println("name of the showroom:"+name);
  }
  Showroom(int noOfemployes,String Managername)
  {
	  this.noOfemployes=noOfemployes;
	   System.out.println("noOfemployes in showroom:"+noOfemployes);
  }
  Showroom(short noOfworkers)
  {
	 this.noOfworkers=noOfworkers;
 System.out.println("noOfworkers showroom:"+noOfworkers);	 
  }
  Showroom(long contactnumber)
  {
	  this.contactnumber=contactnumber;
	   System.out.println("contactnumber of the showroom:"+contactnumber);
  }
}