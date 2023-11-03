class Month
{
String name;
int noOfDays;
int noOfWeekEnds;
int noOfHolidays;

Month()
{
	
}
Month(String name,int noOfDays,int noOfWeekEnds,int noOfHolidays)
{
	this.name=name;
	this.noOfDays=noOfDays;
	this.noOfWeekEnds=noOfWeekEnds;
	this.noOfHolidays=noOfHolidays;
	
	System.out.println(" name :"+this.name);
	System.out.println(" noOfDays :"+this.noOfDays);
	System.out.println(" noOfWeekEnds :"+this.noOfWeekEnds);
	System.out.println(" noOfHolidays :"+this.noOfHolidays);	
}
void displayMonth()
{
	System.out.println(" name :"+this.name);
	System.out.println(" noOfDays :"+this.noOfDays);
	System.out.println(" noOfWeekEnds :"+this.noOfWeekEnds);
	System.out.println(" noOfHolidays :"+this.noOfHolidays);
}

}