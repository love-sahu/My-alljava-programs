interface Vehicle{
void typeOfVehicle();
void settingCapacity();
void topSpeed();
void fuelType();
}

class Bike implements Vehicle
{   		@Override
	public void typeOfVehicle(){
	System.out.println("Sport-bike");
	}
	@Override
	public void settingCapacity(){
		System.out.println("4 person");
	}
	@Override
		public void topSpeed(){
		System.out.println("400km/hr");
	}
	@Override
	public void fuelType(){
		System.out.println("Diesel");
	}
}
class Car implements Vehicle
{   
			@Override
	public void typeOfVehicle(){
		System.out.println("Sport-Car");
	}
	@Override
	public void settingCapacity(){
		System.out.println("8 person");
	}
	@Override
		public void topSpeed(){
		System.out.println("200km/hr");
	}
	@Override
	public void fuelType(){
		System.out.println("petrol");
	}	
}

class VehicleDriver{
	public static void main(String args[]){
	Bike obj=new Bike();
	obj.typeOfVehicle();
	obj.settingCapacity();
	obj.topSpeed();
	obj.fuelType();
	
	Car obj2=new Car();
	obj2.typeOfVehicle();
	obj2.settingCapacity();
	obj2.topSpeed();
	obj2.fuelType();
}
}