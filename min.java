import java.util.*;
class min
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  int n=sc.nextInt();
  System.out.println("enter number of digits");
  int k=sc.nextInt();
  StringBuffer sb=new StringBuffer(n);
  String s=sb.toString();
  char c[]=s.toCharArray();
  Arrays.sort(c);
  sb=new StringBuffer();
  for(int i=0;i<c.length;i++)
   sb.append(c[i]);
  sb.delete(sb.length()-k,sb.length());
  System.out.println(sb);
 }
} 
