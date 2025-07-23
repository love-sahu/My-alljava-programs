class firstnonRepeatingcharOfString 
{
	public static void main(String[] args) 
	{
		String str="kakafromfarmer";
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j))count++;
			}
			System.out.println(str.charAt(i)+": "+count);
		}
	}
}
