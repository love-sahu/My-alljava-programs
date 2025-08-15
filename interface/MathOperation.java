@FunctionalInterface
interface MathOperation{
	double pow(int num,int power);
}
class opration implements MathOperation 
{
	@Override
	public  double pow(int n,int pow){
		double power=1;
		for(int i=1;i<=pow;i++){
			power*=n;
		}
		return power;
	}
}
class Driver 
{
	public static void main(String[] args) 
	{
		opration obj=new opration();
		System.out.println(obj.pow(5,5));
    
	}
}
