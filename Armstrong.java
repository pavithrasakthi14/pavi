import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int n,c=0,a,temp;
n=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
{
System.out.println("Armstrong number");
else
System.out.println("Not Armstrong number");
}
}
}
