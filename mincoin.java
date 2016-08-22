import java.util.*;
class mincoin
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number of coins");
  int n=sc.nextInt();
  System.out.println("enter coins");
  for(int i=0;i<n;i++)
   arr[i]=sc.nextInt();
  System.out.println("enter sum");
  int sum=sc.nextInt();
  int temp=0;
  int count=0;
  for(int i=arr.length-1;i>0;i--)
  {
   temp=sum/arr[i];
   sum=sum%arr[i];
   count=count+temp;
   if(sum==0)
    break;
  }
  System.out.println(count);
 }
}
