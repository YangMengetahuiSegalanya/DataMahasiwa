public class DemoStrBuf
{
 public static void main(String [] args){
 StringBuffer sb1 = new StringBuffer("Manchester ");
 StringBuffer sb2 = new StringBuffer("United");
 sb1.append(sb2);
 System.out.println(sb1);
 sb1.delete(0,3);
 System.out.println(sb1);
 sb1.insert(0, "Man");
 System.out.println(sb1);
 }
}
