/**
 * 
 */

/**
 * @author nnapier
 *
 */
public abstract class AbstractPetCreator
{
	abstract Pet createPet(String args);
	
	public void describePet(String args)
	{
		Pet myPet = createPet(args);
		System.out.println("Sound your pet makes: ");
		myPet.speak();
		System.out.println("How your pet moves: ");
		myPet.move();
	}
}
