import java.util.*;
class divide
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.prinln("enter number of elements");
  int n=sc.nextInt();
  int arr[]=new int[n];
  StringBuffer sb=new StringBuffer();
  int count=0;
  for(int i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
   sb.append(arr[i]);
  }
  String s=sb.toString();
  for(int i=1;i<s.length();i++)
  {
   String s1="";
   String s2="";
   s1=s.subString(0,i);
   s2=s.subString(i,s.length());
   int a1=Integer.parseInt(s1);
   int a2=Integer.parseint(s2);
   int temp=0;
   while(a1>0)
   {
    int t=a1%10;
    temp=temp+t;
    a1=a1/10;
   }
   a1=temp;
   temp=0;
   t=0;
   while(a1>0)
   {
    t=a1%10;
    temp=temp+t;
    a2=a2/10;
   }
   a2=temp;
   if(a1==a2)
   {
   System.out.println(s1+" "+s2);
   count++;
   }
  }
  if(count==0)
   System.out.println("Not possible");
 }
}    
