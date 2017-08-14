import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])throws IOException
{
int i,count=0;
 Scanner scan = new Scanner(System.in);
	  System.out.print("Enter a Number : ");
        //num = scan.nextInt();
		
        for(i=10; i<50; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
