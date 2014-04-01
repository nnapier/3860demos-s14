/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class ChicagoStylePizza extends Pizza
{
	public ChicagoStylePizza()
	{
		super("Chicago Style Deep Dish Cheese Pizza",
		      "Extra Thick Crust dough",
		      "Plum Tomato Sauce");
		addTopping("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cut pizza into SQUARES");
	}
	
	@Override
	public void bake()
	{
		System.out.println("Bake for 50 minutes at 375");
	}
	

	@Override
	public String toString()
	{
		return "\tChicagoStylePizza: \n\t" + super.toString();
	}
}

