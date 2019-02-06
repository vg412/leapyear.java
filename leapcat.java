/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	
int year;
Scanner scan =new Scanner (System.in);
System.out.println("Enter any year:");
year =scan.nextInt();
scan.close();
boolean isleap = false;

        if( year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                
                if ( year % 400 == 0)
                    isleap = true;
                else
                    isleap = false;
            }
            else
                isleap = true;
        }
        else{
           isleap = false;
        }

        if(isleap==true)
        {
            System.out.println( " leap year.");
        }
        else
        {
            System.out.println(" not a leap year.");
    }
}
}
