
public class Division {
	public static void main(String[] args) {
      String str="192=168=0=1";
      String firstarray[]=str.split("=");
      String secondarray[]=str.split("=",2);
      System.out.println("str的原值为:["+str+"]");
      System.out.println("全部分割结果:");
      for(String a:firstarray) {
    	   System.out.print("["+a+"]  ");
      }
      System.out.println();
      System.out.println("分割两次结果:");
      for(String a:secondarray) {
    	  System.out.print("["+a+"]  ");
      }
	}

}
