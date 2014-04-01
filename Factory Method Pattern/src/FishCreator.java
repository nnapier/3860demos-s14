/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class FishCreator extends AbstractPetCreator
{

	/* (non-Javadoc)
	 * @see AbstractPetCreator#createPet(java.lang.String)
	 */
	@Override
	Pet createPet(String args)
	{
		System.out.println("--> Creating a fish");
		return new Fish(args);
	}

}
