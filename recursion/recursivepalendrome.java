public class recursivepalendrome {
  public static void main(String[] args) {
  System.out.println(  reverse(11411, 11411, 0));
  }
  public static boolean reverse(int num,int temp,int rev){
    if(num==0){
     return rev==temp;
    }
    else{
      rev=rev*10+num%10;
     return  reverse(num/10,temp,rev);
    }
  }
}
