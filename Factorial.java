import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
int no, fact=1;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter any number :");
	no=s.nextInt();
    for(int i=1; i<=no; i++)
	{
	fact=fact*i;
	}
	System.out.println("Factorial is :" +fact);
	}
}
