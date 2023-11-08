class PersonStarting{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Email[] email= new Email[4];

		email[0]=new Email("email.com",171,"Sush","Sk");
		email[1]=new Email("gmail.com",177,"deeps","ks");
		email[2]=new Email("yahoo.com",717,"riya","M");
		email[3]=new Email("facebook.com",771,"Krish","S");

		Person person = new Person("Shree",email);
		person.showInfo();

		System.out.println("Ending main");
	}
}