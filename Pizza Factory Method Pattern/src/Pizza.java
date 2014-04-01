import java.util.ArrayList;

/**
 * 
 */

/**
 * @author nnapier
 *
 */
public abstract class Pizza
{
	private String name;
	private String dough;
	private String sauce;
	private ArrayList<String> toppings;
	
	/**
	 * No-arg constructor for pizza
	 */
	public Pizza()
	{
		this("Plain", "Regular dough", "red");	
	}
	
	/**
	 * Constructor that takes 3 arguments
	 * @param name	Name of pizza
	 * @param dough	Type of dough
	 * @param sauce	Type of sauce
	 */
	public Pizza(String name, String dough, String sauce)
	{
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		toppings = new ArrayList<String>();
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the dough
	 */
	public String getDough()
	{
		return dough;
	}

	/**
	 * @param dough the dough to set
	 */
	public void setDough(String dough)
	{
		this.dough = dough;
	}

	/**
	 * @return the sauce
	 */
	public String getSauce()
	{
		return sauce;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce)
	{
		this.sauce = sauce;
	}

	/**
	 * @return the toppings
	 */
	public ArrayList<String> getToppings()
	{
		return toppings;
	}

	/**
	 * @param toppings the toppings to set
	 */
	public void setToppings(ArrayList<String> toppings)
	{
		this.toppings = toppings;
	}
	
	/** 
	 * Allows you to add a topping to your pizza
	 * @param topping Topping to be added
	 */
	public void addTopping(String topping)
	{
		toppings.add(topping);
	}

	/**
	 * Describes steps required to prepare the pizza
	 */
	public void prepare()
	{
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...." + dough);
		System.out.println("Adding sauce...." + sauce);
		System.out.println("Adding toppings: " );
		for (String topping : toppings)
		{
			System.out.println("-- " + topping);
		}
	}

	/**
	 * Describes how to bake the pizza
	 */
	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}
	
	/**
	 * Describes how the pizza should be cut
	 */
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	/**
	 * Describes how the pizza should be packaged
	 */
	public void box()
	{
		System.out.println("Place in official box");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Pizza [name=" + name + ", dough=" + dough + ",\n\t sauce=" + sauce
				+ ", toppings=" + toppings + "]";
	}
	
	
}
