//Me doing random stuff
import java.io.*;

class triangle
{
	public static void main(String[] args)
	{
		//Always need a try catch just in case of full blown exceptions
		try
		{
			//Get the argument passed into a better form
			int lines = Integer.parseInt(args[0]);
			int width = (2 * lines) - 1;
			//loop for each line after another
			for(int i = 0; i < lines; i++)
			{
				//Need to know each lines indent on each side
				int indent = (width - ((2 * (i + 1)) -1))/2; 
				//loop for each line itself
				for(int j = 0; j < width; j++)
				{
					if(indent == 0)
					{
						//To do a solid bottom line at the end of the triangle
						if(j % 2 == 0)
						{
							if(j % 4 == 0)
							{
								System.out.print("x");
							}
							else
							{
								System.out.print("o");
							}
						}	
						else
						{
							System.out.print(" ");
						}
					}
					else if((j >= indent && j <= width - (indent + 1)) && (j + i +1) % 2 == 0 )
					{
						if((j + i - 1) % 4 == 0)
						{
							System.out.print("x");
						}
						else
						{
							System.out.print("o");
						}	
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				//start a new line
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
