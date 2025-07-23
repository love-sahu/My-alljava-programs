class frequencyOfStringChar 
{
	public static void main(String[] args) 
	{
		String str="kakafromfarmer";
		boolean arr[]=new boolean [str.length()];
		for(int i=0;i<str.length();i++){
			int count=0;
			if(!arr[i]==false)continue;
			for(int j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j) ){
					count++;
					arr[j]=true;
			}
		}
		System.out.println(str.charAt(i)+": "+count);
	}
}
}