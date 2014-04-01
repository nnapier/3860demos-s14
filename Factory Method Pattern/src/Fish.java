/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class Fish implements Pet
{

	private String type; 
	
	public Fish()
	{
		type = "regular";
	}
	
	public Fish(String type)
	{
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see Pet#speak()
	 */
	@Override
	public void speak()
	{
		System.out.println("Fish says gulp");

	}

	/* (non-Javadoc)
	 * @see Pet#move()
	 */
	@Override
	public void move()
	{
		System.out.println("Fish swims");

	}

}
