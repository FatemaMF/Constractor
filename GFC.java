import java.io.*;

import pacj3.Geek3;

public class GFC
{
	public static void main(String[] args)
	{
		// Creating the objects of the class named 'Geek'
		// by passing different arguments
		// Invoke the constructor with one argument of
		// type 'String'.
		
		//Geek geek2 = new Geek("Shikhar");
		
		// Invoke the constructor with two arguments
		
		Geek3 g3 = new Geek3(26,"Dharmesh");
		Cconstractor c1= new Cconstractor(11.2, 23.6);
		Cconstractor c2= new Cconstractor(c1);
Cconstractor c3=c1;		
		// Invoke the constructor with one argument of
		// type 'Long'.
		
		//Geek geek4 = new Geek(325614567);
		System.out.println("test1");
	}
}
