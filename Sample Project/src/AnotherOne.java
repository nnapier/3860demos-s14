import java.util.Scanner;

/** Class: AnotherOne
 *  @author Nannette Napier
 *  @version 1.0
 *  Course : ITEC 3860 Spring 2014
 *  Written: Jan 7, 2014
 *
 *  This class is just an example of something I wanted to
 *  show my students
 * 
 *  Purpose: --
 */

/**
 * @author nnapier
 *
 */
public class AnotherOne
{
	public static final int MAX_LENGTH = 30;

	public int countIt(String name)
	{
		int result = 0;
		
		if (name.length() > MAX_LENGTH)
		{
			result = MAX_LENGTH;
		}
		else
		{	
			int count = 0;
			for (int i=0; i<5; i++)
			{
				if (i == 3)
				{
					result= 3;
				}
			}
		}

		return result;
		
	}
	/** Method: main
	 *  *description*
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("This is a very long line of text " +
		         "that I should really wrap rather than keep going");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the file you want?");
		String name = keyboard.nextLine();
		System.out.println("Open the " + name +" now");
		
		
	}

}
