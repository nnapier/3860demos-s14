/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class ChicagoStylePizzaStore extends PizzaStore
{

	/* (non-Javadoc)
	 * @see PizzaStore#createPizza()
	 */
	@Override
	public Pizza createPizza()
	{
		// TODO Auto-generated method stub
		return new ChicagoStylePizza();
	}

}
