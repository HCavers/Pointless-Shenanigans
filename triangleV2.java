//Me doing even more random stuff
import java.io.*;

class triangleV2
{
	public static void main(String[] args)
	{
		//Always need a try catch just in case of full blown exceptions
		try
		{
			//Get the argument passed into a better form
			int lines = Integer.parseInt(args[0]);
			int width = (2 * lines) - 1; 
			//Create loop to do all the lines needed
			for(int i = 1; i <= lines; i++)
			{
				//Create loop to make the needed indent before x's and o's come in
				int indent = (width - ((2 * i) - 1)) / 2;
				for(int k = 1; k <= indent; k++)
				{
					//Print out the spaces needed to make the indent
					System.out.print(" ");
				}
				
				//Create loop to create the x's and o's
				for(int j = 1; j <= i; j++)
				{
					if(j % 2 == 1)
					{
						//Odd number so print out a 'x'
						System.out.print("x");
					}
					else
					{
						//Even Number so print out an 'o'
						System.out.print("o");
					}
					
					//Put a space in afterwards UNLESS we're at the end of the line
					if(j < i)
					{
						System.out.print(" "); 
					}
				}
				
				//At the end of a line so make sure that we push to the next line
				System.out.print("\n");
				
			}
		}
		catch(Exception ex)
		{
			//Display error message and return without doing anything
			System.err.println("Oh Dam");
			return;
		}
	}
}
