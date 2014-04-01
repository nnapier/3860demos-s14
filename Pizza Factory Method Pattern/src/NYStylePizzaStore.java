/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class NYStylePizzaStore extends PizzaStore
{

	/* (non-Javadoc)
	 * @see PizzaStore#createPizza()
	 */
	@Override
	public Pizza createPizza()
	{
		// This creates NYStylePizza objects
		
		return new NYStylePizza();
	}

}
