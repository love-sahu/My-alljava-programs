public class lcm {
  public static void main(String[] args) {
System.out.println(lcm(4,6));
  }

  public static int lcm(int n1,int n2){ //4,6
    int max=n1>n2?n1:n2;
    int i=1;
    while (true) {  
    if((max*i)%n1==0 && (max*i)%n2==0){
      return max*i;
    }
    i++;
    }
  }
}
