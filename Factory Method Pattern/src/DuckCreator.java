/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class DuckCreator extends AbstractPetCreator
{

	/* (non-Javadoc)
	 * @see AbstractPetCreator#createPet(java.lang.String)
	 */
	@Override
	Pet createPet(String args)
	{
		// Argument is the duck name.
		// Pass along to the parameter
		System.out.println("--> Creating a duck");
		return new Duck(args);
	}

}
