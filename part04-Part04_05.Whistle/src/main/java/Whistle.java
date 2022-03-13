public class Whistle{
  private String whistleKind;

  public Whistle(String name){
    this.whistleKind = name;
  }
  
  public void sound(){
    System.out.println(this.whistleKind);
  }
}