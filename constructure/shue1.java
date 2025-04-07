class shue1 {
	String brand = "reobbk";
	String color;
	String type;
	double price;
	int size;

	{
		this.display();

		System.out.println("non static block starts");

		if (brand.charAt(0) == 'r') {
			price = 100;
		} else {
			price = 50;
		}

		System.out.println("non static block ends");
	}

	shue1() {
	}

	shue1(String color, String type, int size, double price) {

		this.color = color;
		this.price = price;
		this.size = size;
		this.type = type;
	}

	public void display() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(type);
		System.out.println(size);
	}
}
