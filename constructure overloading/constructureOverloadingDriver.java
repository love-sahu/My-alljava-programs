import java.util.Scanner;
class  GoogleAccount
{
	String firstName;
	String lastName;
	String email;
	String gender;
	String adress;
	
	GoogleAccount(String firstName,String lastName,String email){
		this(firstName,lastName,email,"i dont want to specify","Na");
	}
	GoogleAccount(String firstName,String lastName, String email,String gender){
		this(firstName,lastName,email,gender,"Na");
	}
		GoogleAccount(String firstName,String lastName){
			this(firstName,lastName,"","","");
	}
	
	GoogleAccount(String firstName,String lastName, String email,String gender,String adress){
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.gender=gender;
		this.adress=adress;
	}
	public void display(){
		System.out.println("firstName :"+firstName);
		System.out.println("lastName :"+lastName);
		System.out.println("email :"+email);
	    System.out.println("adress :"+adress);
		System.out.println("gender :"+gender);
		System.out.println("------------------------------------------------");
	}
}

class constructureOverloadingDriver 
{
	public static void main(String[] args) 
	{
	
		GoogleAccount obj1=new GoogleAccount("love","sahu","lovevsahi2003@gmail.com",
		"M","pune maharashtra");
		obj1.display();
		
			GoogleAccount obj2=new GoogleAccount("kush","sahu","kushvsahi2003@gmail.com");
		obj2.display();
		
				GoogleAccount obj3=new GoogleAccount("aryana","jaiswal","aryanajaiswal03@gmail.com","female");
		obj3.display();
		
			GoogleAccount obj4=new GoogleAccount("akshay","patil");
		obj4.display();
	}
}
