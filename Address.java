class Address{

	String street="btm";
	long pincode=577528;
	City city;

	Address(){

		System.out.println("created Address using no arg const....");
	}
	void setCity(City city){
		this.city=city;
	}
	void show(){

		System.out.println("Starting show in Address");
		System.out.println("Street name is "+this.street);
		System.out.println("Street pincode is "+this.pincode);
		System.out.println("Street city is "+this.city);
		if(city!=null){
			city.show();
		}

		System.out.println("Ending show in Address");
	}
}