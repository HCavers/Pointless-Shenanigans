//Me doing even more random stuff
import java.io.*;

class squares
{
	public static void main(String[] args)
	{
		//Create a try catch for full blown explosiions
		try
		{
			//Get the argument passed into a better form
			int height = Integer.parseInt(args[0]);
			
			//Create a loop to create all the lines
			for(int i = 0; 1 < height; i++)
			{
				//Print out either an 'x' or an 'o'
				if(i % 2 == 0)
				{
					System.out.print()
				}
			}
		}
		catch(Exception ex)
		{
			//Display error message and return without doing anything
			System.err.println("Please pass a number c'mon");
			return;
		}
	}
}
