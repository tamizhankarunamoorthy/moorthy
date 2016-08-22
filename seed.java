import java.util.*;
class seed
{
 public static void main(String args[])
 {
 Scanner sc=new Scaneer(System.in);
 System.out.println("enter number");
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
 int x=1;
 int j=i;
 while(j>0)
 {
 int temp=j%10;
 x=x*temp;
 j=j/10;
 }
 if(x*i==n)
   System.out.println(i);
 }
 }
} 
