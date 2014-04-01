import java.util.Scanner;

/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class FactoryTester
{
	private static AbstractPetCreator creator;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if (args != null && args.length >=1)
		{
			creator = new DuckCreator();
		}
		else
		{
			creator = new FishCreator();
		}
		
		creator.describePet("");
	}

}
