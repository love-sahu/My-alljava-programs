public class censes {
  public static void main (String [] args){
    long currentpop=312032486;
    final long seconds = (365 * 24 * 60 * 60) * 5;// five years second
    long birth = seconds / 7;
    long death = seconds / 13;
    long imm = seconds / 45;
    long newpop = currentpop + birth + imm - death;
    System.out.println(currentpop);
    System.out.println(newpop);
  }
}
