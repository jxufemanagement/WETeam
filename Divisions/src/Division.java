
public class Division {
	public static void main(String[] args) {
      String str="192=168=0=1";
      String firstarray[]=str.split("=");
      String secondarray[]=str.split("=",2);
      System.out.println("str��ԭֵΪ:["+str+"]");
      System.out.println("ȫ���ָ���:");
      for(String a:firstarray) {
    	   System.out.print("["+a+"]  ");
      }
      System.out.println();
      System.out.println("�ָ����ν��:");
      for(String a:secondarray) {
    	  System.out.print("["+a+"]  ");
      }
	}

}
