class static3{
	static double balance;
	public static void main(String args[]){
	credit(1000);
	debit(500);
	}
	public static void debit(double amt){
		if(amt>0 && balance-amt>0){
			balance-=amt;
			System.out.println("amount debited");
			System.out.println("your current amount is:"+balance);
		}
			}
			public static void credit(double amt){
				if(amt>0){
			  balance+=amt;
			  System.out.println("amount credited successfully");
			  System.out.println("current amount is:"+balance);
				}
			}
}
