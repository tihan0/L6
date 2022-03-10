public class human {
    int countOfHands;
    int countOfFoot;
    boolean  isMan;


  public human (int countOFHands, int countOFFoot, boolean isMan){
        this.countOfHands=countOFHands;
        this.countOfFoot=countOFFoot;
        this.isMan=isMan;
  }
  public void say(){
      System.out.println("hello, i'm a man - "+ isMan);
  }

  public int sumCountOfHandsAndFeet(){
      return countOfFoot + countOfHands;
  }
}
