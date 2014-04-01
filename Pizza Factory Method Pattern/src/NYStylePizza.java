/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class NYStylePizza extends Pizza
{
	public NYStylePizza()
	{
		super("NY Style Sauce and Cheese Pizza",
		      "Thin Crust dough",
		      "Marinara Sauce");
		addTopping("Extra Cheese");
	}
	
	/**
	 * Describes how the pizza should be packaged
	 */
	@Override
	public void box()
	{
		System.out.println("Place in White box with Red letters");
	}
	
	@Override
	public String toString()
	{
		return "\tNYStylePizza: \n\t" + super.toString();
	}

}
