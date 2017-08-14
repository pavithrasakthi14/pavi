import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int n,count=0,a,b,c,sum=0;
n=sc.nextInt();
for(i=50;i<100;i++)
{
n=i;
{
while(n>0)
{
b=n%10;
sum=sum+(b*b*b);
n=n/10;
}
if(sum==i)
{
System.out.println(sum+" ");
}
}
}
}
}



