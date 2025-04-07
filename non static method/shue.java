class shue{
	String brand="NIKIE";
	double price=100;
	{
		if(brand.charAt(0)=='N'){
			price=10000;
		}
		else{
			price=5000;
		}
	}
	public void display(){
		System.out.println(brand);
		System.out.println(price);
	}
}