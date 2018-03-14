//Me doing even more random stuff
import java.io.*;

class coolTriangle
{
	public static void main(String[] args)
	{
		//Always need a try catch just in case of full blown exceptions
		try
		{
			//Get the argument passed into a better form
			int lines = Integer.parseInt(args[0]);
			int width = (2 * lines) - 1; 
			
			//Find out how many triangles we have to deal with
			int numTri = numTriangles(lines);
			System.out.println(numTri);
			
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
					//Want a hollow triangle so only print if j is one or equal to i 
					//UNLESS it's the final line in which case do the whole thing
					if(triangleBase(i,j,numTri,lines))
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
					}
					else
					{
						//otherwise put a space in to fill the gaps
						System.out.print(" ");  
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
	
	public static int numTriangles(int height)
	{
		//Have a variable to keep track of the triangles
		int count = 1;
		
		//Minimum height to have another triangle is 7
		if(height < 7)
		{
			return count;
		}
		
		//Otherwise you get a new triangle every 6 lines
		int runningHeight = height;
		while(runningHeight >= 6)
		{
			//Add to count as another triangle can fit
			count++;
			//Remove another 6 from the running height
			runningHeight = runningHeight - 6;
		}
		
		//Can't fit another triangle we have finished our count
		return count;
	}
	
	public static boolean triangleBase(int currentLine, int positionInLine, int numTriangles, int totalHeight)
	{
		//Check if we are currently on a base line of a triangle or not
		if(currentLine == totalHeight)
		{
			//On the very bottom line so yes we are printing here
			return true;
		}
		
		//Now we loop for the number of triangles to see if we could be on a base line of an inner triangle
		for(int k = 1; k < numTriangles; k++)
		{
			if((totalHeight - (2 * k)) == currentLine)
			{
				//So we are on a baseline but we may be too close to the edges for this particular triangle
				if((positionInLine <= (currentLine - 2 * k)) && (positionInLine > 2 * k))
				{
					//IT IS in the right part of the line for the specific triangle base so we do print
					return true;
				}
			}
		}
		
		//If we're here we are not on the base of a triangle however we could be on one of the side of the triangles
		if(positionInLine == currentLine || positionInLine == 1)
		{
			//On the side of the first big triangle
			return true;
		}
		
		boolean escapeFlag = true;
		//Now to check if we are on the inside of one of the interior triangles
		for(int l = 1; l < numTriangles && escapeFlag == true; l++)
		{
			//System.out.print("*");
			if(positionInLine == 1 + 2 * l || positionInLine == currentLine - 2 * l)
			{
				//We are on the side of one of the interior triangles so we're good to go
				return true;
			}
		}
		return false;
	}
}